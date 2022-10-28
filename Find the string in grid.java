class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {     
           ArrayList<ArrayList<Integer> > list  = new ArrayList<ArrayList<Integer> >();
         // Consider every point as starting
        // point and search given word
        
        int R = grid.length;
        int C = grid[0].length;
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (grid[row][col]==word.charAt(0)  &&
                    search2D(grid, row, col,R,C, word)) { 
                        list.add(new ArrayList<Integer>(Arrays.asList(row,col)));
                        
                        }
                       
                      }
                   }
    
         int[][] ans = new int[list.size()][2];

          for(int i = 0; i<list.size(); i++){
              ans[i][0] = list.get(i).get(0);
              ans[i][1] = list.get(i).get(1);
              
               }
        
                return ans;

             }

 
                // For searching in all 8 direction
                static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
                static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
             
              
         static boolean search2D(char[][] grid, int row,
                                        int col,int R, int C, String word)
                {
                   
             
                         int len = word.length();
             
                          // Search word in all 8 directions
                         // starting from (row, col)
                    for (int dir = 0; dir < 8; dir++) {
                        // Initialize starting point
                        // for current direction
                        int k, rd = row + x[dir], cd = col + y[dir];
             
                        // First character is already checked,
                        // match remaining characters
                        for (k = 1; k < len; k++) {
                            // If out of bound break
                            if (rd >= R || rd < 0 || cd >= C || cd < 0)
                                   break;
             
                            // If not matched, break
                            if (grid[rd][cd] != word.charAt(k))
                                   break;
             
                            // Moving in particular direction
                            rd += x[dir];
                            cd += y[dir];
                        }
             
                        // If all character matched,
                        // then value of must
                        // be equal to length of word
                        if (k == len)
                            return true;
                    }
                    return false;
                }
             
            }
