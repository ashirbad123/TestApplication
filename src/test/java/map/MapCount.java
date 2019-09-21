package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class MapCount {

	//Word count.
	@Test
	public void wordCount() {
		
		String str="Shane Robert Watson is an Australian international cricketer who has played for Australia’s national cricket team and currently plays for Chennai Super Kings in the Indian Premier League and Quetta Gladiators in the Pakistan Super League respectively";
		String[]arr=str.toLowerCase().split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String word:arr) {
			if(map.containsKey(word)) {
				map.put(word,map.get(word)+1);
			}
			else
			map.put(word,1);
			
			
		}
		System.out.println(map);
		Iterator<HashMap.Entry<String,Integer>>itr=map.entrySet().iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next().getKey());
		 }
		/* while(itr.hasNext()) {
			 System.out.println(itr.next().getValue());
		 }*/
	}
	
	//character count.
	@Test
	public void charCount() {
		String str="Shane Robert Watson is an Australian international cricketer who has played for Australia’s national cricket team and currently plays for Chennai Super Kings in the Indian Premier League and Quetta Gladiators in the Pakistan Super League respectively";
		
		char[]arr=str.replace(" ","").toLowerCase().toCharArray();
		Map<Character,Integer>charmap=new HashMap<Character, Integer>();
		for(char ch:arr) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch,charmap.get(ch)+1);
			}
			else
				charmap.put(ch,1);
		}
			System.out.println(charmap);
		Iterator<Map.Entry<Character,Integer>>itr=charmap.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getKey());
		}
	}
}
