package entities;

public class Invoice {
	private Double tax;
	private Double value;
	
	public Invoice() {
		
	}
	
	public Invoice(Double tax, double value) {
		this.value = value;
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}


	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public double ToTalPrice() {
		return getTax() + getValue() ;
	}
	
	
	
	

}
