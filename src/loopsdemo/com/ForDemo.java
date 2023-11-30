package loopsdemo.com;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		//syntax
		/*
		 * variable_updation-->increment/decrement(++/--)
		 * for(variable_initialize;variable_condition;variable_updation)
		 * {
		 * 
		 * 		body
		 * 
		 * }
		 * 
		 */
		
		//1 to 20
		System.out.println("numbers from 1 to 20");
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
		
		
		//20 to 1
				System.out.println("numbers from 1 to 20");
				
				for(int i=20;i>=1;i--)
				{
					System.out.println(i);
				}
		
		
		/*		
				System.out.println("infinte for loop");
				
				for(;;)
				{
					System.out.println("Welcome to nucot");
				}
		
		*/
				
				
				
			System.out.println("Even numbers ");
			
				int e=2;
				for(;e<20;e++)
				{
					System.out.println(e);
				}		
				
				
				System.out.println("Odd numbers ");
				
				int o=1;
				for(;o<20;)
				{
					System.out.println(o);
					o=o+2;
				}			
		
			System.out.println("Alpha from a to z");	
				
			for(char c='a';c<='z';c++)
			{
				System.out.println(c);
			}
				
				
			System.out.println("Alpha from A to Z");	
			
			for(char cc='A';cc<='Z';cc++)
			{
				System.out.println(cc);
			}	
				
				
				
		
		int p=1;
			for(;true;)
			{
				System.out.println("welcome to nucot");
				if(p==5)
				{
					break;
				}
				p++;
				
			}
			
			
			
			
			
			System.out.println("Acii value of each character");	
			
			for(char ccc='a';ccc<='z';ccc++)
			{
				System.out.println((byte)ccc);
			}		
			
			
			System.out.println("tables");
			
			int n=12;
			for(int k=1;k<=10;k++)
			{
				System.out.printf("%d * %d = %d \n",n,k,n*k);
				
	
			}
			
			
			
			
				
		
		

	}

}
