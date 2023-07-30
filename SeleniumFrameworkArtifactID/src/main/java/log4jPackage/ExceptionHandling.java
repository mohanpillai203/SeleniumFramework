package log4jPackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			demofunction();
		} 
		catch (Exception e) {
			System.out.println("Iam inside catch block");
			System.out.println("Message: " +e.getMessage());
			System.out.println("Cause: " +e.getCause());
			e.printStackTrace(System.out);
		}
		finally {	
			System.out.println("Iam inside Finally block");
		}		
/*
 		try {
			System.out.println("Hello World22.......!");
			throw new ArithmeticException("Invalid operation");
			//int i = 1/0;
			//System.out.println("Completed");			
		}
		//you can have multiple catch blocks
		catch(Exception e) {		
			System.out.println("Iam inside catch block");
			System.out.println("Message: " +e.getMessage());
			System.out.println("Cause: " +e.getCause());
			e.printStackTrace(System.out);
		}
		
		finally {	
			System.out.println("Iam inside Finally block");
		}	
 */	
	}
	
	public static void demofunction() throws Exception {		
			System.out.println("Hello World22.......!");
			int i = 1/0;
			System.out.println("Completed");			
	}

}
