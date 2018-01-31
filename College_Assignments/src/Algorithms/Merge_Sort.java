package Algorithms;

public class Merge_Sort {
	void merge(int arr[], int l, int m, int r) {
		//find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//create temp arrays (left array and right array
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//copy data to to two temp arrays
		for (int  i = 0; i < n1; i ++) 
			L[i] = arr[l + i];
		
		for (int j = 0; j < n2; j++) 
			R[j] = arr[m + 1 + j];
		
		//merge the two temp arrays
		
		//intital indexes of first and second subarrays
		int i = 0, j = 0;
		
		//intital index of merged subarray array
		int k = l;
		while (i < n1 && j <n2) {
			if (L[i] <= R[j]) {				//if Left array element is smallest, store it in the subarray
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];				//otherwise store the right element in the subarray
				j++;
			} 
			k++;							//in either case index needs to increase by one
		}//end while
		
		//copy remaining elements of L[] if any
		while (i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}//end while
		
		//copy remaining elements of R[] if any
		while (j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}//end while
	}//end merge method
	
	//Main function that sorts  arr[l..r] using merge()
		void sort (int arr[], int l, int r) {
			if (l < r) {
				//find the middle point
				int m = (l+r)/2;
				
				//sort first and second halves
				sort(arr, l, m);
				sort(arr, m+1, r);
				
				//merge the sorted halves
				merge(arr, l, m, r);
			}//end if
		}//end sort
		

	static void printArray(int arr[]) {
		for(int i = 0; i <arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		}//end printarray
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		
		System.out.println("Given array");
		printArray(arr);
		
		Merge_Sort obj = new Merge_Sort();
		obj.sort(arr, 0, arr.length-1);
		
		System.out.println("\nSorted Array");
		printArray(arr);

	}//end main
	
	
}//end class
