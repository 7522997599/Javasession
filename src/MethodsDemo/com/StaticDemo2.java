package MethodsDemo.com;

public class StaticDemo2 {

	
	static int count=0;
	
	public void incrementCount()
	{
		count++;
		//System.out.println(count);
		
	}
	
	public static  void doubleCount()
	{
		count++;
		System.out.println(count);
		
	}
	

	public static void main(String[] args) {
		//All the objects are shared the same copy
		StaticDemo2 obj1=new StaticDemo2();
		StaticDemo2 obj2=new StaticDemo2();
		StaticDemo2 obj3=new StaticDemo2();
		StaticDemo2 obj4=new StaticDemo2();
		obj1.incrementCount();
		obj2.incrementCount();
		obj3.incrementCount();
		obj4.incrementCount();
		System.out.println("First object " + obj1.count);
		System.out.println("Second object "+ obj2.count);
		System.out.println("Third object "+ obj3.count);
		System.out.println("Fourth object "+ obj4.count);
		
		doubleCount();
		
		
	}

}
