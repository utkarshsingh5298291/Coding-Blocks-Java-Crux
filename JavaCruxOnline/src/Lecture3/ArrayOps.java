package Lecture3;
import java.util.*;
public class ArrayOps {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=takeInput();
		display(array);
		System.out.println(maxInArray(array));
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

	public static int maxInArray(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	
	
} 
