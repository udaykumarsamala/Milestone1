package Arrays;

import java.util.Arrays;

public class sort_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int arr[]= {2,7,1,6,5},i,j,temp;
			
			
			
			for(i=0;i<arr.length;i++)
			{
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
			}
			for(i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			
			

		}

	

}
