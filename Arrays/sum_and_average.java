package Arrays;

import java.util.Scanner;

public class sum_and_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, sum = 0;
	        float average;
	        Scanner sc = new Scanner(System.in);
	      //  System.out.print("Enter no. of elements you want in array:");
	        n =Integer.parseInt(args[0]);
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = sc.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println("Sum: "+sum);
	        average = sum / n;
	        System.out.println("Average: "+average);

	}

}
