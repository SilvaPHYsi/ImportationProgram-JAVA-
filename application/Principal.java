package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicles;
import services.BrazilTaxService;
import services.RentalCar;

public class Principal {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter with car model");
		String model = sc.nextLine();
		System.out.println("You'll need to enter the start date: (dd/MM/yyyy HH:mm) ");
		LocalDateTime ldt = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("You'll need to enter the finish date: (dd//MM/yyyy HH:mm)");
		LocalDateTime ldt2 = LocalDateTime.parse(sc.nextLine(),fmt);
		
		CarRental cr = new CarRental(ldt, ldt2, new Vehicles(model));
		
		System.out.println("Enter the hour price: ");
		double priceHour = sc.nextDouble();
		System.out.println("Enter the hour day: ");
		double priceDay = sc.nextDouble();
		
		RentalCar rse = new RentalCar(priceDay,priceHour, new BrazilTaxService());
		rse.processInvoice(cr);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getValue()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().ToTalPrice()));
		
		sc.close();
		
		

	}

}
