package Lecture1;
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nst=1;
		int nsp=n/2;
		
		
		//row
		int row=1;
		while(row<=n)
		{
			//work space
			int csp=1;
			while(csp<=nsp)
			{
				
				System.out.print(" ");
				csp++;
			}
			
			//work stars
			int cst=1;
			while(cst<=nst)
			{
				
				System.out.print("*");
				cst++;
			}
			
			//preparation
			System.out.println();
			if(row<=n/2)
			{
				nsp--;
				nst=nst+2;
			}
			else {
				nsp++;
				nst=nst-2;
				
			}
			row++;
			
		}
		
	}

}
