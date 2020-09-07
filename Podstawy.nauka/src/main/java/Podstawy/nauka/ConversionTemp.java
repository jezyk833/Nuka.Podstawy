package Podstawy.nauka;

import java.util.Scanner;
// Porogram konwertujacy temperatue z trzech różnych skal: Celsjusza, Kelvina,Farenheita.

public class ConversionTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Podaj jaką jednostkę przeliczyć temperatury:  ");
		System.out.println("C-celsjusz");
		System.out.println("F Farenheit");
		System.out.println("K-Kelwin");
		String unit =sc.nextLine();
		switch(unit) {
			case "C":
				System.out.println("Podaj na jaką jednostke chcesz zrobić konwersje:");
				System.out.println("F-Farenheit");
				System.out.println("K-Kelwin");
				String scale =sc.nextLine();
				if (scale.equals("F")) {
					System.out.println("Podaj temperature w stopniach Celsjusza: ");
					double temp=sc.nextDouble();
					double score=(temp * 1.8)+32.0;
					System.out.println("Temperatura w stopniach Celsjusza: "+ temp);
					System.out.println("Tempertaura W stopniach Farenheitach: " + score);
					
				} else {
					System.out.println("Podaj temperature w stopniach Celsjusza: ");
					double temp=sc.nextDouble();
					double score=temp +273.15;
					System.out.println("Temperatura w stopniach Celsjusza: "+ temp);					
					System.out.println("Temperatura w stopniach Kelwina: "+ score);
					
				}				
			break;
			case "F":
				System.out.println("Podaj na jaką jednostke chcesz zrobić konwersje:");
				System.out.println("C-Celsjusz");
				System.out.println("K-Kelwin");
				String scale2 =sc.nextLine();
				if (scale2.equals("C")) {
					System.out.println("Podaj temperature w stopniach Farenheita: ");
					double temp=sc.nextDouble();
					double score=(temp-32)/1.8;
					System.out.println("Temperatura w stopniach Farenheita: "+ temp);
					System.out.println("Tempertaura W stopniach Celsjusza: " + score);
				} else {
					System.out.println("Podaj temperature w stopniach Farenheita: ");
					double temp=sc.nextDouble();
					double score=(temp +459.67)* 5/9;
					System.out.println("Temperatura w stopniach Farenheita: "+ temp);					
					System.out.println("Temperatura w stopniach Kelwina: "+ score);	
				}
			break;
			case "K":
				System.out.println("Podaj na jaką jednostke chcesz zrobić konwersje:");
				System.out.println("C-Celsjusz");
				System.out.println("F-Farenheit");
				String scale3 =sc.nextLine();
				if (scale3.equals("C")) {
					System.out.println("Podaj temperature w stopniach Kelwina: ");
					double temp=sc.nextDouble();					
					double score=temp -273.15;
					System.out.println("Temperatura w stopniach Kelwina: "+ temp);
					System.out.println("Tempertaura W stopniach Celsjusza: " + score);
				} else{
					System.out.println("Podaj temperature w stopniach Kelwina: ");
					double temp=sc.nextDouble();
					double score=(temp * 1.8)-459.67;
					System.out.println("Temperatura w stopniach Kelwina: "+ temp);					
					System.out.printf("Temperatura w stopniach Farenheita: "+"%2.2f", score);	
				}
			break;
			default:
				System.out.println("Nie podałeś żadnej wartości, Koniec Programu");
			break;
		}
	}
}
