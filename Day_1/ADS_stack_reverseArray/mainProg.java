package ADS_stack_reverseArray;
import java.util.Arrays;
public class mainProg {
	
	public static void Reverse(int elements [], stackUsingArray stack ) {
		
		for (int i = 0; i < elements.length; ++i) {
			stack.Push(elements[i]);
		}
		
		for (int i = 0; !stack.IsEmpty(); ++i) {
			
			elements[i] = stack.Pop();
//			System.out.println(elements[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		
		System.out.println("Original array : " + Arrays.toString(arr));
		stackUsingArray stackObj = new stackUsingArray(10);
		Reverse(arr, stackObj);
		System.out.println("Reverse array: " + Arrays.toString(arr));
	}

}
