// Java program to find minimum
// swaps required to club all
// elements less than or equals
// to k together

package ques3;

public class MinSwapsReq {
    public static void main(String args[]) {
	int arr[] = {2, 1, 5, 6, 3};
	    int n = arr.length;
	    int k = 3;
	    System.out.print("Min swap's required: "+minSwap(arr, n, k) + "\n");
    }
    
    static int minSwap(int arr[], int n, int k) {
	
	int count = 0;
	for(int i=0; i<n; i++)
	    if(arr[i] <= k)
		++count;  //No of elements which are less than K
	
	
	//Unwanted elments in current arr
	int bad=0;
	for(int i=0; i < count; i++)
	    if (arr[i] > k)
	        ++bad;
	
	int ans = bad;
	for(int i = 0, j = count; j < n; ++i, ++j) {
	    
	    if(arr[i] > k)
		--bad;
	    
	    if(arr[j] > k)
		++bad;
	    
	    ans  = Math.min(ans, bad);
	    }
	return ans;
	    
	}
    
}
