package arraysdemo.com;

public class SumDemo {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		
		int sum=0;
		
		System.out.println("The sum of all the numbers are");
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
		
		}
		
		System.out.println(sum);
		
		
		
		int aa[]= {1,2,3,4,5};
		
		
		int sum1=0;
		
		
		System.out.println("using for each loop");
		for(int aaa:aa)
		{
			
			sum1=sum1+aaa;
		}
		
		System.out.println(sum1);
		
		

	}

}
