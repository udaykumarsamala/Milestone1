package ExceptionHandling;

class InvalidCountryException extends Exception{
	InvalidCountryException()
	{
		System.out.println("Invalid");
	}
	InvalidCountryException(String s){
		System.out.println(s);
	}
}


public class UserRegistration {
	
	public void registeruser(String username,String userCountry) throws InvalidCountryException {
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException("User Outside India  cannot be registered");
		}
		else {
			System.out.println("User registration done successfully");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             UserRegistration ur=new UserRegistration();
             try {
            	 ur.registeruser("Uday","us");
             }
             catch(InvalidCountryException e) {
            	 
            	 System.out.println(e);
             }
	}

}
