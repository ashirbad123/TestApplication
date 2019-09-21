package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findingSecondLargestNumber {

	public static void main(String[] args) {
		
		/*Integer arr[]= {212,3,8,0,-1,6,-22};
		List al=new ArrayList<>(Arrays.asList(arr));
		Collections.sort(al,Collections.reverseOrder());
		for(int i=0;i<al.size();i++) {
			System.out.println("Value at index: "+i+" is "+al.get(i));
			
		}
		
		System.out.println("Value at index: "+1+" is "+al.get(1));*/
		
		
		//printing the prime number in the list pof arrays.
		ArrayList al=new ArrayList<>();
		String primeNumber="";
		for(int i=1;i<=10000000;i++)
		{
			int counter=0;
			for(int j=i;j>=1;j--) {
				
				if(i%j==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				primeNumber=primeNumber+i+" ";
				al.add(i);
				
		}
			
			}
		//System.out.println(primeNumber);
		System.out.println(al);
		
		
	}
}
