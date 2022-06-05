package Lecture1;
import java.util.*;
public class Pattern32 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int nst=1;
		int nr=2*n-1;
		int val;
		//row
		int row=1;
		while(row<=nr)
		{
			if(row<=nr/2 +1)
				val=row;
			else
				val=nr-row+1;
			//work
			
			int cst=1;
			while(cst<=nst)
			{
				if(cst%2==0)
				{
					System.out.print(" * ");
					
				}
				else {
					System.out.print(val);	
				}
				
				cst++;
			}
			
			
			//prep
			System.out.println();
			if(row<=nr/2)
			{
				nst=nst+2;
			}
			else {
				nst=nst-2;
			}
			row++;
		}
		
	}
}
