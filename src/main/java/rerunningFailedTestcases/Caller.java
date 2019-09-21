package rerunningFailedTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Caller {

	@Test/*(retryAnalyzer=retryAnalyzer1.class)*/
	public void method1() {
		Assert.assertTrue(false);
	}
	
	@Test/*(retryAnalyzer=retryAnalyzer1.class)*/
	public void method2() {
		Assert.assertTrue(false);
	}
	
	@Test/*(retryAnalyzer=retryAnalyzer1.class)*/
	public void method3() {
		Assert.assertTrue(true);
	}
}
