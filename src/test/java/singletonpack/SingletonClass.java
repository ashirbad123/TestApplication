package singletonpack;

public class SingletonClass {

	private static SingletonClass ref=null;
	
	//private constructor
	private SingletonClass() {
		System.out.println("Constructor is defined as private");
		System.out.println("No additional constructor will be created");
	}
	
	//public method
	public static SingletonClass callerMethod() {

		if(ref==null)
		{
			ref=new SingletonClass();
		}
		return ref;
	}
}
