package Challenge1;

import java.util.*;
public class SimpleInput {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		 int sum=0;
	while(sum>=0)
	{
		
		int n=sc.nextInt();
		
		//if(-1000<n && n<1000)
		//{
		sum=sum+n;
		if(sum>=0)
		{
			System.out.println(n);
		}
		else if(sum<0)
		{
			break;
		}
		//}
	}
    }
}