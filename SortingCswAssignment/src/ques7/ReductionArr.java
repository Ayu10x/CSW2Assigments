package ques7;

import java.util.Arrays;
import java.util.Scanner;

//Element left after reductions. Given an array of positive elements. You
//need to perform reduction operation. In each reduction operation smallest
//positive element value is picked and all the elements are subtracted by that
//value. You need to print the number of elements left after each reduction
//process

public class ReductionArr {
    
    public static void main(String args[]) {
//	int[] arr = { -1, -2, 4, 3, 5 };
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size of arr: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of arr: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=Integer.MAX_VALUE;
        for(int i:a)
        {
            if(s>i&&i>0)
            {
                s=i;
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]-=s;
            if(a[i]>0)
            {
                c++;
            }
        }
        System.out.println("After reduction the numbers left are "+c);
    }
   
}
