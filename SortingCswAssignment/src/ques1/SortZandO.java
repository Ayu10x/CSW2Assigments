package ques1;

import java.util.Arrays;

public class SortZandO {
    public static void main(String args[]) {
	int nums[]= {1, 0, 1, 1, 0, 1, 0, 0};
	sortbyBinary(nums);
    }
    
    public static void sortbyBinary(int nums[]) { // Two pointer method
	int l = 0;
	int r = nums.length-1;
	
	System.out.println("Array before sorting: "+Arrays.toString(nums));
	
	while(l<r) {
	    if(nums[l] == 1) {
		nums[r] = nums[r] + nums[l];
		nums[l] = nums[r] - nums[l];
		nums[r] = nums[r] - nums[l];
	    r--;
	    }
	    else {
		l++;
	    }
	}
	System.out.println("Array after sorting: "+Arrays.toString(nums));
    }
    
    
    
}
