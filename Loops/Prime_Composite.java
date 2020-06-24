package Loops;

public class Prime_Composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.out.println("Please enter an integer number : ");
			int n=Integer.parseInt(args[0]);
		  
			int f=0;
			if(n==0 || n==1) {
				System.out.println(args[0]+" is neither prime nor composite");
			}
			else {
				
			for(int i=2;i<=n/2;i++)
			{
			if(n%i==0)
			{
			System.out.println(args[0]+" The number is not prime");
			f=1;
			break;
			}
			}
			if(f==0)
			{
			System.out.println(args[0]+" The number is prime");
			}
			
			}
	}

	

}
