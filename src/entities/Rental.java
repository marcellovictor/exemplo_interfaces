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
	
	public Double priceHour() {
		return priceHour;
	}
	
	public Double priceDay() {
		return priceDay;
	}
	
	//MÉTODOS:
	
	
	
}
