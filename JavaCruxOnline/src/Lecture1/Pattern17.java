package Lecture1;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int nst=n/2;
		int nsp=1;
		
		//row
		int row=1;
		while(row<=n)
		{
			//work star
			int cst=1;
			while(cst<=nst)
			{
				cst++;
				System.out.print("*");
			}
			//work spaces
			int csp=1; 
			while(csp<=nsp)
			{
				csp++;
				System.out.print(" ");
			}
			
			//work star
			 cst=1;
			while(cst<=nst)
			{
				cst++;
				System.out.print("*");
			}
			
			//prepration step
			System.out.println();
			
			if(row<=n/2)
			{
				nsp=nsp+2;
				nst--;
			}
			else {
				nsp=nsp-2;
				nst++;
				
			}
			row=row+1;
			
		}
	}

}
