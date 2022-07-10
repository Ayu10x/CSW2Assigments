package ques10;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinMaxMedian {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The minimum element in the array is "+findMin(a,n));
        System.out.println("The maximum element in the array is "+findMax(a,n));
        System.out.println("The median of the array is "+median(a,n));
    }
    static int findMin(int a[], int n)
    {
        int s=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<s)
            {
                s=a[i];
            }
        }
        return s;
    }
    static int findMax(int a[], int n)
    {
        int s=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>s)
            {
                s=a[i];
            }
        }
        return s;
    }
    static int median(int a[], int n)
    {
        Arrays.sort(a);
        if(n%2==0)
        {
            return (a[n/2]+a[n/2+1])/2;
        }
        else
        {
            return a[n/2];
        }
    }
}

