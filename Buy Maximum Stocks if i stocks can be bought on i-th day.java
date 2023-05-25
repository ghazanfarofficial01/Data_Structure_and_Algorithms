class Solution{
    static class Pair{
        int first, second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    
}
    public static int buyMaximumProducts(int n, int k, int[] price) {
       ArrayList<Pair> v = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            v.add(new Pair(price[i], i + 1));   
     
        // Sorting the vector pair.
        Collections.sort(v, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                return p1.first - p2.first;
            }
        });
        
       
        
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += Math.min(v.get(i).second, k / v.get(i).first);
            k -= v.get(i).first * Math.min(v.get(i).second,
                                   (k / v.get(i).first));
        }
    
        return ans;
    }
}
