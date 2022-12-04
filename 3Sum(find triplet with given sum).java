import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k)  {

	   ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
        // Sorting the arraylist.
        Arrays.sort(arr);

        for (int i = 0; i < n-2; i++) {
            int target = k-arr[i];
            int front = i + 1;
            int back = n - 1;

            while (front < back) {
                int sum = arr[front] + arr[back];

                // Finding answer which starts from arr[i].
                if (sum < target) {
                    front++;
                }
                else if (sum > target) {
                    back--;
                }
                else {
                    int x = arr[front];
                    int y = arr[back];

                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[front]);
                    list.add(arr[back]);
                    ans.add(list);

                    // Incrementing front pointer until we reach a different number.
                    while (front < back && arr[front] == x) {
                        front++;
                    }

                    // Decrementing last pointer until we reach a different number.
                    while (front < back && arr[back] == y) {
                        back--;
                    }
                }
            }
            // Ensuring that we don't encounter duplicate values for arr[i].
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return ans;

	}
}
