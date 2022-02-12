package _15.Linear_Search;

import java.util.Arrays;

public class LinearSearch {
	public static boolean linearSearch(int[] arr, int elementToFind) {
		int i =0;
		//while loop start <-------------------
		while(i<arr.length) {
			if(arr[i] == elementToFind) {
				//element found
				return true;
			}
			++i;
		}//while loop end <------------------------------------
		
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80};
		System.out.println(Arrays.toString(arr));
		int elementToFind =20;
		System.out.println(linearSearch(arr, elementToFind));
		elementToFind =11;
		System.out.println(linearSearch(arr, elementToFind));
		
	}

}
