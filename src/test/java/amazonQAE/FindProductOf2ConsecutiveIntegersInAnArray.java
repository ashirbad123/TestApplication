package amazonQAE;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.mysql.cj.log.Log;

public class FindProductOf2ConsecutiveIntegersInAnArray {

	public void logicExplained(int arr[]) {
		
		int a=arr[0];
		int b=arr[1];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]*arr[j] > a*b) {
					
					a=arr[i];
					b=arr[j];
				}
				
			}
			
		}
		System.out.println(a +"  "+b +"  "+ "product of the numbers are:" + a*b);
		
	}
	
	public void Logic1(int arr[]) {
		int temp=1;
		Arrays.sort(arr);
		for(int i=arr.length-2;i<arr.length;i++) {
		temp=arr[i]*temp;
		
		}
		System.out.print("product of 2 consecutive integers are: "+temp);
		System.out.println("\n");
	}
	
	@Test
	public void caller() {
		int []arr= {3,8,-1,3,-2,0,1,-4,22};
		logicExplained(arr);
		System.out.println("****************************");
		Logic1(arr);
		}
		
	}

