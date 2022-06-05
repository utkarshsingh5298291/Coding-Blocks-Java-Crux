package Lecture1;
import java.util.*;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int nst=1;
		int nsp=n-1;
		int val=1;
		
		//row
		int row=1;
		while(row<=n)
		{
			//work space
			
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			//work number pattern
			int cst=1;
			
			while(cst<=nst)
			{
				System.out.print(val+ "\t");
				val++;
				cst++;
				
			}
			//work space
			csp=1; 
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			System.out.println();
			nsp--;
			
			nst=nst+2;
			row++;
		}
	}

}
