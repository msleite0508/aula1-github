package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Employee> lista = new ArrayList<>();
		
		/*teste git primeiros socorros*/
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
	
		for (int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");	
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Salay:");
			double salary = sc.nextDouble();
			lista.add(new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if(emp == null) {
				System.out.println("This id does not exist!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double porcentage = sc.nextDouble();
				emp.increseSalary(porcentage);
			}
		System.out.println();
		
		System.out.println("List of employees: ");
			for (Employee obj : lista) {
				System.out.println(obj);
			}
		
			
		sc.close();
		
	}


}
