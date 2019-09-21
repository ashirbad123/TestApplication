package exception;

import org.testng.annotations.Test;

public class FinallyUses {

/*	@Test
	public void testFinallyMethod() {
		
		int i=10, j=0;
		try {
		if(i%j==0) {
			throw new ArithmeticException();
		}	
		}
		catch(ArithmeticException ae) {
			System.out.println("/by zero Exception");
		}
		finally {
			System.out.println("This block will execute at any cost");
		}
		
	}*/
	
	@Test
	public void testFinallyMethod1() {
		
		int i=10, j=0;
		try {
		if(i%j==0) {
			throw new ArithmeticException("/by zero exception");
		}	
		
		}
		catch(ArithmeticException ae) {
			System.out.println("/by zero Exception");
			System.exit(1); /*This is causing the jvm to crash and hence this prevent the finally block of information to 
			execute at any cost.*/
		}
		
		
		finally {
			System.out.println("This is finally block and it will execute at any cost");
		}
		System.out.println("this is a statement");
		
		
	}
}
