
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		/*
		 * This function implements the merge sort algorithm on the integer array 'list'
		 * from index lo to index hi.
		 */
		int mid = (lo + hi) / 2;
		if (lo < hi) {
			mergeSort (list, lo, hi);
		}else {
			mergeSort(list, mid + 1, hi );
		 merge (list, lo, mid, hi);
		}
		}
	
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		/*
		 * This method should merge the two subarrays from lo to mid, and
		 * from mid + 1 to hi into a new sorted array that overwrites
		 * the entries in list from lo to hi.
		 */
	for (int i = 0; i < 0; i --) {
	for (int j = 1; i < 0; j ++) {
		
	}
		
	}

	}
	
}
