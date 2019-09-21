package failedTestReRun;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestCase1 {

	@Test
	public void Test1() {
		Assert.assertTrue(true);
		System.out.println("First Test Method");
	}	
	
}
