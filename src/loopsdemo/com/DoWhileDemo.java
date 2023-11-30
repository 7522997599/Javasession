package loopsdemo.com;

public class DoWhileDemo {

	public static void main(String[] args) {
		//do while loop
		//syntax
		/*
		 * 
		 * do
		 * {
		 * 
		 * 
		 * }
		 * while(condition);
		 * 
		 * 
		 * 
		 * 
		 */
		//1 to 20
		
		System.out.println("**** numbers from 1 to 20****");
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			
		}while(i<=20);
		
		System.out.println("Bye");
		
	/*	System.out.println("**** infinite loop****");
		
		
		int ii=1;
		do
		{
			System.out.println(ii);
			//ii++;
			
		}while(ii<=20);
	*/	
		
System.out.println("**** even numbers****");
		
		
		int iii=2;
		do
		{
			System.out.println(iii);
			iii=iii+2;
			
		}while(iii<=20);
		
		
		
System.out.println("****odd numbers****");
		
		
		int iiii=1;
		do
		{
			System.out.println(iiii);
			iiii=iiii+2;
			
		}while(iiii<=20);
		
		
		System.out.println("tables");
		
		int n=12;
		int iiiii=1;
		
		do
		{
			System.out.printf("%d * %d = %d \n",n,iiiii,n*iiiii);
			iiiii++;
		}while(iiiii<=10);
	
		
	
	System.out.println("***20 to 1***");	
		byte b=20;
		
		do
		{
			System.out.println(b);
			b--;
			
		}while(b>=1);
		
		
		System.out.println("**a to z***");	
		char c='a';
		
		do
		{
			System.out.println(c);
			c++;
			
		}while(c<='z');
		
			
		
		
		

	}

}
