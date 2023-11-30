package arraysdemo.com;

import java.util.Arrays;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		
		//Object is class in java-->Object is the super class of all the classes
		
		
		Object obj[]=new Object[5];
		obj[0]="Nucot";
		obj[1]=123;	
		obj[2]=1000.00;
		obj[3]='m';
		obj[4]="banaglore";
		
		System.out.println(obj.length);
		
		
		System.out.println(obj[2]);
		
		System.out.println(Arrays.toString(obj));
		
		
		
		for(Object obj1:obj)
		{
			System.out.println(obj1);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
