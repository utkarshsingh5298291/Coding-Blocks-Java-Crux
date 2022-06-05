package patternPractice;
import java.util.*;
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		int nsp=1;
		
		//row
		int row=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("   ");
				csp++;
			}
			
			//work star
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(" * ");
				cst++;
			}
			
			System.out.println();
			nsp++;
			nst--;
			row++;
		}
	}

}
