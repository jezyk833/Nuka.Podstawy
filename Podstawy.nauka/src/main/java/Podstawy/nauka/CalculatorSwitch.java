package Podstawy.nauka;

import java.util.Scanner;

// Program ma byc prostym kalkulatorem, który dodaje,odejmuje,mnoży,dzieli, dzieli z resztą, potęguje,pierwiastkuje do kwadratu.
// Ma wskazywać błąd jeżeli został wpisany zły znak działania oraz ma pokazywac błąd przy dzieleniu przez 0.
// Można dodatkowo zastosowac pętle gdzie będzie można liczyć cały czas.

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Podaj pierwszą liczbę: ");
		double numberone = sc.nextDouble();		
		System.out.println("Podaj jakie działanie ma wykonać: ");
		System.out.println("+ dodawanie\n" 
							+ "- odejmowanie\n"
							+ "* mnożenie\n"
							+ "/ dzielenie \n"
							+ "% dzielenie z resztą\n"
							+ "^ potęga\n"
							+ "V - pierwiastek kwadratowy z liczby pierwszej");
		String operation=sc.next();		 
		if(operation.equals("+") ||
				   operation.equals("-") || 
				   operation.equals("*") ||
				   operation.equals("/") ||
		           operation.equals("%") ||
				   operation.equals("^") ||
				   operation.equals("V") ) {
			System.out.println("Podaj drugą liczbę: ");
			double numbertwo=sc.nextDouble();
		
			switch(operation) { 
				case "+":
					System.out.println(numberone +" + "+ numbertwo + " = "+ (numberone + numbertwo));	
					break;
				case "-":
					System.out.println(numberone +" - "+ numbertwo + " = "+ (numberone - numbertwo));
					break;
				case "*":
					System.out.println(numberone +" * "+ numbertwo + " = "+ (numberone * numbertwo));
					break;
				case "/":
					if(numbertwo >0 ) {
					double score =numberone / numbertwo;
					System.out.printf(numberone +" / "+ numbertwo + " = "+Math.floor(score));
					break;
					} else System.out.println("Nie dzielimy przez 0!!!"); 
					break;
				case "%":
					if(numbertwo >0 ) {
					double score2 =numberone / numbertwo;
					System.out.printf(numberone +" / "+ numbertwo + " = "+Math.floor(score2));
					System.out.printf(" reszta: " +(numberone % numbertwo));
					break;
					} else System.out.println("Nie dzielimy przez 0!!!");
					break;
				case "^":
					System.out.println(numberone +" ^ "+ numbertwo + " = "+ (Math.pow(numberone, numberone)));
					break;
				case "V":		
					System.out.println(numberone + " = "+ (Math.sqrt(numberone)));
					break;			      
			}
		}else System.out.println("Błędny znak został wpisany");
				
	}	
}
  


	
