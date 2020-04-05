package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Notas notas = new Notas();
		
		System.out.print("Nome: ");
		notas.name = sc.nextLine();
		
		System.out.println();
		System.out.print("Nota 1: ");
		notas.grade1 = sc.nextDouble();
		
		System.out.println();
		System.out.print("Nota 2: ");
		notas.grade2 = sc.nextDouble();
		
		System.out.println();
		System.out.print("Nota 3: ");
		notas.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", notas.finalGrade());
		
		if (notas.finalGrade() <60) {
			System.out.println("Failed");
			System.out.printf ("Missing %.2f points%n", notas.missingPoint());
		
		}
		else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}
