package comparatorInterfaceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.testng.annotations.Test;

public class RunnerForLaptop {

	private static final String List = null;

	@Test
	public void runnerCheck() {
		
		
		ArrayList<Laptop>lap=new ArrayList<>();
		lap.add(new Laptop("Dell",8,80000));
		lap.add(new Laptop("Lenovo",4,90000));
		lap.add(new Laptop("Acer",12,85000));
		
/*		Comparator<Laptop>comp=new Comparator<Laptop>() {

			@Override
			public int compare(Laptop l1, Laptop l2) {
				
				return l1.getBrand().compareTo(l2.getBrand());
			}
			
		};
		
		//Sort the data in Ascending/default sorting order.
				Collections.sort(lap,comp);
				
				//Iteration we need to define an enhanced for loop.
				for(Laptop ref:lap) {
					System.out.println(ref);
				}
			
	}*/
	
	
	/*Comparator<Laptop>comp1=new Comparator<Laptop>() {

		@Override
		public int compare(Laptop l1, Laptop l2) {
			
			return l1.getPrice()-(l2.getPrice());
		}
		
	};
	
	//Sort the data in Ascending/default sorting order.
			Collections.sort(lap,comp1);
			
			//Iteration we need to define an enhanced for loop.
			for(Laptop ref:lap) {
				System.out.println(ref);
			}*/
			
			Comparator<Laptop>comp1=new Comparator<Laptop>() {

				@Override
				public int compare(Laptop l1, Laptop l2) {
					
					return l1.getRam()-(l2.getRam());
				}
				
			};
			
			//Sort the data in Ascending/default sorting order.
					Collections.sort(lap,comp1);
					
					//Iteration we need to define an enhanced for loop.
					for(Laptop ref:lap) {
						System.out.println(ref);
					}
					
					//Sort the data in descending order.
					Collections.sort(lap,comp1.reversed());
					
					//Iteration we need to define an enhanced for loop.
					for(Laptop ref:lap) {
						System.out.println(ref);
					}	
}

	
}
