class Solution{
	void toBinary(int N) {
		//Write your code here
		int[] arr = new int[32];
		int i = 0;
		
		while(N>0){
		    arr[i] = N%2;
		    N /= 2;
		    i++;
		}
		
		for(int j = i-1; j>=0; j--){
		    System.out.print(arr[j]);
		}
	}
}
