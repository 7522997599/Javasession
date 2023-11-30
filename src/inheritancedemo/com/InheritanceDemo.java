package inheritancedemo.com;


class A
{
	//Method  overidding-->Dynamic polymorphism
	//When you have a method in parent class and same method in the child class
	//it should have same name
	//with the same number of parameters
	//with the same sequence of parameters
	//with the same return
	
	
	void show()
	{
		System.out.println("This is the show method in parent class");
	}
	
	void read()
	{
		System.out.println("This is the read method in parent class");
	}
	
	void display(int a)
	{
		System.out.println("this is display method in parent class");
	}
	
	
	
}

//creating the child class syntax
//class child_name extends parent_class_name

class B extends A
{
	 
	@Override
	void show()
	{
		System.out.println("This is the  method in child class");
		System.out.println("Adde new implemenation in child class");
		
	}
	@Override
	void display(int a)
	{
		System.out.println("this is display method in parent class");
		
	}
	
	
	void write()
	{
		System.out.println("This is the  individual method in child class");	
	}

	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		System.out.println("***********Creating the object of Parent class***********");
		
		A obj =new A();
		obj.show();
		obj.read();
		obj.display(10);
		
		
		System.out.println("****************Creating the object of child class*************");
		
		B obj1=new B();
		obj1.show();//override-->inherited
		obj1.display(0);//override--inherited
		obj1.write();
		
		
		
		
		
		
		
		

	}

}
