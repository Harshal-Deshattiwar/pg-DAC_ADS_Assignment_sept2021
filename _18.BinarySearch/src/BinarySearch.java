import java.util.Arrays;

public class BinarySearch {
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
	public static boolean binarySearch(int[] arr, int elementToFind) {
		int position=(arr.length-1)/2;
		int mid=(arr.length-1)/2;
		int first=0;
		int last=arr.length-1;
		while(position >0) {
			if(arr[mid]==elementToFind)
				return true;
			else if(arr[mid]>elementToFind) {
				System.out.println("in small");
				System.out.println(arr[mid]);
				mid=(mid+first)/2;
			}
			else if(arr[mid] < elementToFind) {
				System.out.println("in big");
				System.out.println(arr[mid]);
				mid=(last+mid)/2;
			}
			
			position--;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		System.out.println(Arrays.toString(arr));
		BubbleSortAsc(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 3));
	}

}
