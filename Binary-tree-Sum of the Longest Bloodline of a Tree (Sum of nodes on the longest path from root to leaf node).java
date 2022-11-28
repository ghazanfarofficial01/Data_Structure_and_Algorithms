class Solution{
    
     int maxSum = 0;
     int maxLen = 0;
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        int len = 0;
       // int maxLen = 0;
        int sum =0;
        
        
        findSum(root,sum,len);
        int ans = maxSum;
        return ans;
    }
    
    void findSum(Node root,int sum,int len ){
        if(root == null){
            if(len > maxLen){

                maxLen = len;
                maxSum = sum;
               
            }
            else if(len==maxLen){
                //path having maxSum
                if(sum>maxSum)maxSum=sum;
            }
            
            return;
        }
        
        sum += root.data;
        findSum(root.left,sum,len+1);
        findSum(root.right,sum,len+1);
    }
}
