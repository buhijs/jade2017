package m00;

public class Search {
	
	/**
	 * Find the first occurrences of x in sorted array a.
	 * @param x value to find
	 * @param a array sorted in increasing order (a[0] <= a[1] <= ... <= a[n-1])
	 * @return lowest i such that a[i]==x, or -1 if x not found in a.
	 */
	public static int find(int x, int[] a) {
		return binarySearch(x,a,0,a.length);
	} 
	

	public static int binarySearch(int x, int[] a, int first, int last) {
		// TODO finish implementation of binary search method
		
		if(first==last){
			return -1;
		}
		
		int mid = (first+last) / 2;
		if (x < a[mid]) {
			return binarySearch(x, a,first,mid);
		} else if (x > a[mid]) {
			return binarySearch(x, a,mid+1,last);
		} else {
			return mid; // because x == a[mid], i.e. we found it!
		}

	}
}
