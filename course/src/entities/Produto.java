package entities;

import java.text.Format;

public class Produto {

	private String name;
	private double price;
	private int quantity;
	
	public Produto() {
		  this.name = "luiz";
	}

	public Produto(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " unidades, total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
