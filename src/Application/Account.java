package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.AccountData;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountData account;
		System.out.print("Digite o numero da conta:");
		int number = sc.nextInt();
		System.out.println();
		System.out.print("Digite o nome do dono da conta:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Vai fazer um depósito inicial?");
		char response = sc.next().charAt(0);
		if(response == 'y' || response == 'Y') {
			System.out.println("De quanto?");
			double initialDeposit = sc.nextDouble();
			account = new AccountData(number, name, initialDeposit);
		}
		else {
			account = new AccountData(number, name);
		}
		System.out.println();
		System.out.println(account);
				System.out.print("Quanto vai depositar?");
				double deposite = sc.nextDouble();
				account.setDeposite(deposite);
				System.out.println();
				System.out.println("Updating ...");
				System.out.println(account);
				System.out.print("Quanto vai sacar?");
				double withdraw = sc.nextDouble();
				account.setWithdraw(withdraw);
				System.out.println("Updating ...");
				System.out.println(account);
				sc.close();

	}

}
