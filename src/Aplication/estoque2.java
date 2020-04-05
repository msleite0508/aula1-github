package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;


public class estoque2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.println();
		/*aula sobrecarga
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		System.out.println();*/
		
		/*aula this e sobrecarga*/
		Product2 prod = new Product2 (name, price);
		Product2 p = new Product2();
		
		prod.setName("Computer");
		System.out.println("Updated name: "+ prod.getName());
		
		prod.setPrice(5000);
		System.out.println("Updated price: "+ prod.getPrice());
		

		
		
		System.out.println("Product data: " + prod);
		System.out.println();
		
		System.out.print("Enter to number of products to be added in Stock ");
		int quantity = sc.nextInt();
		prod.addProduct(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + prod);
		System.out.println();
		
		System.out.print("Enter to number of products to be removed from Stock ");
		quantity = sc.nextInt();
		prod.removeProduct(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + prod);
			
		
		sc.close();

	}

}
