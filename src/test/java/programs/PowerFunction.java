package programs;

import org.testng.annotations.Test;


public class PowerFunction {

	public static int  power(int x, int y) {

			if(y==0)
				return 1;
			
			else if(y%2==0)
				return power(x,y/2)*power(x,y/2);
			
			else 
				return x* power(x,y/2)*power(x,y/2);
		}
			
	@Test
	public void powerFunctionalityChecker() {
		
		System.out.println(PowerFunction.power(4,4));
		
	}
}
