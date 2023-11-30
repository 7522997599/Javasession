package Polymorphismdemo.com;

public class MethodOverloadingDemo2 {
	

	public String searchProduct(String name)
	{
		
		String name1=name;
		System.out.println("Searching the product based on the name");
		return  name;
	}
	
	public void searchProduct(String name ,int price)
	{
		System.out.println("Searching the product based on the name and price");
	}
	
	public void searchProduct(int price,int rating,String brand)
	{
		System.out.println("Searching the product based on the price rating and brand");
	}
	
	public void searchProduct(String name,int price,int discout )
	{
		System.out.println("Searching the product based on the name price and discout");
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo2 obj=new MethodOverloadingDemo2();
		obj.searchProduct("Mobile phone");		
		obj.searchProduct("Mobile phone",10000);
		obj.searchProduct(10000,4,"Iphone");
		obj.searchProduct("Mobile phone",10000,60);
		//first way
		MethodOverloadingDemo2.main("Mobile phone",10000);
		
		MethodOverloadingDemo2.main(10000,"Mobile phone");
		//second way
		main("Mobile phone",10000,4);
		

	}
	public static void main(String name,int a) {
		
		System.out.println("Static method with two args");
	

	}
	public static void main(int a,String name) {
	
		System.out.println("Static method with two args with diff order");

	}

	public static void main(String name,int a,int b) {
	
		System.out.println("Static method with three args with diff order");

	}



}
