package sampleSorting;

import java.util.Comparator;

public class ComparatorClass implements Comparator<StudentClass>{

	public int compare(StudentClass s1, StudentClass s2) {
		
		return (s1.id - s2.id);
	
	}
	

}
