package sampleSorting;

public class StudentClass {

	String name, location;
	int id;
	
	public StudentClass(int id, String name, String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
	}
	
	public String toString() {
		return this.id + "   "+ this.name + "  " + this.location;
	}
	
}
