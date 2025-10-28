package com.codegnan.arrays;

import java.util.Scanner;

public class MaximumProfitRange {

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

            int maxSum = arr[L];
            int currentSum = arr[L];

            for (int i = L + 1; i <= R; i++) {
                if (currentSum + arr[i] > arr[i]) {
                    currentSum = currentSum + arr[i];
                } else {
                    currentSum = arr[i];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            System.out.println(maxSum);
        }

        sc.close();
	}

}
