package Podstawy.nauka;


import java.util.Scanner;

// program ma za zadanie liczy� podatek dochodowy w zalezności od wynagrodzenia 18% lub 32%.
// przy mniejszych kwotach mogą  użyć double dla większych BigDecimal jest dokładniejszy.
 
public class TaxCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Podaj dochód: ");
		double revenue=sc.nextDouble();
		System.out.println("Twój dochód to: " + revenue +"zł");
		
		if(revenue <=85528.00) {
			double tax=(revenue * 0.18)-556.02;
			System.out.printf("Podatek do zapłaty:" +"%5.2f", tax );
			System.out.printf("zł");
		}else {
			double tax=14839.02 +((revenue - 85528.00)*0.32);
			System.out.printf("Podatek do zapłaty:" +"%5.2f", tax);
			System.out.printf("zł");
		}

	}

}
