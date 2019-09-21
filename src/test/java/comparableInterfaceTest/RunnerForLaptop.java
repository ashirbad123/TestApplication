package comparableInterfaceTest;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class RunnerForLaptop {

	private static final String List = null;

	@Test
	public void runnerCheck() {
		
		
		ArrayList<Laptop>lap=new ArrayList<>();
		lap.add(new Laptop("Dell",8,80000));
		lap.add(new Laptop("Lenovo",4,90000));
		lap.add(new Laptop("Acer",12,85000));
		
		//Sort the data in Ascending/default sorting order.
				Collections.sort(lap);
				
				//Iteration we need to define an enhanced for loop.
				for(Laptop ref:lap) {
					System.out.println(ref);
				}

		System.out.println("=======================================");
		//Sort the data in reverse order.
		Collections.sort(lap,Collections.reverseOrder());
		
		//Iteration we need to define an enhanced for loop.
		for(Laptop ref:lap) {
			System.out.println(ref);
		}
			
	}
	
	
}
