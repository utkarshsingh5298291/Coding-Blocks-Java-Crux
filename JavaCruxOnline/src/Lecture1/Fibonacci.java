package Lecture1;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int sum=1;
		
		int  counter=1;
		
		while(counter<=n+1)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			counter++;
		}
	}

}
