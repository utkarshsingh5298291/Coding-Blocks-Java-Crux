package Lecture2;
import java.util.Scanner;
public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int fmin=0;
		int fmax=300;
		int fstep=20;
		int fcurrent=fmin;
		
		while(fcurrent<=fmax)
		{
			double celcius=(5.0/9)*(fcurrent-32);
			
			System.out.println(fcurrent + " \t" +celcius);
			fcurrent=fcurrent+fstep;
		}
	}

}
