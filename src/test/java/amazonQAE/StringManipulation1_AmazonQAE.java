/*Given a sentence, reverse all the words in that sentence.
Eg. I/P : This is sample text
O/P : sihT si elpmas txet*/


package amazonQAE;

import org.testng.annotations.Test;

public class StringManipulation1_AmazonQAE {

	@Test
	public void testLogic() {
		
		String str="This is sample text";
		String strArr[]=str.split(" ");
		for(int i=0;i<strArr.length;i++) {
			String rev="";
			for(int j=strArr[i].toCharArray().length-1;j>=0;j--) {
				rev=rev+(strArr[i].toCharArray())[j];
			}
				System.out.println(rev);
			
			 
		}
	}
}
