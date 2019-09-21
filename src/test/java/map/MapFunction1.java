package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class MapFunction1 {

	/*@Test
	public void printMapElements1() {
	
	*//**
	 *                 HashMap                                            TreeMap
	 ***************************************************************************************************************                 	
	 1.Retrieves values in random order				1.Retrieves values in natural sorting order.
	 2.Allows null as key and value.				2.Don't allow null as key however value can be null, if user tries to enter
	 												  null key then it results in null pointer exception.
	 												  
	 3.												  
	 *//*
	Map<String, Integer> map=new HashMap<String, Integer>();
	map.put("james",1);
	map.put("kiran",10);
	map.put("lancy",3);
	map.put("wasim",6);
	map.put("james",8);
	map.put("amit",8);
	map.put("binit",8);
	map.put(null,12);
	map.put("christ",null);
	map.put("harry",null);
	map.put(null,17);
	
	//System.out.println(map);
	
	
	Iterator<Map.Entry<String,Integer>>itr=map.entrySet().iterator();
	while(itr.hasNext()) {
		//System.out.println(itr.next().getKey());
	}
	System.out.println("======================================================");
	}
	*/
	@Test
	public void printMapElements2() {
	Map<Integer,String> map=new TreeMap<Integer,String>();
	map.put(1,"james");
	map.put(10,"kiran");
	map.put(3,"lancy");
	map.put(6,"wasim");
	map.put(1,"cummin");
	map.put(2,"larry");
	map.put(7,"larry");
	map.put(14,"larry");
	map.put(7,null);
	map.put(18,null);
	//System.out.println(map);
	
	/*Iterator<Map.Entry<Integer,String>>values=map.entrySet().iterator();
	while(values.hasNext()) {
		System.out.println(values.next().getValue());
	}*/
	
	//Set<Map.Entry<Integer,String>>entryval=map.entrySet();
	for(Map.Entry<Integer, String> mapVal:map.entrySet()) {
		System.out.println(mapVal.getKey()+ "- "+ mapVal.getValue());	
	}
  }
}
