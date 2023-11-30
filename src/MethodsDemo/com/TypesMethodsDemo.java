package MethodsDemo.com;

public class TypesMethodsDemo {

	
	//class variables
		int i=10;
	
	//methods-->class data members
	
	//1.No input and No return type
	
	/*
	 * data_type  method_name()
	 * {
	 * 
	 * 		body
	 * 		statements
	 * 
	 * 
	 * }
	 * 
	 */
	void show()
	{
		System.out.println("this show");
	}
	void add()
	{
		//local variables
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println(c);
	
	}
	
	
	//2.no input but some return type
	/*
	 * 
	 * data_type method_name()
	 * {
	 * 		body
	 * 
	 * 
	 * }
	 */
	
	int add1()
	{
		int aa=20;
		int bb=30;
		int cc=aa+bb;
		return cc;	
	}
	
	
	String companyName()
	{
		String name="Nucot";
		return name;
		
		
	}
	
	
	char getGender()
	{
		
		System.out.println("the gender is ");
		char ccc='m';
		return ccc;
		
	}
	
	
	float salary()
	{
		int noofDays=30;
		int amountperday=200;
		
		float total_salary=noofDays+amountperday;
		
		return total_salary;
		

	}
	
	
	//3.having input and return type
	
	/*
	 * 
	 * 
	 * data_type method_name(arguments)
	 * {
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	int add2(int a,int b)
	{
		int sum=a+b;
		return sum;
		
	}
	
	
	
	
	String trainerName(String name1)
	{
		String name11=name1;
		return name11;
		
		
	}
	
	
	
	//4.having some inputs and no return type
	
	/*
	 * 
	 * data_type method_name(argauments)
	 * {
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	void add3(int c,int d)
	{
		int e=c+d;
		
		System.out.println(e);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		TypesMethodsDemo  obj=new TypesMethodsDemo();
		
		System.out.println("First type");
		//1.
		obj.show();
		obj.add();
		
		
		System.out.println("Second type");
		
		//2.
		int sum=obj.add1();
		System.out.println(sum);
		
		String cname=obj.companyName();
		System.out.println(cname);
		
		
		char gender=obj.getGender();
		System.out.println(gender);
		
		
		float sal=obj.salary();
		System.out.println(sal);
		
		System.out.println("Third type");
		
		//3.
		
		int sum1=obj.add2(13,3);
		System.out.println(sum1 );
		
		String nname=obj.trainerName("abc");
		System.out.println(nname);
		
		
		
		//4.
		
		obj.add3(15,5);
		
	}

}
