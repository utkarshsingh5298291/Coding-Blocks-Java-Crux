package Lecture1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		
		int row=1;
		
		while(row<=n)
		{
			//work
			int cst=1;
			
			while(cst<=nst)
			{
				
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
