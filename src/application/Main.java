package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Rental;
import util.DateFormats;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String model = sc.nextLine();
		
		Date pickup = new Date();
		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		try {
			pickup = DateFormats.full.parse(sc.nextLine());
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date returno = new Date();
		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		try {
			returno = DateFormats.full.parse(sc.nextLine());
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Rental rental = new Rental(model, pickup, returno);
		
		sc.close();
	}

}
