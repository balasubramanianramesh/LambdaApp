package lambda.main;

@FunctionalInterface //Optional
interface Cab{// When an Interface will have excatly 1 abstract method we can say it as Functional Interface
	String bookCab(String type);// -> by default public abstract void bookCab();
}

/*class UberX implements Cab{

	public void bookCab(String type) {
		System.out.println(type + " Cab Booked and Arriving Soon !!!!");
	}
	
}*/

public class LambdaApp {

	public static void main(String[] args) {
		//1.
		//UberX cab = new UberX(); // Polymorphic Statement
		//cab.bookCab("SUV");
		
		//2.
		//Anaonymous Class Implementation
		/*Cab cab = new Cab() {
			
			public void bookCab(String type) {
				System.out.println(type + " Cab Booked and Arriving Soon !!!!");
			}
		};
		
		cab.bookCab("SUV");*/
		
		//3.
		// Using a Lambda Expression -> Can be worked only with the Functional Interfaces 
		/*Cab cab = (type)->{
			System.out.println(type + " Cab Booked and Arriving Soon !!!!");
			return type + " Cab Booked and Arriving Soon !!!!";
		};
		String result = cab.bookCab("SUV");*/
	}

}
