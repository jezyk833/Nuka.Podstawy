package Podstawy.nauka;

import java.util.Scanner;

public class RemoteControl {
	Scanner sc = new Scanner(System.in);
	boolean standby = false;
	int channel =1;
	int volume=0;
	String[] tab =new String[] {"TVP1","TVN","POLSAT","PULS","MTV","CANAL+","HBO","DISCOVERY","DOMO","MINIMINI" };
		
	public void standby() {
		System.out.println("TV is OFF");
		System.out.println("STANDBY");
		
		String turn=sc.next();
			if(turn.equals("on")) {
			standby=true;
			System.out.println("TV is ON");
			} else System.out.println("TV is OFF");
			
	while(standby){
		System.out.println("Masz do dyspozycji 10 kanałów i zakres głośności od 0-20\n"+
						   "Wciśnij na pilocie 'UP' i zmień kanał o jeden w góre\n"+
						   "Wciśnij na pilocie 'DOWN' i zmień kanał o jeden w dół\n"+
						   "Wciśnij na pliocie 'VolUP' i zwiększ głosność o jeden w góre\n"+
						   "Wciśnij na pilocie 'VolDN' i zmniejsz głośność o jeden w dół\n"+
						   "Wciśnij na pilocie 'MUTE' i wyłącz głos\n"+
						   "Wciśnij na pilocie cyfry od 1-15 zmień kanał\n"+
						   "Wcśinij na pilocie 'OFF' i wyłącz TV\n"+
						   "Wciśnij na pilocie 'LIST' zobaczysz liste kanałów\n"
				);
		System.out.println("Wciśnij przycisk");
		String button =sc.next();
			switch(button) {
			case "UP": 
				if(channel>=10) {
					channel=1; 
					System.out.println("Kanał numer:"+ channel +tab[0]);
					break;
				}else 					
					channel++;
					System.out.println("Kanał numer:"+ channel);
					break;
			case "DOWN": 
				if(channel<=1) {
					channel=10; 
					System.out.println("Kanał numer:"+ channel +tab[9]);
					break;
				}else 
					channel--; 
					System.out.println("Kanał numer:"+ channel);
					break;
			case "VolUP":
				if(volume==20) {
					System.out.println("Głośność MAX "+ volume);
				}else 
					volume++; 
					System.out.println("Głośność: "+ volume);
					break;
			case "VolDN":
				if(volume==0) { 
					System.out.println("BRAK DŹWIĘKU");
				}else 
					volume--; 
					System.out.println("Głośność: "+ volume);
					break;
			case "MUTE": volume=0; System.out.println("BRAK DŹWIĘKU"); break;
			case "1": 
				channel=1;
				System.out.println(tab[0]);
				break;
			case "2":
				channel=2;
				System.out.println(tab[1]);
				break;
			case "3": 
				channel=3;
				System.out.println(tab[2]);
				break;
			case "4": 
				channel=4;
				System.out.println(tab[3]);
				break;
			case "5": 
				channel=5;
				System.out.println(tab[4]);
				break;
			case "6":
				channel=6;
				System.out.println(tab[5]);
				break;
			case "7": 
				channel=7;
				System.out.println(tab[6]);
				break;
			case "8": 
				channel=8;
				System.out.println(tab[7]);
				break;
			case "9": 
				channel=9;
				System.out.println(tab[8]);
				break;
			case "10": 
				channel=10;
				System.out.println(tab[9]);
				break;
			case "LIST":System.out.println("KANAŁ 1 - "+tab[0]+" \n"+
										   "KANAŁ 2 - "+tab[1]+" \n"+
										   "KANAŁ 3 - "+tab[2]+" \n"+
										   "KANAŁ 4 - "+tab[3]+" \n"+
										   "KANAŁ 5 - "+tab[4]+" \n"+
										   "KANAŁ 6 - "+tab[5]+" \n"+
										   "KANAŁ 7 - "+tab[6]+" \n"+
										   "KANAŁ 8 - "+tab[7]+" \n"+
										   "KANAŁ 9 - "+tab[8]+" \n"+
										   "KANAŁ 10 - "+tab[9]+" \n");
				break;
			
			}
	
		}
	}

}
