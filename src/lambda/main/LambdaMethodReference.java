package lambda.main;


interface Display{
	public int show(String s1, String s2);
}
interface deserializer{
	public int deserialize(String v1);
}
interface Factory{
	public String create(char[] val);
}

class StringConverter{
	public int convertToInt(String v1){
		return Integer.valueOf(v1);
	}
}
public class LambdaMethodReference {
	public static int doShow(String s1, String s2){
		return s1.lastIndexOf(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display disp = LambdaMethodReference::doShow(); // Static Method Reference
		//Display disp = Tring::indexOf; // Parameter Method Reference
		//Instance Method Reference
		/*StringConverter sc = new StringConverter();
		deserializer des = sc::convertToInt;*/
		//Factory fact = String::new; // Constructor Method Reference
	}

}
