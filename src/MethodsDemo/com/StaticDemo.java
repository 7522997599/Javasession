package MethodsDemo.com;

public class StaticDemo {

	//static is keyword---the main purpose of static is how objects are managed in the memory
	//static keyword can be used
	//variables,methods,classes,blocks
	
	//class variables
	int a;
	static int c;
	
	
	
	void show()
	{
		//local variables
		int b=10;
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	}
	
	static void display()
	{
		
		System.out.println("this is display method");
		
	}


	
	public static void main(String[] args) {
		
		StaticDemo obj=new StaticDemo();
		
		System.out.println(obj.a=2);
		
		obj.show();
		
		
		//static data can be executed by using two ways
		
		//1.first way
		System.out.println("First way");
		//class_name.dataname
		System.out.println(StaticDemo.c=30);
		StaticDemo.display();
		
		
		
		System.out.println("Second way");
		//2.second way
		
		//variable_name or method_name
		
		System.out.println(c=20);
		display();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
