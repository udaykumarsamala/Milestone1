package Loops;

public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				flag=1;
				
			}
		}

		if(flag==0) {
			System.out.println(a+" is a Prime Number");
		}
		else
			System.out.println(a+" is Not a Prime Number");
	}

}
