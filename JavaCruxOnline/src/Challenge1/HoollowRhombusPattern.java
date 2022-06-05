package Challenge1;

import java.util.*;
public class HoollowRhombusPattern {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nsp=n-1;
		int nst=n;
		
		//row
		int row=1;
		while(row<=n)
		{
		    //work
		    int csp=1;
		    while(csp<=nsp)
		    {
		        System.out.print(" ");
		        csp++;
		    }
		    
		    //work
		    int cst=1;
		    while(cst<=nst)
		    {
		        if(row>1 && row<n && cst>1 && cst<n)
		        System.out.print(" ");
		        else
		        System.out.print("*");
		        cst++;
		    }
		    System.out.println();
		    
		    nsp--;
		    row++;
		    
		}
		 

    }
}