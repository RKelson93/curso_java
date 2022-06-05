package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Colaborators;

public class VerifyColaborator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				Colaborators colaborator = new Colaborators();
				System.out.println("Digite o nome do funcionário:");
				colaborator.name = sc.nextLine();
				System.out.println("Digite o salário do colaborador:");
				colaborator.salary = sc.nextDouble();
				System.out.println("Digite o imposto:");
				colaborator.tax = sc.nextDouble();
				System.out.println("Agora, digite a porcentagem de aumento:");
				colaborator.percentage = sc.nextDouble();
				System.out.println(colaborator);
				sc.close();
	}

}
