package entities;

public class Empregado {

	public String name;
	public double grossSalary;
	public double tax = 1000;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double porcentagem) {
		this.grossSalary += grossSalary * porcentagem / 100;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary()); 
	}
	
}
