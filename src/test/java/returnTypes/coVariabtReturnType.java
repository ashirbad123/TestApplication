package returnTypes;

import org.testng.annotations.Test;

public class coVariabtReturnType {

	
	public static Object covariantReturnTypeString() {
		
		String str="james";
		System.out.println();
		return str;
	}
	
public static Object covariantReturnTypeInteger() {
		
		int i=20;
		System.out.println();
		return i;
	}

public static Object covariantReturnTypeFloat() {
	
	float f=23.2f;
	System.out.println();
	return f;
}
	
	@Test
	public static void caller() {
		System.out.println (covariantReturnTypeString());
		System.out.println (covariantReturnTypeFloat());
		System.out.println (covariantReturnTypeInteger());
	}
}
