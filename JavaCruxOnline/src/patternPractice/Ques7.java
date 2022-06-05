package patternPractice;
import java.util.*;
public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int nst=n;
		int nsp=n-4;
		
		//row
		int row=1;
		while(row<=n)
		{
			//work
			int cst =1;
			while(cst<=nst)
			{
				if(row==1||row==n||cst==1||cst==n)
				{
				System.out.print(" * ");
				cst++;
				}
				else {
					System.out.print("   ");
					cst++;
				}
			}
			
			System.out.println();
			row++;
		}
		
	}

}
