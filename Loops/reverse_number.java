package Loops;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int remainder=0,rev=0;
	
		while(num!=0) {
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		
		}
 System.out.print(rev);
	}

}
