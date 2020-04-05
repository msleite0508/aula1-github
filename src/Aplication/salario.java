package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Salario;

public class salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Salario sal = new Salario();
		
		System.out.print("Name: ");
		sal.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		sal.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		sal.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + sal);
		System.out.println();
		System.out.print("Witch percentage to increase salary? ");
		double percentage = sc.nextDouble();
		sal.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + sal);
		
		sc.close();
	}

}
