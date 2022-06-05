import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		nome = leia.next();
		System.out.println("Você digitou " +nome);
		leia.close();
	}

}
