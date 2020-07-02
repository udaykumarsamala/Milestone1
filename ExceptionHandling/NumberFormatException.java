package ExceptionHandling;

import java.util.Scanner;

public class NumberFormatException {
	
	public static void main(String[] args) {
		
		try {
        String s1 ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer : ");
        s1=sc.nextLine();
        int a = Integer.parseInt(s1);
        long b = Long.parseLong(s1);
        System.out.println("The square value is: " +a*a);   
        System.out.println("The work has been done successfully");
 
        
         } catch (Exception e) {
            System.err.println("Entered input is not a valid format for an integer" + e);
        }
    }

}
