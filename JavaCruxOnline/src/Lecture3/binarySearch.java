package Lecture3;

import java.util.Scanner;

public class binarySearch {
	
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=takeInput();
		display(array);
		System.out.println(BinarySearch(array,30));
	}
	
	public static int[] takeInput() 
{
		
		System.out.println("Size?");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value "+ i +" index?");
			arr[i]=sc.nextInt();
			
		}
		return arr;
		
		
	}
	public static void display(int[] arr)	
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static int BinarySearch(int[] arr,int item)
	{
		 int low=0;
		 int hi=arr.length-1;
		 
		 while(low<=hi)
		 {
			 int mid=(low+hi)/2;
			 
			 if(arr[mid]<item)
			 {
				 low=mid+1;
			 }
			 else if(arr[mid]>item)
			 {
				 hi=mid-1;
			 }
			 else
			 {
				 return mid;
			 }
			 
		 }
		 return -1;
	}

}
