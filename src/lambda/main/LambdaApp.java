package lambda.main;

@FunctionalInterface //Optional
interface Cab{// When an Interface will have excatly 1 abstract method we can say it as Functional Interface
	void bookCab();// -> by default public abstract void bookCab();
}

/*class UberX implements Cab{

	public void bookCab() {
		System.out.println("Cab Booked and Arriving Soon !!!!");
	}
	
}*/

public class LambdaApp {

	public static void main(String[] args) {
		//1.
		//UberX cab = new UberX(); // Polymorphic Statement
		//cab.bookCab();
		
		//2.
		//Anaonymous Class Implementation
		/*Cab cab = new Cab() {
			
			public void bookCab() {
				System.out.println("Cab Booked and Arriving Soon !!!!");
			}
		};
		
		cab.bookCab();*/
		
		//3.
		// Using a Lambda Expression -> Can be worked only with the Functional Interfaces 
		/*Cab cab = ()->{
			System.out.println("Cab Booked and Arriving Soon !!!!");
		};
		cab.bookCab();*/
	}

}
