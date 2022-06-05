package patternPractice;
import java.util.Scanner;
public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=2*n-1;
		int nsp=n-1;
		//row
		int row=1;
		while(row<=n)
		{

			int cst=1;
			while(cst<=nst)
			{
				
				System.out.print("*");
				
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			System.out.println();
			nsp--;
			nst-=2;
			row++;
		}
	}

}
