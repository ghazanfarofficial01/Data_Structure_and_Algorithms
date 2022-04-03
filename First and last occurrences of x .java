class Solution
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        
        long firstOccur = -1;
        long lastOccur = -1;
        
        for(int i = 0; i<n;i++){
            if(firstOccur == -1 && arr[i] == x){
                firstOccur = i;
                lastOccur = i;
            }
            
            if(firstOccur != -1 && arr[i] == x){
                lastOccur = i;
            }
        }
        list.add(firstOccur);
        list.add(lastOccur);
        return list;
    }
}
