package starPrograms;

import org.testng.annotations.Test;

public class Pattern1 {

	//==========================================================================================		
	
/* pattern 1
   
****
***
**
*

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/

 
/*  @Test
	public void pattern1() {
		
		for(int i=6;i>1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}*/
	
//==========================================================================================	
	/*
	5 4 3 2 1 
	4 3 2 1 
	3 2 1 
	2 1 
	1 
	*/
	
	
	@Test
	public void pattern1() {
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	//==========================================================================================		
	
	/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	
	*/
 /* @Test
 	public void pattern2() {
 		
 		for(int i=1;i<6;i++) {
 			for(int j=1;j<i;j++) {
 				System.out.print(j+" ");
 			}
 			System.out.println();
 		}
 		
 	}
	*/

	//==========================================================================================	
	
	/*
	Pattern 2
	 
	*
	**
	***
	****
	@Test
	public void pattern1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
}
