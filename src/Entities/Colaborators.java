package Entities;

public class Colaborators {
	public String name;
	public double salary;
	public double tax;
	public double percentage;

	public double getGrossSalary() {
		return salary-tax;
	}

	public double getTotalSalary() {
		return (salary-tax)+((salary*percentage)/100);
	}

	public String getNome() {
		return name;
	}

	public String toString() {
		return name
				+ ", "
				+ "liquido: "
				+ salary
				+ " bruto: "
				+ getGrossSalary()
				+ " percentage: "
				+ percentage
				+ " total: "
				+ getTotalSalary();
	}
}
