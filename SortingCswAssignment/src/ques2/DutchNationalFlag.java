package ques2;

import java.util.Arrays;

//Dutch National Flag problem : Sort Colors leetCode: 75

public class DutchNationalFlag {
    
    public static void main(String args[]) {
	
	int[] nums= {2,0,2,1,1,0};
	sortDutchStyle(nums, nums.length);
	System.out.println("Sorted Arr: "+Arrays.toString(nums));
	
    }
    
    static void sortDutchStyle(int nums[], int n) {
	int lo=0;
	int mid=0;
	int hi= n-1;
	
	int temp=0; //hehe for swapping
	
	while(mid<=hi) {
	    
	    switch (nums[mid]) {
	    
	    case 0: {
		temp = nums[lo];
		nums[lo] = nums[mid];
		nums[mid] = temp;
		lo++;
		mid++;
		break;
		}
	    case 1 :{
		mid++;
		break;
	    }
	    case 2:{
		temp = nums[mid];
		nums[mid] = nums[hi];
		nums[hi] = temp;
	    hi--;
	    break;
	    }
	    }
	}
    }

}
