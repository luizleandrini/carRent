package entities;

public class Tercerizado extends Employee{
	
	private Double additionalCharge;

	public Tercerizado() {
		
	}
	
	public Tercerizado(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAditionalCharge() {
		return additionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.additionalCharge = aditionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment()+ additionalCharge * 1.1;
	}
}
