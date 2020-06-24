package Arrays;

import java.util.Scanner;

public class Search_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
	//	int n=5;
		int a[]	= new int[n];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter all the elements::");
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		System.out.println("Enter element to search:");
		int search,flag=0;
		search=sc.nextInt();
		for(int i=0;i<a.length;i++) {
		        if(search==a[i]) {
		        	System.out.println(a[i]+" is found in index"+i);
		        	flag=1;
		        }
		}
           if(flag==0) {
        	   System.out.println("Element not found or -1 ");
           }
	}

}
