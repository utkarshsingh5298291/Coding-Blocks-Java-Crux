package Lecture3;

import java.util.Scanner;

public class DecimalToanbase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int snum=sc.nextInt();
		int desbase=sc.nextInt();
		
		int res=Decimaloanybase(snum,desbase);
		System.out.println(res);
		
	}
	public static int Decimaloanybase(int snum,int desbase)
	{
		int ans=0;
		int multiplier=1;
		while(snum!=0)
		{
			int rem=snum%desbase;
			ans=ans+(rem*multiplier);
			multiplier=multiplier*10;
			snum=snum/desbase;
			
		}
		return ans;
	}


}
