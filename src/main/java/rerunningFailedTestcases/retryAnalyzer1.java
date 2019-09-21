package rerunningFailedTestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer1 implements IRetryAnalyzer{
	int minTry=0;
	int maxTry=5;
	
	public boolean retry(ITestResult result) {
		
		
		if(minTry<=maxTry) {
			System.out.println("test cases re-executed is:"+result.getName());
			System.out.println("count is: "+minTry++);
			minTry++;
			return true;
			
		}
		return false;
	}

}
