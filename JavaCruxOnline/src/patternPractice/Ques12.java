package patternPractice;
import java.util.Scanner;
public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int nsp=n-1;
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
			int cst=1;
			while(cst<=nst)
			{
				if(cst%2==0)
				{
					System.out.print(" ! ");
				}
				else {
				System.out.print(" * ");
				}
				cst++;
			}
			System.out.println();
			nsp--;
			nst+=2;
			row++;
		}
	}

}