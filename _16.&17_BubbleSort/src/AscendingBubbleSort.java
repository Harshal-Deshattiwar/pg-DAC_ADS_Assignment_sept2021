import java.util.Arrays;

public class AscendingBubbleSort {
	public static void BubbleSortAsc(int[] arr) {
		
		int elementNo=arr.length-1;//to keep the count of iteration
		while(elementNo >0) {
			//start iterating form last to get the smallest element at the front
			for(int i= (arr.length-1); i>=1;--i) {
				if(arr[i] < arr[i-1]) {
					int temp = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
			}
			--elementNo;
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,12,6,17};
		System.out.println(Arrays.toString(arr));
		BubbleSortAsc(arr);
		System.out.println(Arrays.toString(arr));
	}

}
