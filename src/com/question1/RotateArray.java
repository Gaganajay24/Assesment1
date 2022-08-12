package com.question1;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("The injected array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter number of round of rotations : ");
		int rot=sc.nextInt();
		
		Rotate(a,rot,n);
			
		}
	public static void Rotate(int a[],int rot,int n) {
		
		int s=0;
		int[] tempArray=new int[n];
		for(int i=rot;i<n;i++) {
			tempArray[s++]=a[i];
		}
		
		for(int i=0;i<rot;i++) {
			tempArray[s++]=a[i];
		}
		
		System.out.println("The rotated array is  : ");
		for(int i=0;i<s;i++) {
			System.out.print(tempArray[i]+" ");
		}
		System.out.println();
	}
	}



