import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

import entities.Vetor2;



public class vetor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		Vetor2[] vect = new Vetor2[n];
		
		for (int i=0;i<n;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Vetor2(name, price);
		}
		double sum = 0.00;
		for (int i=0;i<n;i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum /n;
		System.out.printf("AVERAGE HEIGHT %.2f%n", avg);
	
		sc.close();
	}

}
