package entities;

import java.util.Date;

public class Rental {

	//ATRIBUTOS:
	
	private String carModel;
	private Date start;
	private Date end;
	
	private Double priceHour;
	private Double priceDay;
	
	//CONSTRUTORES:
	
	public Rental(String carModel, Date start, Date end) {
		this.carModel = carModel;
		this.start = start;
		this.end = end;
	}

	//GETTERS E SETTERS:
	
	public String getCarModel() {
		return carModel;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}
	
	public Double getPriceHour() {
		return priceHour;
	}
	
	public Double getPriceDay() {
		return priceDay;
	}
	
	public void setPrices(Double hour, Double day) {
		this.priceHour = hour;
		this.priceDay = day;
	}
	
	//MÉTODOS:
	
	private double tax(double amount) {
		if (amount <= 100.00) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
	
	private double basicPayment() {
		long t0 = start.getTime();
		long t1 = end.getTime();
		double hours = ((double) t1 - t0) / (1000*60*60);
		
		if (hours <= 12) {
			return priceHour * Math.ceil(hours);
		}
		else {
			return priceDay * Math.ceil(hours/24); 
		}
	}
	
	private double totalPayment() {
		return basicPayment() + tax(basicPayment());
	}
	
	public void printInvoice() {
		System.out.println("INVOICE:");
		System.out.print("Basic payment: " + String.format("%.2f", basicPayment()) + "\n");
		System.out.print("Tax: " + String.format("%.2f", tax(basicPayment())) + "\n");
		System.out.println("Total payment: " + String.format("%.2f", totalPayment()));
	}
	
}
