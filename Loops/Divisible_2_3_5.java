package Loops;

public class Divisible_2_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=Integer.parseInt(args[0]);
		int c=5,i=1;
		while(c>0) {
			if(i%2==0 && i%3==0 && i%5==0) {
				System.out.println(i+" ");
				c--;
			}
			i++;
		}

	}

}
