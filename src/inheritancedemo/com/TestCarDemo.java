package inheritancedemo.com;

public class TestCarDemo {

	public static void main(String[] args) {
		
		
		CarDemo obj=new CarDemo();
		obj.startButton();
		obj.stopButton();
		obj.fuelTank();
	
		
		 Audi obj1=new  Audi();
		 obj1.startButton();////overrding
		 obj1.stopButton();//inherit
		 obj1.fuelTank();//inherit
		 obj1.autoDriving();//indiv
		
		
		BMW obj2=new BMW();
		obj2.startButton();//overrding
		obj2.autoGearing();//indiv
		obj2.stopButton();//inherit
		obj2.fuelTank();//inherit
	
		

	}

}
