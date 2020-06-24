package Loops;

public class Positive_Negative_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number=Integer.parseInt(args[0]);
     
     if(number>0) {
    	 System.out.println(number+"  is a positive number");
     }
     else if (number<0) {
    	 System.out.println(number+" is a negative number");
     }
     else{
    	 System.out.println(number+" number is a Zero");
     }
	}

}
