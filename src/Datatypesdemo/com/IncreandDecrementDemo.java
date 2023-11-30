package Datatypesdemo.com;

public class IncreandDecrementDemo {

	public static void main(String[] args) {
		/*
		//increment operator-->++
		//a)Post increment operator--->a++
				a
				a+1
		*/
		
		
		/*
			b)Pre increment operator--->++a
					a+1
					a
		*/
		/*
			post decrement operator-->--
			
			a)Post decrement operator-->a--
		
					a
					a-1
	*/	
		/*
			b)Pre decrement operator--->--a
		
					a-1
					a
					
		*/
		
		
	System.out.println("******************Increment operator*************************");	
	
	/*	
			a)Post increment operator--->a++
			a
			a+1
   */
		
		
	System.out.println("Post increment");
	
	
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		
		
		int aa=3;
		int bb=aa++;
		System.out.println(aa);
		System.out.println(bb);
		
		
		System.out.println("Post decrement");
		
		
		int aaa=1;
		int bbb=aaa--;
		System.out.println(aaa);
		System.out.println(bbb);
		
		
		
		int aaaa=3;
		int bbbb=aaaa--;
		System.out.println(aaaa);
		System.out.println(bbbb);
		
		
		
		
		
		
		System.out.println("Pre increment");
		
		
		int a1=1;
		int b1=++a1;
		System.out.println(a1);
		System.out.println(b1);
		
		
		
		int a2=3;
		int b2=--a2;
		System.out.println(a2);
		System.out.println(b2);
		
		
		
		
		
		
				
		
		
		
	}

}
