package Polymorphismdemo.com;

public class MethodOverLoadingDemo {


	//1.Compile time Polymorphism(static)
	//Example-->Method overloading
	//Method overloading will happens in single class
	//1.with in the class,if you have mutiple methods
	//a.method name should be always same 
	//b.with the different parameters
	//c.with different number of parameters
	//d.with different order of parameters

	void add(int a,int b)
	{
		
		System.out.println("Adding two numbers");
		int sum=a+b;
		System.out.println(sum);	
		
	}
		

	void add(int a,int b,int c)
	{
		System.out.println("Adding two numbers");
		int sum=a+b+c;
		System.out.println(sum);	
		
		
	}
	
	
	void add(int a,int b,int c,int d)
	{
		System.out.println("Adding two numbers");
		int sum=a+b+c+d;
		System.out.println(sum);	
		
	}
	
	
	void add(int a,int b,int c,int d,int e)
	{
		
		System.out.println("Adding two numbers");
		int sum=a+b+c+d+e;
		System.out.println(sum);	
		
	}

	
	public static void main(String[] args) {
		
		MethodOverLoadingDemo obj=new MethodOverLoadingDemo();
		
		obj.add(1, 2);
		
		obj.add(1, 2,3);
		
		obj.add(1, 2,3,4);
		
		obj.add(1, 2,3,4,5);

	}

}
