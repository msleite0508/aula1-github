package Aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrenciConverter;


public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		CurrenciConverter cal = new CurrenciConverter();
		
		System.out.print("What is dollar price? ");
		double valorDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double reais = sc.nextDouble();
		
		double result = cal.valorFinalReais(valorDolar, reais);
		
		System.out.printf("Amount to be paint in reais = %.2f%n", result);

		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
	}

}
