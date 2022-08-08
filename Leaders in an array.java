class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                list.add(max);
            }
            else continue;
        }
        Collections.reverse(list);
        return list;
    }
}
