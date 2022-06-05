package patternPractice;
import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		
		//row
		int row=1;
		while(row<=n)
		{
			//work
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(" * ");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
