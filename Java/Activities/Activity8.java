package activities;


class CustomException extends Exception{
	
	private String message=null;
	
	CustomException(String msg){
		
		message=msg;
	}
	
	@Override
	public String getMessage() {
	    return message;
	}
	
}

public class Activity8 {

	public static void main(String[] args) {
		
		try {
			exceptionTest("Will print to console");
			exceptionTest(null);
			Activity8.exceptionTest("Won't execute");
		
		} catch (CustomException e) {
			
			System.out.println("Error message : "+e.getMessage());
		}
		
	}
	
	public static void exceptionTest(String msg) throws CustomException {
		
		if(msg==null) {
			
			throw new CustomException("String value is null");
		}
		else {
			
			System.out.println(msg);
		}
	}

}
