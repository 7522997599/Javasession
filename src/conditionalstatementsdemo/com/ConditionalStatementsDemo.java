package conditionalstatementsdemo.com;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {
		
		
		
		int a=2;
		int b=5;
		
		
		//syntax
		/*
		 * if(condition)
		 * {
		 * 
		 * 		boby
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		System.out.println(a==b);
		
		
		if(a==b)
		{
			System.out.println("both are equal");
			
			
		}
		
		
		System.out.println("Bye");
		
		
		//if else
		//syntax
		/*
		 * 
		 * if(condition)
		 * {
		 * 
		 * }
		 * else
		 * {
		 * 
		 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		a=5;
		b=5;
		
		
		if(a==b)
		{
			
			System.out.println("a and b values are same");
			
		}
		else
		{
			System.out.println("a and b values are not same");
		}
		
		
		a=5;
		b=9;
		if(a>b)
		{
			System.out.println("a value is greter than b ");
			
		}
		else
		{
			System.out.println("a value is not greter than b");
			
		}
		
		
		boolean bb=true;
		
		if(bb)
		{
			System.out.println("Wel come to Nucot");
		}
		
		else
		{
			System.out.println("Thanks");
		}
		
		
		//nested if statement
		//syntax
		/*
		 * if(condition)
		 * {
		 * 
		 * 	if(condiotion)
		 * 	{
		 * 		if(condiotion)
		 * 		{
		 * 
		 * 		}
		 *
		 * 	}
		 * 
		 * }
		 * 
		 * 
		 */
		
		
		
		int n=80;
		if(n<=100)
		{
			System.out.println("Cal your marks");
			
			if(n>=90)
			{
					System.out.println("A");	
					
					
					if(n==95)
					{
						
						System.out.println("Excellent");
						
						
					}
					
					
					
			}
			
			
		}
		
		else
		{
			System.out.println("Pass vaild marks");
			if(n>=100)
			{
				System.out.println("Grade B");
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
