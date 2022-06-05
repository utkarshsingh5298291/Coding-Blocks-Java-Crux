package Lecture3;

import java.util.Scanner;

public class LinearSearch {


	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=takeInput();
		display(array);
		System.out.println(linearSearch(array,30));
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

	public static int linearSearch(int arr[],int item)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item)
			{
				return i;
			}
		}
		return -1;
	}

}
