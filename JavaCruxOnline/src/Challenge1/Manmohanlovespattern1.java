package Challenge1;
import java.util.*;
public class Manmohanlovespattern1 {
    public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int nst=1;
	int val=1;

	//row
	int row=1;
	while(row<=n)
	{
		//work
		int cst=1;
		while(cst<=nst)
		{
			if(row<=2)
			{
				System.out.print("1");

			}
			else if(row>2 && row%2!=0)
			{
				System.out.print("1");
			}
			else if(row>2 && row%2==0){
				if(cst>1 && cst< row)
				{
				System.out.print("0");

				}
				else{
					System.out.print("1");
				
				}
			}
			cst++;
		}
		//prep
		System.out.println();
		row++;
		nst++;
	}
    }
}