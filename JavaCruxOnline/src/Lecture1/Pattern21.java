package Lecture1;
import java.util.*;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int nst=1;
		int nsp=2*n-3;
		
		
		//row
		int row=1;
		while(row<=n)
		{
			//work star
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			 cst=1;
			 if(row==n)
			 {
				 cst=2;
			 
			 }
				while(cst<=nst)
				{
					System.out.print("*");
					cst++;
				}
				System.out.println();
				nsp=nsp-2;
				nst++;
				row++;
				
		}
	}

}
