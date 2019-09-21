package rerunningFailedTestcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class RetryTransformer implements IAnnotationTransformer {

	
	public void transform(ITestAnnotation annotations, Class testclass, Constructor testconstructor, Method testmethod) {
 
		annotations.setRetryAnalyzer(retryAnalyzer1.class);

	}
}