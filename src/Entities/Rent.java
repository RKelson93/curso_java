package Entities;

public class Rent {
	private String name;
	private String email;

	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String Email) {
		this.email = email;
	}

	public String toString() {
		return "Nome: "
				+ getName() +
				"\n"
				+ "Email: "
				+getEmail();
	}
}
