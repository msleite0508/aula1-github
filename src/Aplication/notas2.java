package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Notas2;

public class notas2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Notas2 notas2 = new Notas2();
		
		notas2.name = sc.nextLine();
		notas2.grade1 = sc.nextDouble();
		notas2.grade2 = sc.nextDouble();
		notas2.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", notas2.finalGrade());
		if (notas2.finalGrade() < 60.0) {
			System.out.printf("MISSING %.2f POINTS%n", notas2.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		
		
		
		sc.close();

	}

}
