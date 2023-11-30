package Abstractdemo.com;



abstract class Calculator
{
	
	
	//implemented methods
	void show()
	{
		System.out.println("This is calculator");
	}
	
	
	void add()
	{
		System.out.println("add");
	
	}
	
	void sub()
	{
		System.out.println("sub");
	
	}
	
	
	//unimplemented methods
	
	abstract void mul();
	abstract void div();
	
	
	
}


class Mobile extends Calculator
{

	@Override
	void mul() {
		
		System.out.println("Mul");
		
	}

	@Override
	void div() {
		
		System.out.println("div");
	}

	
}






public class CalculatorDemo {

	public static void main(String[] args) {
		//Calculator obj =new Calculator();//not supported
		
		
		Mobile obj1=new Mobile();
		obj1.show();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
	}

}
