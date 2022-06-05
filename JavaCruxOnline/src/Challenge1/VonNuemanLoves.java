package Challenge1;

import java.util.*;
public class VonNuemanLoves {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		 int t=sc.nextInt();
		 for(int i=0;i<t;i++)
		 {
			int n=sc.nextInt();
			int temp=n;
				int val=0;	
				int weight=1;
			while(temp!=0)
			{	
				int rem=temp%10;
				temp=temp/10;
				val=val+rem* weight;
				weight=weight*2;
			
			 	  
			}	System.out.println(val);
			
		 }
		}
    }