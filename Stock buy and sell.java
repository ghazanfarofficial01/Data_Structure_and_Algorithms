class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
         ArrayList<ArrayList<Integer>>ls=new ArrayList<>();
       for(int i=0;i<n-1;i++){
           if(arr[i]<arr[i+1]){
               ArrayList<Integer>t=new ArrayList<>();
               t.add(i);
               t.add(i+1);
               ls.add(t);
           }
       }
       return ls;
    }
}
