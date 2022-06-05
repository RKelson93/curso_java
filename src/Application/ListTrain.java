package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Employees;

public class ListTrain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				Locale.setDefault(Locale.US);
				List<Employees> list = new ArrayList<>();

				System.out.println("Please, how many employees will be registered?");
				int number_of_employees = input.nextInt();
				for(int i = 0; i < number_of_employees; i++) {
					System.out.println("");
					System.out.println("Type the id of employee:");
					int id = input.nextInt();
					while(isIdExists(list, id)) {
						System.out.println("Sorry, this id already taken. Try again.\nType the id of employee:");
						id = input.nextInt();
					}
					System.out.println("Type the name of employee:");
					input.nextLine();
					String name = input.nextLine();
					System.out.println("Please, type the base salary of employee:");
					double salary = input.nextDouble();
					list.add(new Employees(id, name, salary));
				}

				System.out.println("Now, Type the id of employee to increase salary:");
				int id = input.nextInt();
				Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if(emp == null) {
					System.out.println("That id doesn't exists.");
				}

				else {
					System.out.println("Type the value of increase:");
					double percentage = input.nextDouble();
					emp.increaseSalary(percentage);
				}
				System.out.println();
				System.out.println("Listing employees: ");
				for(Employees obj : list) {
					System.out.println(obj);
				}
				input.close();
	}
	
	public static boolean isIdExists(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
