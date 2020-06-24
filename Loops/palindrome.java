package Loops;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=Integer.parseInt(args[0]);
	int copy=0,remainder=0,sum=0;
	copy=num;
	while(num!=0) {
		remainder=num%10;
		sum=sum*10+remainder;
		num=num/10;
	
	}
	if(copy==sum) {
		
		
		System.out.print(args[0]+" Number is Palindrome");
	}
	
	else {
		System.out.print(args[0]+" Number is Not a Palindrome");
	}
		
	}

}
