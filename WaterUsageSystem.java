package com.codegnan.arrays;

import java.util.Scanner;

public class WaterUsageSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();  // number of days
        int q = sc.nextInt();  // number of queries

        int[] arr = new int[n + 1]; // make array of size n+1 to use 1-based indexing
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int k = 0; k < q; k++) {
            int L = sc.nextInt(); 
            int R = sc.nextInt();
            int X=sc.nextInt();
            
            for(int i=L;i<=R;i++) {
            	arr[i]=arr[i]+X;
            	
            	if(arr[i]<0) {
                	arr[i]=0;
                }
            }   
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
	}

}
