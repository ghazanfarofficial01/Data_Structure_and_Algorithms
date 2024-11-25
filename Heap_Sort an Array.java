class Solution {
    public int[] sortArray(int[] nums) {
        
       int n = nums.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }
        
        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum value) with the last element
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            // Heapify the reduced heap
            heapify(nums, i, 0); // Pass reduced heap size (i)
        }

        return nums;

    }

    public static void heapify(int[] arr, int n, int i){

		int largest = i;
		int left  = 2*i + 1;
		int right = 2* i +2;
         
		if(left < n && arr[largest] < arr[left]){
			largest = left;
		}

		if(right < n && arr[largest] < arr[right]){
			largest = right;
		}

		if(largest != i){
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
           heapify(arr,n,largest);
		}
	}
}
