package ExceptionHandling;

public class User_Defined_Exception_throw {
	 public static void main(String[] args) {

		  String name= args[0];
		  int age = Integer.parseInt(args[1]);
		  try {
		   if(age <=18 || age >=60)
		    
		   System.out.println("Name= "+ name+ " Age= "+ age);
		   throw new InvalidAgeException("Invalid Age");
		  }
		  catch(InvalidAgeException e) {
		   System.out.println(e);
		  }
		 }
		}
		class InvalidAgeException extends Exception{
		  InvalidAgeException(String age) {
		  super(age);
		 }

}
