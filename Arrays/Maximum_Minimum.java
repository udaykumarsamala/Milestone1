package Arrays;

import java.util.Arrays;

public class Maximum_Minimum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {48, 55, 68, 1, 101, 56};
		
		Arrays.sort(array);
		
		System.out.println("Minimum number in array : " + array[0]);
		System.out.println("Maximum in the array: " + array[array.length-1]);
	   

	}
}
