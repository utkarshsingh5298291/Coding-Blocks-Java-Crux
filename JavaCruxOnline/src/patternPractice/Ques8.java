package patternPractice;
import java.util.*;
public class Ques8 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row==col)
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}
