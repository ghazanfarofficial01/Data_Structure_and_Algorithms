class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        
        long min = a.get(0);
        long max = a.get(m-1);
        
        for(int i = 1; i<n; i++){
            if(m<n){
                if(max-min > a.get(m) - a.get(i) ){
                    min = a.get(i);
                    max = a.get(m);
                }
                m++;
            }
            else break;
        }
        return max-min;
        
    }
}
