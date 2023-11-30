package loopsdemo.com;

public class LoopsDemo {

	public static void main(String[] args) {
		
		//1 to 10
	/*	
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("9");
		System.out.println("10");
	*/	
		//1.while loop 
		//2.do while loop 
		//3.for loop and
		//4.foreach loop
		
		
		//1.while loop
		//syntax
		/*
		 * while(condition)
		 * {
		 * 		body or statements
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("*****normal numbers ******");
		int i=1;
		while(i<=20)
		{
			System.out.println(i);
			i++;
			
		}
		
		
		System.out.println("*****odd numbers******");
		int ii=1;
		
		while(ii<=20)
		{
			System.out.println(ii);
			ii=ii+2;
			
		}
		
		System.out.println("*****Even numbers******");
		
		int iii=2;
		
		while(iii<=20)
		{
			System.out.println(iii);
			iii=iii+2;
			
		}
		
	/*	System.out.println("*****Infinite loop using while******");
		
		
		
		while(true)
		{
			System.out.println("Wel come to Nucot ");
		}
		
	*/
		int j=1;
		
		while(true)
		{
			System.out.println("Wel come to Nucot ");
			if(j==5)
			{
				break;
			}
			
			j++;
		}
		
		
		System.out.println("tables");
		
		int n=12;
		int iiii=1;
		
		while(iiii<=10)
		{
			System.out.printf("%d * %d = %d \n",n,iiii,n*iiii);
			iiii++;
		}
		
		
		
		
		
		
		
	}

}
