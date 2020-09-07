package Podstawy.nauka;

//Program liczący maksymalną i minimalną wartosc z pośród 5 liczb.

import java.util.Scanner;

public class MaxAndMinValue {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[5];
		System.out.println("Podaj 5 liczb: ");
		for( int i=0; i<tab.length; i++) {
			tab[i]=sc.nextInt();
			
		}
		int max=tab[0];
		int min=tab[0];
		for(int i=1; i<tab.length; i++) {
			if(tab[i]>max) {		
				max=tab[i];
		}
			if(tab[i]<min) {		
				min=tab[i];
		}
		}
			System.out.println("Najwyższa podan liczba to: " +max);
			System.out.println("Najniższa podana liczba to: " +min);
	
		}		
	}
