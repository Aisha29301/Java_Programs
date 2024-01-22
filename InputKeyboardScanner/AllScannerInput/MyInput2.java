//Array reading from keyboard thr Scanner class and Sort it thr built-in method sort() present in built-in class Arrays

import java.util.Scanner;
import java.util.Arrays;
//import java.util.*;

//public static int binarySearch(int[], int);
//public static void sort(int[]);
   
class MyInput2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many no.s: ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays elements BEFORE sorting are as follows: ");
		for(int t : arr)
			System.out.print(t+" ");
		System.out.println();
			
		System.out.println("Arrays elements AFTER sorting are as follows: ");
		//----------------------------------------------------------------
		Arrays.sort(arr);
		//----------------------------------------------------------------
		for(int t : arr)
			System.out.print(t+" ");
		System.out.println();
		
		//System.out.println("Let's Apply Binary Search to it");
		//System.out.println("Enter element to be searched:");
		//int s=sc.nextInt();
		//int found;
		//--------------------------------------------------------------------
		//found=Arrays.binarySearch(arr, s);
		//--------------------------------------------------------------------
		//System.out.println(found);
		sc.close();
	}
}	