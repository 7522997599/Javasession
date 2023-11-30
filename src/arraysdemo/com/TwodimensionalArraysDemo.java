package arraysdemo.com;

public class TwodimensionalArraysDemo {

	public static void main(String[] args) {
		
		
		
		//2Darray->Multidimensional array->array of array
		
		
		//Array Literals
		
		//syntax
		/*
		 * data_type arrayname[][]={{val1,val2},{val3,val4}};
		 * 
		 * or
		 * 
		 * data_type arrayname[][]=new  data_type[r_size][c_size];
		 * 
		 * arrayname[0][0]=val1;
		 * arrayname[0][1]=val2;
		 * arrayname[1][0]=val3;
		 * arrayname[1]10]=val3;
		 * 
		 */
		
		
		
		int a[][]= {{1,2},{3,4}};
		System.out.println("First row Length-->"+a[0].length);
		System.out.println("Second row Length-->"+a[1].length);
		
		System.out.println(a[0][0]);
		
		System.out.println(a[0][1]);
		
		System.out.println(a[1][0]);
		
		System.out.println(a[1][1]);
		
		System.out.println("The values are");
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
				
			}
			
			
			
		}
		
		
		
		System.out.println("Using For each loop");
		
		
		
		for(int[] aa:a)
		{
			
			for(int   aaa:aa)
			{
			
				System.out.println(aaa);
			}
			
		}
		
		//adding two values
		System.out.println(a[0][0]+a[1][1]);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
