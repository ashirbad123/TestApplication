package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateUsingIterator {

	
	public static <String> ArrayList<String> removeDuplicates(ArrayList<String>list){
		
		//Create a new List
		ArrayList<String>list1=new ArrayList<>();
		
		//Traverse through the first List
		for(String str:list) {
			if(!list1.contains(str)) {
				list1.add(str);
			}
		}
		return list1;
	}
	
	
	public static void main(String[] args) {
		
		//Get the ArrayList with duplicate code.Here we aer
		ArrayList<String>al= new ArrayList<>(Arrays.asList("james","amit","kiran","antonio","james","katty"));
	/*	ArrayList<String>al= new ArrayList<>();
		al.add("Mango");  
        al.add("Banana");  
        al.add("Mango");  
        al.add("Apple");
    */
		
		//Print the arrayList elements.
		System.out.println(al.toString());
		
		//Remove the elements from the ArrayList.
		ArrayList<String> newList=RemoveDuplicateUsingIterator.removeDuplicates(al);
		
		//Print the arrayList elements.
		System.out.println(newList);
		
	}
}
