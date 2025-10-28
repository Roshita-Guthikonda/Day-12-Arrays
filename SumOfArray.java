package com.codegnan.arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int cols=sc.nextInt();
		int sum=0;
		int[][] arr=new int[rows][cols];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum of given array elements is :"+sum);
		sc.close();

	}

}
