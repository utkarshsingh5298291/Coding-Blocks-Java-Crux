package Lecture1;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		//boolean flag;
		int div=2;
		boolean flag=true;
		
		
//start loop		
			while(div<=n/2)
			{
				if(n%div == 0)
				{
					flag=false;
				}
				
			div=div+1;
			}
//end loop
		
			
		if(flag==true)
		{
			System.out.print("Prime");
		}
		else {
			System.out.print("Not Prime");
		}
		
		
	}

}
