package Abstractdemo.com;



 abstract class AA
{
	//1.Any class prefixed with keyword abstract is called abstract class
		//2.We cannot create object for abstract class
		//3.It contains both implemented methods and unimplemented methods(abstract methods)
		
	 
	 
	 //syntax
	 /*
	  * abstract class class_name
	  * {
	  * 
	  * }
	  * 
	  * 
	  * 
	  */
		
		//implemented method//Method def
		
		void loginDetails()
		{
			System.out.println("This is login page");
		}
		
		void siginPage()
		{
			System.out.println("This is siginPage");
		}
		
		
		//unimplemented methods/Method declaration/Method Prototype//abstract
		
		abstract void homePage();
		
		abstract void productListPage();
		
}



class BB extends AA
{

	@Override
	void homePage() {
		
		System.out.println("homePage");
		
	}

	@Override
	void productListPage() {
		
		System.out.println("productListPage");
		
	}
	
	

	
	
}

public  class AbstractDemo {

	public static void main(String[] args)
	{
		
		//AA obj=new AA();
		BB obj1=new BB();
		obj1.loginDetails();
		obj1.siginPage();
		
		
		obj1.homePage();
		obj1.productListPage();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}


















