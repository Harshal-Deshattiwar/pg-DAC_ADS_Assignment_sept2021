package _21_DescendindInsertionSort;

import java.util.Arrays;

public class DescInsertionSort {
	public static void InsertionSortDesc(int[] arr) {
		/*firstUnsortedIndex points to the index=1 at the beginning considering-
		first two index are in sorted order and firstUnsortedIndex can't be 
		greater than length of arr*/
		for(int firstunsortedIndex=1; 
				firstunsortedIndex < arr.length;firstunsortedIndex++) {
			/*unsortedElement is initialized with firstunsortedIndex,
			 * for later if the unsorted element is found  unsortedElement
			 * will be initialized with that element*/
			int unsortedElement=arr[firstunsortedIndex];
			
			int i;//Declare outside second for loop to access i at loop end
			
			//loop to shift the element after unsorted element
			for(i=firstunsortedIndex; i>0 ;i--) {
				//break loop if unsortedElement is less than previous element
				if(unsortedElement < arr[i-1])
					break;
				arr[i]=arr[i-1];
			}
			arr[i]=unsortedElement;
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		InsertionSortDesc(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
