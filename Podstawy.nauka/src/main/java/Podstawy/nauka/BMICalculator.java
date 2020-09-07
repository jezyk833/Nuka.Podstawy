package Podstawy.nauka;

import java.util.Scanner;

// Program ma za zadanie liczyć BMI i wskazywac wartość po wpisaniu wzrostu i wagi.

public class BMICalculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Wpisz swoją wagę : ");
		double weight=sc.nextDouble();
		System.out.println("Wpisz swój wzrost w metrach: ");
		double height=sc.nextDouble();
		
		double bmi=weight /( Math.pow(height, 2));
		System.out.printf("Twój wynik to: "+"%2.2f\n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("Masz niedowage");
		}else if(bmi >24.9) {
			System.out.println("Masz nadwagę");
		}else {
			System.out.println("waga prawidłowa");
		}

	}
}
