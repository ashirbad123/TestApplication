package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l.toString());
        Set<String>s=new HashSet<>();
        s.addAll(l);
        System.out.println(s.toString());
        System.out.println("------------------------");
        Set<String>s1=new LinkedHashSet<>();
        s1.addAll(l);
        System.out.println(s1.toString());
 }
}
