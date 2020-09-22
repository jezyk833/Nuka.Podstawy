package Podstawy.nauka;

import java.util.Scanner;

public class RemoteControl {
    Scanner sc = new Scanner(System.in);
    boolean isTVOn = false;
    int channel = 1;
    int volume = 0;
    String[] channels = new String[]{"TVP1", "TVN", "POLSAT", "PULS", "MTV", "CANAL+", "HBO", "DISCOVERY", "DOMO", "MINIMINI"};

    public void standby() {
        int maxChannel = channels.length;

        System.out.println("TV is OFF");
        System.out.println("STANDBY");
        System.out.println("Wpisz ON aby włączyć TV");

        String turn = sc.next();
        if (turn.equals("ON")) {
            isTVOn = true;
            System.out.println("TV is ON");
        } else System.out.println("TV is OFF");

        while (isTVOn) {
            displayMenu();

            System.out.println("Wciśnij przycisk");
            String button = sc.next();
            switch (button) {
                case "UP":
                    if (channel >= maxChannel) {
                        channel = 1;
                        printCurrentChannel();
                        break;
                    } else
                        channel++;
                    System.out.println("Kanał numer:" + channel);
                    break;
                case "DOWN":
                    if (channel <= 1) {
                        channel = maxChannel;
                        printCurrentChannel();
                        break;
                    } else
                        channel--;
                    System.out.println("Kanał numer:" + channel);
                    break;
                case "VolUP":
                    if (volume == 20) {
                        System.out.println("Głośność MAX " + volume);
                    } else
                        volume++;
                    System.out.println("Głośność: " + volume);
                    break;
                case "VolDN":
                    if (volume == 0) {
                        System.out.println("BRAK DŹWIĘKU");
                    } else
                        volume--;
                    System.out.println("Głośność: " + volume);
                    break;
                case "MUTE":
                    volume = 0;
                    System.out.println("BRAK DŹWIĘKU");
                    break;
                case "OFF":
                    isTVOn = false;
                    break;
                case "LIST":
                    printAllChannels();
                    break;

            }
            try {
                int readChannelNumber = Integer.parseInt(button);
                if (readChannelNumber > 0 && readChannelNumber <= maxChannel) {
                    channel = readChannelNumber;
                    printCurrentChannel();
                }
            } catch (NumberFormatException e) {

            }
        }
    }

    private void printAllChannels() {
        for (int i = 0; i < channels.length; i++) {
            int channelNumber = i + 1;
            System.out.println("KANAŁ " + channelNumber + " - " + channels[i]);
        }
    }

    private void printCurrentChannel() {
        String channelName = channels[channel - 1];
        System.out.println("Kanał numer: " + channel + " - " + channelName + "\n");
    }

    private void displayMenu() {
        int maxChannel = channels.length;

        System.out.println("Masz do dyspozycji 10 kanałów i zakres głośności od 0-20\n" +
                "Wciśnij na pilocie 'UP' i zmień kanał o jeden w góre\n" +
                "Wciśnij na pilocie 'DOWN' i zmień kanał o jeden w dół\n" +
                "Wciśnij na pliocie 'VolUP' i zwiększ głosność o jeden w góre\n" +
                "Wciśnij na pilocie 'VolDN' i zmniejsz głośność o jeden w dół\n" +
                "Wciśnij na pilocie 'MUTE' i wyłącz głos\n" +
                "Wciśnij na pilocie cyfry od 1-" + maxChannel + " zmień kanał\n" +
                "Wcśinij na pilocie 'OFF' i wyłącz TV\n" +
                "Wciśnij na pilocie 'LIST' zobaczysz liste kanałów\n"
        );
    }

}


