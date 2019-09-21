package failedTestReRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestCases2 {
	@Test
	public void Test2() {
		Assert.assertTrue(true);
		System.out.println("Second Test Method");
	}
	
}
