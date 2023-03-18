class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int[][] arr = new int[n][2];
        for(int i = 0; i<n; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(final int[] entry1, final int[] entry2){
                if(entry1[1] > entry2[1]){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        int count = 1;
        int last = arr[0][1];
        for(int i = 1; i<n; i++){
            if(arr[i][0]>last){
                count++;
                last = arr[i][1];
            }
        }
        return count;
    }
}
