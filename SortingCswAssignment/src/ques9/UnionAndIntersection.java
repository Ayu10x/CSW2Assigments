package ques9;

import java.util.*;

//Given two unsorted arrays, find union and intersection of these two
public class UnionAndIntersection {
    public static void main(String args[]) {
	    int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
	    int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
	 
	    getUnion(a, 9, b, 10);
	    System.out.print("The Intersection set of both arrays is :" +"\n");
	    intersection(a,b,9,10);
    }
    
    static void getUnion(int a[],int n, int b[], int m) {
	HashSet<Integer> set = new HashSet<>();
	
	for(int i = 0; i < n; i++)
	    set.add(a[i]);
	
	for(int i = 0; i < m; i++)
	    set.add(b[i]);
	System.out.print("The union set of both arrays is :" +"\n");
	System.out.println(set.toString()+" ");
    }
    
    static void intersection(int a[], int b[], int n, int m)
    {
        int i = 0, j = 0;
 
        while (i < n && j < m) {
 
            if (a[i] > b[j]) {
                j++;
            }
 
            else if (b[j] > a[i]) {
                i++;
            }
            else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
