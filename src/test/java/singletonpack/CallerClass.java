package singletonpack;

public class CallerClass {

	public static void main(String[] args) {
		
		SingletonClass ref= SingletonClass.callerMethod();
		SingletonClass ref1=SingletonClass.callerMethod();
		SingletonClass ref2=ref;
	}
}
