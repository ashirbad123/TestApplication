import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;

public class Temp_caller{
	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		ArrayList<Temp_Student> ref=new ArrayList<>();
		ref.add(new Temp_Student(5, "joseph", "Bangalore"));
		ref.add(new Temp_Student(3, "nancy", "chennai"));
		ref.add(new Temp_Student(22, "jeff", "hyderabad"));
		ref.add(new Temp_Student(1, "amtonio", "maharastra"));
		ref.add(new Temp_Student(2, "louis", "hyderabad"));
			
		Comparator<Temp_Student>comp=new Comparator<Temp_Student>() {
	
			public int compare(Temp_Student s1, Temp_Student s2) {
				if(s1.getId()>s2.getId())
				return 1;
				else
				return -1;
			}
			
		};
		Collections.sort(ref,comp);
		
		//Iteration using for Loop.
		
		/*for(int i=0;i<ref.size();i++) {
			System.out.println(ref.get(i));*/
		
		//Iteration using for-each loop.
		
		/*for(Temp_Student ref1:ref) {
			System.out.println(ref1);
		}
		*/
		
		//Iteration using Iterator.
		
		Iterator<Temp_Student>itr=ref.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		System.out.println("============================================");
		Collections.sort(ref,comp.reversed());
		Iterator<Temp_Student>itr1=ref.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
			
	}
	
	

}
