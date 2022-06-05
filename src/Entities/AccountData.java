package Entities;

public class AccountData {
	private final double taxWithdraw = 5.0;
	private String holder;
	private double balance;
	private int accountNumber;

	public AccountData(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = 0;
	}

	public AccountData(int accountNumber, String holder, double initialDeposite) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposite(initialDeposite);
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccount() {
		return accountNumber;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void setDeposite(double valor) {
		deposite(valor);
	}

	public void setWithdraw(double valor) {
		withdraw(valor);
	}

	private void deposite(double valor) {
		balance += valor;
	}

	private void withdraw(double valor) {
		balance -= (valor + taxWithdraw);
	}

	public String toString() {
		return "Número da conta: "
				+ getAccount() + "\n"
				+ "Titular da conta: "
				+ getHolder() + "\n"
				+ "Saudo depositado: "
				+ getBalance();
	}
}
