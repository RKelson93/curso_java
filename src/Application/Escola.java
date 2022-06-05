package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Aluno;

public class Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("type the studant name:");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a nota do primeiro, segundo e terceiro trimestres, separadas por enter:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.println(aluno);
	}

}
