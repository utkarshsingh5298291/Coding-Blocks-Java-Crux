package Lecture3;

import java.util.Scanner;

public class SelectionSort {

static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=takeInput();
		selectionSort(array);
		display(array);
		
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
			System.out.print(arr[i]+" ");
		}
	}

	 
	public static void selectionSort(int arr[])
	{
		for(int counter=0;counter<arr.length-1;counter++)
		{
			int min=counter;

				for(int j=counter+1;j<=arr.length-1;j++)
				{
					if(arr[j]<arr[min])
					{
						min=j;
					}
				}
				int temp=arr[min];
				arr[min]=arr[counter];
				arr[counter]=temp;
			
		}
		
	}

}
