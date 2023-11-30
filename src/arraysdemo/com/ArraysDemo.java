package arraysdemo.com;
import java.util.Arrays;

public class ArraysDemo {

	//An array is a collection of items of same data type stored at contiguous memory locations. 
	//similar items
	//We have different types of arrays
	//1.one dimensional array-->1Darray-declaration
	
	//syntax
	/*
	 * 
	 * data_type variable_name[];
	 * 
	 * 
	 * or
	 * 
	 * data_type[] variable_name;
	 * 
	 * 
	 * example int a[];
	 * or
	 * int[] a;
	 * 
	 * 
	 * 
	 */
	
	//1.one dimensional array-->1Darray-init
	
		//syntax
		/*
		 * 
		 * data_type variable_name[size_of_array]={val1,val2,val3......nval};
		 * 
		 * 
		 * or
		 * 
		 * data_type[size_of_array] variable_name={val1,val2,val3......nval};;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int a[5]={1,2,3,4,5};
		 * 
		 * or
		 * 
		 * int[5] a={1,2,3,4,5};
		 * 
		 */
	
	
	
	
	public static void main(String[] args) {

		int a[]={4,6,2,1,3};
	
		System.out.println(a.length);
		
		System.out.println(a[2]);
		System.out.println(a[3]);
		//1.way
		System.out.println("Priniting Array elements using for loop -->");
		 for(int i=0;i<a.length;i++) 
		 {
			 
			 System.out.println(a[i]);
			 
		 }
		
		//2.way
		 System.out.println("Priniting Array elements with out using for loop -->");
		 System.out.println(Arrays.toString(a));
		
		 
		 
		 //3.way
		 
		 System.out.println("using for each loop");
		 
		 for(int aa:a)
		 {
			 System.out.println(aa);
			 
		 }
		 
		 
		 
		
		 //manipulating characters
		 
		 System.out.println("**********manipulating characters***************");
		 char c[]= {'n','u','c','o'};
		 System.out.println(c.length);
		 
		 System.out.println(c[2]);
		
		 System.out.println(c[3]);
		 
		// System.out.println(c[4]);
		
		//1.way
			System.out.println("Priniting Array elements using for loop -->");
			 for(int i=0;i<c.length;i++) 
			 {
				 
				 System.out.println(c[i]);
				 
			 }
		
			//2.way
			 System.out.println("Priniting Array elements with out using for loop -->");
			 System.out.println(Arrays.toString(c));
			
		
			 //3.way
			 System.out.println("using for each loop");
			 
			 for(char cc:c)
			 {
				 System.out.println(cc);
				 
			 }
			

			 //manipulating Strings
			 
			 System.out.println("**********manipulating characters***************");
			 String s[]= {"nucot","Api","Selenium","Jenkins"};
			 System.out.println(s.length);
			 
			 System.out.println(s[2]);
			
			 System.out.println(s[3]);
			 
			// System.out.println(c[4]);
			
			//1.way
				System.out.println("********Priniting Array elements using for loop -->*******");
				 for(int i=0;i<s.length;i++) 
				 {
					 
					 System.out.println(s[i]);
					 
				 }
			
				//2.way
				 System.out.println("******Priniting Array elements with out using for loop -->****");
				 System.out.println(Arrays.toString(s));
				
				 //3.way
				 System.out.println("using for each loop");
				 
				 for(String ss:s)
				 {
					 System.out.println(ss);
					 
				 }
			 
			 
			 
			 
		
		
	}

}
