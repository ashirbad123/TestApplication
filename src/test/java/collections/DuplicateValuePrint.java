package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class DuplicateValuePrint {
	
	@Test
	public void duplciateDataChecker() {
		List <String>lst=new ArrayList<String>();
		String [] data= {"jeff","annie","kriss","harry","amit","uli","annie","amit"};
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String value:data) {
			if(map.containsKey(value)) {
				lst.add(value);
				//System.out.println("Duplicate value is:"+value);
				//map.remove(value);
			}
			else {
				map.put(value,1);
			}
		}
		System.out.println("Duplicate values are:- " +lst);
		System.out.println("==============================================");
		Iterator<Map.Entry<String, Integer>>itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getKey() );
		}
		
	}

}
