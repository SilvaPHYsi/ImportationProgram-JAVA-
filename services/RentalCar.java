package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalCar {
	CarRental carRental;
	Invoice invoice;
	private TaxService taxService;
	
	private double pricePerDay;
	private double pricePerHour;
	
	
	
	public RentalCar(double pricePerDay, double pricePerHour, TaxService taxservice) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxservice;
	}
	
	public void processInvoice(CarRental carRental) {
		//Cálculo do tempo
		double minutes = Duration.between(carRental.getStartDate(), carRental.getFinishDate()).toMinutes();
		
		double hours = minutes/60;
		
		//Cálculo do valor
		
		double value;
		
		if(hours < 12) {
			value = pricePerHour * Math.ceil(hours);
		}
		else if(hours >= 12) {
			value = pricePerDay * Math.ceil(hours);
		}
		else {
			throw new IllegalArgumentException("Something's goes wrong");
		}
		
		double tax = taxService.tax(value);
		carRental.setInvoice(new Invoice(tax, value));
		
		
	}
	
	

}
