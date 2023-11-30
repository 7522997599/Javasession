package Datatypesdemo.com;

public class Stringdemo {

	public static void main(String[] args) {
		//Anything you enclose between double quotes is called String
		
		//declaration of the String
		String ss;
		
		
		//Init of the String
		String s="nucot";
		
		
		//StringConcatenations
		
		int a=2;
		int b=4;
		System.out.println(a+b);//addition
		
		
		String s1="nucot";
		String s2="company";
		System.out.println(s1+s2);//concatenations
		
		System.out.println(a+s1);//
		
		System.out.println(a+s1+s2);//
		
		System.out.println(a+b+s1+s2);
		
		System.out.println(s1+s2+a+b);
	
		System.out.println(s1+s2+(a+b));
		
		System.out.println(a+b+s1+s2+a+b);
		
		System.out.println(a+b+s1+s2+(a+b));
		
		System.out.println(a+b+s1+s2+(a+b)+s1+s2);
		
		
		
		char c='a';
		System.out.println(c+s1);
		
		System.out.println(s1+c);
		
		
		//assignments using plus(+)with string and other data types
		
		
		System.out.println(a+c);
		
		System.out.println(a+'$');
		
		//To find the acii value of each character present in the keyboard
		System.out.println((byte)'$');
		
		System.out.println((byte)'a');
		
		System.out.println((byte)'.');
		
		System.out.println((byte)'!');
		
		System.out.println((byte)'A');
		
		

	}

}
