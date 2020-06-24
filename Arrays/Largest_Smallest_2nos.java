package Arrays;

import java.util.Arrays;

public class Largest_Smallest_2nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {48, 55, 68, 1, 101, 56};
		
		Arrays.sort(array);
		
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);

	}

}
