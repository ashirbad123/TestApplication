package failedTestReRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestCases3 {

	
	@Test
	public void Test3() {
		Assert.assertTrue(false);
		System.out.println("Third Test Method");
	}
}
