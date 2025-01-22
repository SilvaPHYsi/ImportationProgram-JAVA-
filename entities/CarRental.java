package entities;

import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime StartDate;
	private LocalDateTime FinishDate;
	private Vehicles model;
	private Invoice invoice;
	
	public CarRental(LocalDateTime StartDate, LocalDateTime FinishDate, Vehicles model) {
		this.StartDate = StartDate;
		this.FinishDate = FinishDate;
		this.model = model;
	}

	public LocalDateTime getStartDate() {
		return StartDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		StartDate = startDate;
	}

	public LocalDateTime getFinishDate() {
		return FinishDate;
	}

	public void setFinishDate(LocalDateTime finishDate) {
		FinishDate = finishDate;
	}

	public Vehicles getModel() {
		return model;
	}

	public void setModel(Vehicles model) {
		this.model = model;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	

}
