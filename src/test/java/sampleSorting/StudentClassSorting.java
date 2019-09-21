package sampleSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentClassSorting {

	public static void main(String[] args) {
		
		ArrayList<StudentClass>al=new ArrayList<StudentClass>();
		
		al.add(new StudentClass(232,"Jeff", "Bangalore"));
		al.add(new StudentClass(34,"Nancy", "Bangalore"));
		al.add(new StudentClass(320,"Christopher", "Bangalore"));
		al.add(new StudentClass(9,"Christopher", "Bangalore"));
		
		//printing as entered inside the arraylist.
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		System.out.println("=======================================");
		//Sorting the data in the arraylist
		Collections.sort(al, new ComparatorClass());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
	}
}
