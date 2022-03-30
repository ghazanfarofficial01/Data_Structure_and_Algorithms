class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        
        
        ArrayList<Integer> list = new ArrayList<>();
        int i, k = 0, l = 0;
 
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
 
        while (k < r && l < c) {
            // Print the first row from the remaining rows
            for (i = l; i < c; ++i) {
                list.add(matrix[k][i]);
            }
            k++;
 
            // Print the last column from the remaining
            // columns
            for (i = k; i < r; ++i) {
                list.add(matrix[i][c - 1]);
            }
            c--;
 
            // Print the last row from the remaining rows */
            if (k < r) {
                for (i = c - 1; i >= l; --i) {
                    list.add(matrix[r - 1][i]);
                }
                r--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (l < c) {
                for (i = r - 1; i >= k; --i) {
                    list.add(matrix[i][l]);
                }
                l++;
    }
}
        return list;
    }
}
