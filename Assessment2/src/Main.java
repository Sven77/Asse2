import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014);
//		Vehicle a = new Vehicle("Audi", "A6", 2003);
//		Vehicle j = new Vehicle("Jaguar", "X200", 2003);
//		Vehicle m = new Vehicle("Mercedes-Benz", "CL600 C220", 2003);

		v.printDetails();
		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
			
		}

		System.out.println("\n");
		
		v.printDetails1(); //Details after travel
		
		System.out.println("\n****************************************");
		
		
//---------------------------------------
		
//		a.printDetails();
		
		// Vehicle sample distance
//		for (int i = 0; i < 10; i++) {
//			a.addKilometers(new Random().nextInt(100));
			
//		}

//		System.out.println("\n");
		
//		a.printDetails(); //Details after travel
//		System.out.println("\n****************************************");
		
//----------------------------------------
		
//		j.printDetails();
		
		// Vehicle sample distance
//		for (int i = 0; i < 10; i++) {
//			j.addKilometers(new Random().nextInt(100));
			
//		}

//		System.out.println("\n"); //Details after travel
		
//		j.printDetails();
//		System.out.println("\n****************************************");
		
//----------------------------------------
		
//		m.printDetails();
		
		// Vehicle sample distance
//		for (int i = 0; i < 10; i++) {
//			m.addKilometers(new Random().nextInt(100));
			
//		}
		
//		System.out.println("\n"); //Details after travel
		
//		m.printDetails();
//		System.out.println("\n****************************************");
	}

}
