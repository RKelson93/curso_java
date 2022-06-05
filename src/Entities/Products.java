package Entities;

public class Products {
private String name;
private double price;
private int quantity;

public Products() {
}

public Products(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

public void setName(String name) {
	this.name = name;
}

public void setPrice(double price) {
	this.price = price;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getName() {
	return name;
}

public double getPrice() {
	return price;
}

public int getQuantity() {
	return quantity;
}

private double totalValueInStock() {
	return price * quantity;
}

private void addProduct(int quantity) {
	this.quantity += quantity;
}

private void removeProduct(int quantity) {
	this.quantity -= quantity;
}

public String toString() {
	return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " unites, total Value: $ "
			+ String.format("%.2f", totalValueInStock());
}
}
