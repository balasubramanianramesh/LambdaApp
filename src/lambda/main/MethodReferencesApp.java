package lambda.main;

interface Calculator{
	void add(int num1, int num2);
}

class Calc{
	public static void addSomething(int num1,int num2){
		System.out.println(num1 + " and " + num2 + " addition is : "+(num1+num2));
	}
	public static void letsAdd(int num1,int num2){
		System.out.println(num1 + " and " + num2 + " add is : "+(num1+num2));
	}
}

public class MethodReferencesApp {

	public static void main(String[] args) {
		//Calc.addSomething(10, 20);
		
		//1. Reference to a Static Method
		/*Calculator cRef = Calc::addSomething;// Method Reference
		cRef.add(10, 20);*/
		
		//2. Reference to non-Static or Instance Method
		/*Calc calc = new Calc();
		Calculator cRef = calc::letsAdd;
		cRef.add(10, 20);*/
	}

}
