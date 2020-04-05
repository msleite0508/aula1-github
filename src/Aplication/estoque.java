package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;




public class estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Product product = new Product();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter to number of products to be added in Stock ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter to number of products to be removed from Stock ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
			
		
		sc.close();

	}

}
