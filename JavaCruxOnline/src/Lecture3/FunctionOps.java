package Lecture3;

import java.util.*;

public class FunctionOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int snum=sc.nextInt();
		int sbase=sc.nextInt();
		
		int res=anybaseToDecimal(snum,sbase);
		System.out.println(res);
		
	}
	public static int anybaseToDecimal(int snum,int sbase)
	{
		int ans=0;
		int multiplier=1;
		while(snum!=0)
		{
			int rem=snum%10;
			ans=ans+(rem*multiplier);
			multiplier=multiplier*sbase;
			snum=snum/10;
			
		}
		return ans;
	}

}
