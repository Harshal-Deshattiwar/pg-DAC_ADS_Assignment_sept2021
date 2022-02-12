package _24DescendingHeapSort;

import java.util.Arrays;

public class HeapSortGeekForGeek {

public static void HeapSortDesc(int[] arr) {
		
		ConvertToHeap(arr,arr.length);
		
		for(int lastChildPos = arr.length-1; lastChildPos > 0; --lastChildPos) {
			 int temp =arr[0];
			 arr[0] = arr [lastChildPos];
			 arr [lastChildPos] = temp;
			 ConvertToHeap(arr,lastChildPos);
		}
	
	}
	
	public static void ConvertToHeap(int[] arr, int size) {
		int last_parent = (size / 2) - 1;
		for (int current = last_parent; current >= 0; --current) {
			MakeMinHeap(arr, size, current);
		}
	}
		
	private static void MakeMinHeap(int[] arr, int size, int current) {
			int minChildPos = 2*current + 1;
			int rightChildPos = (2*current + 1)+1;
			if(rightChildPos < size) {
				//right child exists
				if(arr[rightChildPos] < arr[minChildPos]) {
					minChildPos = rightChildPos;
				}
			}
			
			if(arr[current] < arr[minChildPos]) {
				return;
			}
			
			int temp = arr[current];
			arr[current] = arr[minChildPos];
			arr[minChildPos] = temp;
			
			if((2*minChildPos + 1) < size) {
				MakeMinHeap(arr, size, minChildPos);
			}
			
			
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 1, 9, 5, 17, 90, 6, 2 };

		System.out.println("Unsorted array = " + Arrays.toString((arr)));
		HeapSortDesc(arr);
		System.out.println("Sorted array   = " + Arrays.toString((arr)));
	}
}
