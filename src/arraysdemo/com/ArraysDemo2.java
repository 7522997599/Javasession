package arraysdemo.com;

import java.util.Arrays;

public class ArraysDemo2 {

	//Second way
	//syntax
	/*
	 *declartion
	 * data_type[size_of_array] variable_name=new data_type[size_of_array];
	 * 
	 * inti
	 * data_type[size_of_array] variable_name=new data_type[size_of_array]{};
	 * 
	 */
	
	//example
	/*
	 * 
	 * 
	 * int[] array_Name = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		System.out.println(a.length);
		System.out.println(a[5]);
		
		System.out.println("********Priniting Array elements using for loop -->*******");
		 for(int i=0;i<a.length;i++) 
		 {
			 
			 System.out.println(a[i]);
			 
		 }
	
		//2.way
		 System.out.println("******Priniting Array elements with out using for loop -->****");
		 System.out.println(Arrays.toString(a));
		
	 
		 
		 //foreach loop
		 //syntax
		 /*
		  * for(dat_type new_variable_name:old_variable_name)
		  * {
		  * 
		  * 
		  * }
		  * 
		  * 
		  * 
		  * 
		  */
		System.out.println("Using For each loop");
		for(int aa:a)
		{
			System.out.println(aa);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
