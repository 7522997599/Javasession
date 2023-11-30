package conditionalstatementsdemo.com;

public class SwitchDemo {

	public static void main(String[] args) {
		//switch
		//syntax
		/*
		 * switch(expression)
		 * {
		 * 		case value1:
		 * 		statements
		 * 		break;
		 * 
		 * 		case value2:
		 * 		statements
		 * 		break;
		 * 
		 * 		case value3:
		 * 		statements
		 * 		break;
		 * 
		 * 		case value4:
		 * 		statements
		 * 		break;
		 * 
		 * 
		 *    	default:
		 * 		statements
		 * 		break;
		 * }
		 * 
		 */
		
		
		String browser="edge";
		
		switch(browser)
		{
			
		case "chrome":
			System.out.println("Launch the chrome browser");
			break;
		
		case "ie":
			System.out.println("Launch the ie browser");
			break;
		
		case "safari":
			System.out.println("Launch the safari browser");
			break;
		
		
		case "firefox":
			System.out.println("Launch the firefox browser");
			break;
		
		case "edge":
			System.out.println("Launch the edge browser");
			break;
		
	
			default:
				System.out.println("pass the vaild browser name");
				break;
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
