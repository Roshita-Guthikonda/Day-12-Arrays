package com.codegnan.arrays;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=sc.nextInt();
		int[] arr=new int[s];
		int sum=0,avg;
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of array elements is: "+sum);
		avg=sum/s;
		System.out.println("Average of given array elements is: "+avg);
		sc.close();

	}

}
