import java.util.Arrays;

public class AscSelectionSortSmallestFirst {
	public static void swap(int[] arr,int i, int j) {
		if(i==j)
			return;
		
		int temp=arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
		
	}
	public static void SelectionSortAsc(int[] arr) {
		for(int lastUnsortedIndex=0; lastUnsortedIndex<arr.length;
				lastUnsortedIndex++) {
			int smallest=arr.length-1;
			
			for(int i=smallest-1; i>=lastUnsortedIndex;i--) {
				
				if(arr[smallest] > arr[i])
					smallest=i;
			}
			swap(arr, smallest, lastUnsortedIndex);
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		SelectionSortAsc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
