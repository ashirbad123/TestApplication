/*Given an array, find the first duplicate element.
Eg. I/P : [1, 2, 4, 4, 1, 3, 7, 5, 5, 2]
O/P : 4
*/
package amazonQAE;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateElement_AmazonQAE {

	
	public int FindDuplicateElement() {
	
		int arr[]= {2, 1, 2, 3, 5, 2, 3};
		Set<Integer> set= new HashSet<Integer>();
		 for(int i=0;i<arr.length;i++) {
			 if(!set.add(arr[i])) {
				 //System.out.println(arr[i]); 
				 return arr[i];
			 }
			 //System.out.println("Set size is "+set.size());
		 }
		  return -1;
	}
	
	@Test
	public void caller() {
		System.out.println(FindDuplicateElement());
	}
}	
	

