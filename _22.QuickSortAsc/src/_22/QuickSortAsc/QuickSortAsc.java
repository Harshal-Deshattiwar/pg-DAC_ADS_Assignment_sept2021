package _22.QuickSortAsc;

import java.util.Arrays;

public class QuickSortAsc {
	public static int partition(int[]arr,int start, int end) {
		int pivot=arr[start];
		int i=start;
		int j=end;
		
		while(i<j) {
			
			while(i<j && arr[--j] >= pivot);
			if(i<j) {
				arr[i]=arr[j];
			}	
			
			while(i<j  &&  arr[++i]<=pivot);
			
			if(i<j) {
				arr[j]=arr[i];
			}
		}
		arr[j]=pivot;
		return j;
	}
	public static void quickSortAsc(int[] arr,int start ,int end) {
		if(end-start<2)
			return;
		
		int pivoteIndex= partition(arr,start,end);
		quickSortAsc(arr, start, pivoteIndex);
		quickSortAsc(arr,pivoteIndex+1,end);
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		quickSortAsc(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
