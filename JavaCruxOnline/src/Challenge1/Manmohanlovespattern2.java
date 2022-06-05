package Challenge1;

import java.util.*;
public class Manmohanlovespattern2 {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
 
		int n=sc.nextInt();
		int nst=1;
 
		//row
		int val;
		int row=1;
		while(row<=n)
		{
			//work
			//val=nst-1;
			int cst=1;
			while(cst<=nst)
			{
				if(nst-1==0)
				{
					System.out.print(nst);
				}
				else if(row>1)
				{
					
					
					if(cst>1 && cst<row)
					{
						val=0;
						
					}
					else{
						val=nst-1;
					}
					System.out.print(val);
				}
				cst++;
 
			}
			System.out.println();
 
			row++;
			nst++;
 
		}
    }
}