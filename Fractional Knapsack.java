class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        
       
        double ans = 0;
        
       
        Arrays.sort(arr,  new Comparator<Item>(){
            public int compare(Item a, Item b){
                double r1 = (double)a.value / a.weight;
                double r2 = (double)b.value / b.weight;
                if(r1<r2){
                    return 1;
                }
                else return -1;
            }
        });
            
        for(int i = 0; i<n; i++) {
            if(W<=0) break;
            
            if(W>arr[i].weight){
                ans += arr[i].value;
                W-= arr[i].weight;
            }
            else{
                ans += (arr[i].value/(double)arr[i].weight)*W;
                break;
            }
            
        }
        
        return ans;

    }
}
