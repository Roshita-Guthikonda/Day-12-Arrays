package com.codegnan.arrays;

public class Main_01 {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=500;
		a[1][1]=1000;
		System.out.println(a);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][1]);
		
		int [][][] arr={{ {10,20,30} , {40,50}, {60} } , { {70,80} , {90,100,110} }};
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
				
			}
			System.out.println("------------------------");
		}
		//enhanced for loop
		for(int[][] x:arr) {
			for(int[] y:x) {
				for(int z:y) {
					System.out.print(z+" ");
				}
			}
		}
	}

}

