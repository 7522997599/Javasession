package ClassesandObjectDemo;

public class Student {

	//class variables or global variables
	
	String name;
	int usn;
	String address;
	
	//methods
	
	void show()
	{
		System.out.println("this is show");
		
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		System.out.println(obj.name="nucot");
		System.out.println(obj.usn=123);
		System.out.println(obj.address="bangalore");
		
		obj.show();
		
		
		
		
		
		
		
		
		
		
		

	}

}
