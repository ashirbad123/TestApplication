import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class collections {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		Map<Integer, String> map1=new TreeMap<>();
		map.put(2, "james");
		map.put(2, "annie");
		map.put(9, null);
		map.put(5, "pie");
		map.put(7, "christ");
		map.put(1, "david");
		map.put(null, "kyle");
		map.put(null, null);
		map.put(8, null);
		
		Iterator <Map.Entry<Integer, String>>itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getValue());
			
		}
		
	
		System.out.println("Hashmap values are-"+map);
		//Hashmap allows single null key and multiple null value.
		//
		
		map1.put(2, "james");
		map1.put(2, "annie");
		map1.put(5, "pie");
		map1.put(99, "david");
		map1.put(1, "david");
		map1.put(7, "christ");
		map.put(null, "kyle");
		map.put(null, null);
		map.put(8, null);
		map.put(9, null);
		System.out.println("Treemap values are -" +map1);
		//TreeMap don't allow null key and null value.
		//Values are stored in natural sorting order of the keys.
		
		Set<String>set=new HashSet<String>();
		set.add("james");
		set.add("avy");
		set.add("hanes");
		set.add("kyle");
		set.add("uli");
		set.add("uli");
		set.add(null);
		set.add(null);
		System.out.println("Hashset values are -"+set);
		//HasSet allows single null object.
		//Objects are stored in Random order.
		
		Set<String>set1=new TreeSet<String>();
		set1.add("james");
		set1.add("avy");
		set1.add("hanes");
		set1.add("kyle");
		set1.add("uli");
		set.add("uli");
		//set1.add(null);
		System.out.println("TreeSet values are -"+set1);
		//TreeSet doesnot allows duplicate.
		//TreeSet stores objects in natural sorting order of the objects.
		
		Set<Integer>set2=new TreeSet<Integer>();
		set2.add(23);
		set2.add(-3);
		set2.add(5);
		set2.add(10);
		set2.add(0);
		set2.add(3);
		//set2.add(null);
		set2.add(3);
		//set2.add(null);
		System.out.println("TreeSet values for Integers are -"+set2);
		//TreeSet doesnot allows duplicate.
		//TreeSet stores elements in natural sorting order of the objects.
			
	}
	
}
