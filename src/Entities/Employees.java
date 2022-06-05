package Entities;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;

	public Employees() {
	}

	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		this.salary += this.salary * percentage / 100;
	}

	public String toString() {
		return "Id: " +id
				+ "\nName: " +name
				+ "\nSalary: " +salary;
	}
}
