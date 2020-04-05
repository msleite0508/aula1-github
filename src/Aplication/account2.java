package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Account2;

public class account2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account2 account2;
		
		System.out.print("Enter account number: ");
		int number2 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account Holder: ");
		String holder2 = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account2 = new Account2(number2, holder2, initialDeposit) ;
			}
		else {
			account2 = new Account2(number2, holder2);
		}
		
		System.out.println();
		System.out.println("Account Data");
		System.out.print(account2);
		
		System.out.println();
		System.out.print("Enter a deposit Value:");
		double depositValue = sc.nextDouble();
		account2.deposit(depositValue);
		System.out.println("Updated Account Data");
		System.out.println(account2);
		

		System.out.println();
		System.out.print("Enter a Withdraw Value:");
		double withDrawValue = sc.nextDouble();
		account2.withDraw(withDrawValue);
		System.out.print("Updated Account Data");
		System.out.print(account2);
		
		sc.close();
		
	}

}
