package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Department obj = new Department(1, "books");
		System.out.println(obj);
		Seller obj2 = new Seller(21, "marcos", "marcos@rjioewqjr.com", new Date(), 30000.0, obj);
		System.out.println(obj2);
	}

}
