package com.question3;

import java.util.Scanner;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		//String str="{ (1+2)+(3+4) {}}  {}";
		int count=0;
		
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			if(arr[i]=='(') {
				count++;
			}
			else if(arr[i]==')') {
				count--;
			}
			
		}
		
		if(count==0) {
			System.out.println("Input has balanced parantheses");
		}
		else {
			System.out.println("Input doesnt have balanced parantheses");
		}
		
		
		
		

	}

}
