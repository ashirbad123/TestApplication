package amazonQAE;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindNearestPalindrom {

	@Test
	public void numberChecker() {
		
		System.out.println("Enter a number");
		Scanner scan= new Scanner(System.in);
		int num=Integer.parseInt(scan.nextLine());
			int flag=0;
			while(flag==0) {
				    int rev=testPalindromLogic(num);
					if(rev==num) {
						flag=1;
						num++;
					 }
					}
			System.out.println(num);
		
	}
	
	public int testPalindromLogic(int num) {
		
		int rev=0;
		int r;
		int temp=num;
		System.out.println("Supplied Number is: " +num );
		while(num>0) {
		 r=num%10;	
		 rev= r+(rev*10);
		 num=num/10;
		}
		System.out.println("reverse Number is: " +rev );
		if(temp==rev) {
		System.out.println("palindrom");	
		}
		else {
			System.out.println("Not Palindrom");
		
			}
		return rev;
	}
}
