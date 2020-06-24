package Loops;

public class sum_of_all_the_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int remainder=0,sum=0;
	
		while(num!=0) {
			remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		
		}
		System.out.print(args[0]+" The sum of all digits is: "+sum);

	}

}
