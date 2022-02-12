package _24DescendingHeapSort;

import java.util.Arrays;

public class DescHeapSort {
	public static void swap(int[] arr,int i, int j) {
		if(i==j)
			return;
		//System.out.println(1);
		int temp=arr[i];
		//System.out.println(2);
		//System.out.println("values:"+j);
		arr[i]= arr[j];
		//System.out.println(3);
		arr[j]=temp;
		//System.out.println(4);
		
	}
	public static void heapSortDesc(int[] arr) {
		int n = arr.length;
		convertToHeap(arr,n);
		for (int lastChildPos=n-1; lastChildPos>0;--lastChildPos) {
			// Move current root to end
            swap(arr,lastChildPos,0);
//----------------------------------------------------------------------
            convertToHeap(arr, lastChildPos);
//---------------------------------------------------------------------
//            MakeMaxHeap(arr, lastChildPos,0);
		}
	}
	
	public static void convertToHeap(int[] arr,int size ) {
		int lastParent=(size/2)-1;
		//System.out.println("lastparent:" + lastParent);
		for(int current=lastParent;current>=0;--current)
			MakeMaxHeap(arr,size,current);
	}
	
	public static void MakeMaxHeap(int[] arr, int size, int current ) {
		// Assume left child has max amongst child of current
//-------------------------------------------------------------------------
		//changed in class
//		int maxChildPod=2*(current+1);
//		int rightChildPos=(2*(current+1))+1;
//----------------------------------------------------------------------------	
		//original
		int maxChildPod=2*current+1;
		int rightChildPos=2*current+1+1;
		
		if(rightChildPos> size)
			return;
		// Does right child exists?
		if(rightChildPos<size) {
			//System.out.println("-Does right child exists?");
			if(arr[rightChildPos] <arr[maxChildPod]) {
				maxChildPod=rightChildPos;
			}
		}
		// Does parent has value bigger than max of its child?
		if(arr[current]<arr[maxChildPod]) {
			// Current is max heap
			//System.out.println("// Current is max heap");
			return;
		}
		//System.out.println(arr[maxChildPod]);
		
		swap(arr,current,maxChildPod);
//		swap(arr,current,maxChildPod);
		// A node is a parent if its leftChildPos is less then size of array
//		if(maxChildPod==current)
//			MakeMaxHeap(arr, size, current);
		if((2*maxChildPod+1)<size)
			MakeMaxHeap(arr, size, current);
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,9,1,7,3,6,8,10};
		System.err.println(Arrays.toString(arr));
		heapSortDesc(arr);
		System.out.println(Arrays.toString(arr));

	}

}
