package com.kodnest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("user please enter size of an array");
		int size= scan.nextInt();
		int a[] = new int[size];		
		System.out.println("user enter the elements of an array");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
	    System.out.println("User enter the index element");
		int x = scan.nextInt();
		System.out.println("Element = "+ a[x]);
		scan.close();
	}
		catch(NegativeArraySizeException e1) {
			System.out.println("Enter a positive number for array size");
		}
		catch(InputMismatchException e2) {
			System.out.println("Enter only the digits");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter the index value in the range of 0 to size-1");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}

//possible exceptions are 1.InputMismatchException 
//2.NegativeArraySizeException 3.ArrayIndexOutOfBoundsException