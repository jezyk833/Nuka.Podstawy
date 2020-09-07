package Podstawy.nauka;

import java.util.Scanner;

//Program obliczający raty kredytu oraz oprocentowanie kredytu w zalezosci od ilosc rat.
//6-12rat - 2,5%
//13-24rat -5%
//25-49rat- 10%
//dodatkowo program pokazuje ostatnią ratę wyższą w przypadku nie regularnej liczby.

public class Raty {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Podaj cene towaru maks 10 000zł: ");
		double price=sc.nextDouble();
		while (price <=10000.00) {
			System.out.println("Podaj liczbe rat 6-49 ");
			int numbers=sc.nextInt();
	if(numbers <6 && numbers >49) {
		System.out.println("Błędna liczba rat");
		System.out.println("Liczba rat możliwa to 6-49");
	}else if(numbers >=6 && numbers <=12) {
		double  kwotacalk =price* 1.025;
		double lastloan = kwotacalk%numbers;
			if(lastloan == 0){
				System.out.println(kwotacalk / numbers);
			}else if(lastloan != 0){
				double rata=Math.floor(kwotacalk / numbers);
				double ostatniarata= (kwotacalk - (rata*numbers))+rata;
				System.out.println("Całkowity koszt kredytu to:" + kwotacalk +" zł");
				System.out.println(numbers-1 + "rat stałych płatnych co miesiąc wyjdzie: "+ rata +" zł");
				System.out.println("Ostatnia rata wyjdzie: "+ ostatniarata +" zł");
		}
	}else if(numbers >=13 && numbers <=24) {
		double  kwotacalk =price* 1.05;
		double lastloan = kwotacalk%numbers;
			if(lastloan == 0){
				System.out.println(kwotacalk / numbers);
			}else if(lastloan != 0){
				double rata=Math.floor(kwotacalk / numbers);
				double ostatniarata= (kwotacalk - (rata*numbers))+rata;
				System.out.println("Całkowity koszt kredytu to:" + kwotacalk +" zł");
				System.out.println(numbers-1 + "rat stałych płatnych co miesiąc wyjdzie: "+ rata +" zł");
				System.out.println("Ostatnia rata wyjdzie: "+ ostatniarata +" zł");
		}
	}else {
		double  kwotacalk =price* 1.1;
		double lastloan = kwotacalk%numbers;
			if(lastloan == 0){
				System.out.println(kwotacalk / numbers);
			}else if(lastloan != 0){
				double rata=Math.floor(kwotacalk / numbers);
				double ostatniarata= (kwotacalk - (rata*numbers))+rata;
				System.out.println("Całkowity koszt kredytu to:" + kwotacalk +" zł");
				System.out.println(numbers-1 + "rat stałych płatnych co miesiąc wyjdzie: "+ rata +" zł");
				System.out.println("Ostatnia rata wyjdzie: "+ ostatniarata +" zł");
		}
	  }
			
	} 
  }
}	
