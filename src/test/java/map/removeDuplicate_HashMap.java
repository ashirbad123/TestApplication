package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.testng.annotations.Test;

//Remove duplicate from string by using hashmap and print
//A string is a data type used in programming, such as an integer and floating point unit, but is used to represent text rather than numbers. It is comprised of a set of characters that can also contain spaces and numbers
public class removeDuplicate_HashMap {

	Map<String, Integer> wordmap=new HashMap<String, Integer>();;
	@Test
	public void findDuplicate() {
	System.out.println("Enter a String");
	
	Scanner scan= new Scanner(System.in);
	
	String temp=scan.nextLine();
	String str[]=temp.toLowerCase().split(" ");
	scan.close();
	
	//System.out.println(str[1]);
		for(String word:str) {
		if(wordmap.containsKey(word)) 
		{
			wordmap.remove(word);
			//wordmap.put(word,wordmap.get(word)+1);
		}
		else 
		{
			wordmap.put(word, 1);
		}
	}
		
	//System.out.println(wordmap);
	//Getting only the values which is nothing the keys.
	/*Iterator<Map.Entry<String,Integer>>itr=wordmap.entrySet().iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next().getKey());
	 }*/
	 
	 for(Map.Entry<String,Integer>value:wordmap.entrySet()) {
		 System.out.println(value.getKey());
	 }
	 
	// System.out.println("*************************************************************");
	 /*Set<String> values=wordmap.keySet();
	 for(String value:wordmap.keySet()) {
		 System.out.println(value);
	 }*/
	 
  }
	
}
