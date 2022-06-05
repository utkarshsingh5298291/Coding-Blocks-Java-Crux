package Challenge1;

import java.util.*;
public class RevisingQuadratic {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int dis = (int) Math.pow(b, 2) - (4 * a * c);
		int r1 = (int) (-1 * b + Math.sqrt(dis)) / (2 * a);
		int r2 = (int) (-1 * b - Math.sqrt(dis)) / (2 * a);

		if (dis > 0) 
		{
			System.out.println("Real and Distinct");
			
			if (r1 > r2)
				System.out.println(r2 + " " + r1);
			else
				System.out.println(r1 + " " + r2);

		} 
		else if (dis < 0) {

			System.out.println("Imaginary");
			

		} 
		else if (dis == 0) 
		{
			System.out.println("Real and Equal");
			System.out.println(r2 + " " + r1);
		}


    }
}