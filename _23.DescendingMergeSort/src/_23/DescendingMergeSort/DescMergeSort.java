package _23.DescendingMergeSort;

import java.util.Arrays;

public class DescMergeSort {
	static int[] mergedArray;

	private static void Merge(int[] arr, int startPos1, int endPos1, int startPos2, int endPos2) {
		// Set i to startPos1
		int i = startPos1;
		// Set j to startPos2
		int j = startPos2;
		// Set k to 0
		int k = 0;

		// while (i <= endPos1) && (j <= endPos2)
		while ((i <= endPos1) && (j <= endPos2)) {
			if (arr[i] > arr[j]) {
				// Set mergedArray[k] to arr[i]
				mergedArray[k] = arr[i];
				// Increment i by 1
				++i;
			} else {
				// Set mergedArray[k] to arr[j]
				mergedArray[k] = arr[j];
				// Increment j by 1
				++j;
			}
			// Increment k by 1
			++k;
		}

		// Copy remaining elements of other sorted array to mergedArray.
		while (i <= endPos1) {
			// Set mergedArray[k] to arr[i]
			mergedArray[k] = arr[i];
			// Increment i & k by 1
			++i;
			++k;
		}
		while (j <= endPos2) {
			// Set mergedArray[k] to arr[j]
			mergedArray[k] = arr[j];
			// Increment j & k by 1
			++j;
			++k;
		}

		// Elements are merged into mergedArray.
		// Set i to startPos1
		i = startPos1;
		// set j to 0
		j = 0;
		while (j < k) {
			// Set arr[i] to mergedArray[j]
			arr[i] = mergedArray[j];
			// Increment i and j by 1;
			++i;
			++j;
		}
	}

	private static void MergeSort(int[] arr, int startPos, int endPos) {
		// if (elementCount <= 1) then
		int elementCount = (endPos - startPos + 1);
		if (elementCount <= 1) {
			// Stop.
			return;
		}

		// MiddlePos = (startPos + endPos) / 2
		int middlePos = (startPos + endPos) / 2;

		MergeSort(arr, startPos, middlePos);
		MergeSort(arr, middlePos + 1, endPos);

		Merge(arr, startPos, middlePos, middlePos + 1, endPos);
	}

	public static void MergeSort(int[] arr) {
		mergedArray = new int[arr.length];

		MergeSort(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		MergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
