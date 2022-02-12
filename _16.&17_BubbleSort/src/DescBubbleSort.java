import java.util.Arrays;

public class DescBubbleSort {
	public static void BubbleSortDesc(int[] arr) {
		
		for(int i =0;i<arr.length-1;++i) {
		//to perform the iteration equals to elements in array
		//(arr.length-1) as [j+1] should not lead to outOfBound error
			for(int j=0;j<arr.length-i-1;++j) {
				//(arr.length-i-1) as [j+1] should not lead to outOfBound error
				if(arr[j] < arr[j+1]) {
					//swap data
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,12,6,17};
		System.out.println(Arrays.toString(arr));
		BubbleSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	
	}

}
