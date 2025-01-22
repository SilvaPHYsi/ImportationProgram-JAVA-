package services;

public class BrazilTaxService implements TaxService {

	@Override
	public double tax(double amount) {
		if(amount >= 100) {
			amount = amount  * 0.15;
		}
		else {
			amount = amount * 0.2;
		}
		return amount;
	}
	

}
