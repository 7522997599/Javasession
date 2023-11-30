package MethodsDemo.com;

public class StaticDemo3 {

	
	int a;
	static int c;
	
	void show()
	{
		System.out.println("this is show method");
	}
	
	
	static void display()
	{
		System.out.println("this is display method");
	}
	
	
	
	static
	{
		c=20;
		System.out.println(c);
		System.out.println("Welcome amazon application");
		System.out.println("Welcome amazon application");
		System.out.println("Welcome amazon application");
		System.out.println("Welcome amazon application");
		System.out.println("Welcome amazon application");
			
	}
	
	public static void main(String[] args) {
		
		StaticDemo3 obj=new StaticDemo3();
		obj.show();
		display();
		
		
	}

}
