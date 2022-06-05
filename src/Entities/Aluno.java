package Entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public String getNome() {
		return nome;
	}

	public double getMediaTrimestre() {
		return (nota1+nota2+nota3)/3;
	}

	public String result() {
		double total= 100-getMediaTrimestre();
		if(total <60)
			return " you failed. You need more " + String.format("%.1f", total) + " to pass.";
		else
			return " You have been passed. You stayed " + String.format("%.1f", total) + " of the total points.";
	}

	public String toString() {  
		return "Nome: "
				+ getNome()
				+ " "
				+ "Notas inseridas: "
				+ String.format("%.1f", nota1) + "\n"
				+ String.format("%.1f", nota2) + "\n"
				+ String.format("%.1f", nota3) + "\n"
				+ "Media do ano: "
				+ String.format("%.1f", getMediaTrimestre())
				+ result();
	}
}
