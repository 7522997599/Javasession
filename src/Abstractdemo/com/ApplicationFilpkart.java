package Abstractdemo.com;
 interface Application 
 
 {
	 abstract void cart ();
	 abstract void payment ();
	 
 }
 class signin implements Application 
 {

	@Override
	public void cart() {
		System.out.println("*****cart*****");
		
	}

	@Override
	public void payment() {
		System.out.println("******payment******");
		}
 }
	public class ApplicationFilpkart {
	public static void main (String[ ] agrs)
	{
		signin obj=new signin ();
		obj.cart();
		obj.payment();
				
	}	
	 
 }
 
	 
	

