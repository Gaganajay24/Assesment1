package com.question2;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("The injected array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter the target number : ");
		int target = sc.nextInt();
		
		sumArray(a,target,n);

	}
	
	public static void sumArray(int[] a,int target,int n) {
		
		System.out.println("The combinations of array index are : ");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(a[i]+a[j]==target) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
	}

}
