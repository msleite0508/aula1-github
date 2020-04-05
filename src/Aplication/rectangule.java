package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangule;

public class rectangule {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner (System.in);
			
			Rectangule rectangule = new Rectangule();
			
			System.out.print("Enter rectangle width and height: ");
			rectangule.width = sc.nextDouble();
			rectangule.height = sc.nextDouble();
			
			System.out.printf("AREA = %.2f%n", rectangule.area());
			System.out.printf("PERIMETRO = %.2f%n", rectangule.perimeter());
			System.out.printf("DIAGONAL = %.2f%n", rectangule.diagonal());
			
			
			
			
			
			sc.close();
	}

}
