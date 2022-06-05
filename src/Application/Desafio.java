package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.PeopleDate;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		PeopleDate[] individuo = new PeopleDate[12];
		String nome = "";
		String profissao = "";
		char opc;
		System.out.println("Bem-vindo ao sistema de cadastro.");
		while(true) {
			System.out.println("Selecione uma opção:");
			System.out.println();
			System.out.println("C - cadastrar um novo usuário\n");
			System.out.println("I - mostrar informações");
			System.out.println("S - sair");
			opc = leia.next().charAt(0);
			switch(opc) {
			case 'c':
				System.out.println("Digite o nome do individuo:");
				leia.nextLine();
				nome = leia.nextLine();
				
				System.out.println("Digite a profissao:");
		profissao = leia.nextLine();
				for(int i = 0; i <= 11; i++) {
					System.out.println("Digite o " +(i+1)+"º salário:");
					double salario = leia.nextDouble();
					individuo[i] = new PeopleDate(salario);
				}
					break;
			case 'i':
				System.out.println("Apresentando as informações:");
				System.out.println();
				System.out.println("Nome: " +nome);
				System.out.println();
				System.out.println("Profissao: " +profissao);
		for(int i = 0; i <= 11; i++) {
			System.out.println();
					System.out.println("Salário: " +String.format("%.2f", individuo[i].getSalario()));
					System.out.println("");
					System.out.println("Imposto: " +String.format("%.2f", individuo[i].calculaImposto()));
					System.out.println("Total salário do mês: " +String.format("%.2f", individuo[i].totalSalario()));
				}
			break;
			case 's':
				System.out.println("Obrigada, tchau!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
