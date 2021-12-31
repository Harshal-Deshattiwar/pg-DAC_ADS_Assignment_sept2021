import java.util.Arrays;

public class SortingAlgos {
	public static void BubbleSort(int[] arr) {
		// Set elementPos to N - 1
		int elementPos = arr.length - 1;

		// while (elementPos > 0) do
		while (elementPos > 0) {
			// Set i to 0
			int i = 0;

			// while ( i < elementPos) do
			while (i < elementPos) {
				// if (arr[i] > arr[i + 1]) then
				if (arr[i] > arr[i + 1]) {
					// Swap i and i+1 elements of arr
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

				// Increment i by 1
				++i;
			}

			// Decrement elementPos by 1
			--elementPos;
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 4, 3, 1, 9, 5, 17, 90, 6, 2};

		System.out.println("Unsorted array = " + Arrays.toString((arr)));
		BubbleSort(arr);
		System.out.println("Sorted array   = " + Arrays.toString((arr)));
	}
}
