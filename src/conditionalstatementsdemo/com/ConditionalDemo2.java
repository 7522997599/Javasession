package conditionalstatementsdemo.com;

public class ConditionalDemo2 {

	public static void main(String[] args) {
		
		//nested if else
		
		
		int a=60;
		int b=40;
		int c=90;
		
		if(a>=b && a>=c)
		{	
			System.out.println("A is greatest");
			
		}
		
		else if(b>=a && b>=c)
		{
			System.out.println("B is the greatest");
			
			
		}
		else
		{
			System.out.println("C is the greatest");
		}
		
		
		
		
		

	}

}
