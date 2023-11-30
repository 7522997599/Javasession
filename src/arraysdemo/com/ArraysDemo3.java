package arraysdemo.com;

public class ArraysDemo3 {

	public static void main(String[] args) {
		//Array limitations
		
		//1.Size of fixed--->This can be resolved by using dynamic array(Collections)
		//2.Similar data type of items-->To resolve this we have use Object array
		
		
		
		
		//Array literals
		int a[]= {1,2,3,4,5};
		
		System.out.println(a[4]);
		//System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		System.out.println(a[-1]);////ArrayIndexOutOfBoundsException
		
		
		
		//Arrays using new keyword
		
		int[] aa=new int[2];
		aa[0]=1;
		aa[1]=2;
		
		
		
		
		
		
		
	}

}
