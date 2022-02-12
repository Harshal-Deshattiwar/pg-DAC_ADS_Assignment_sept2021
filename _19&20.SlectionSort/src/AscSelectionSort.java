import java.util.Arrays;

public class AscSelectionSort {
	public static void swap(int[] arr,int i, int j) {
		if(i==j)
			return;
		
		int temp=arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
		
	}
	public static void SelectionSortAsc(int[] arr) {
		for(int lastUnsortedIndex=arr.length-1; lastUnsortedIndex>0;
				lastUnsortedIndex--) {
			int largest=0;
			
			for(int i=1; i<=lastUnsortedIndex;i++) {
				
				if(arr[largest] < arr[i])
					largest=i;
			}
			swap(arr, largest, lastUnsortedIndex);
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		SelectionSortAsc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
