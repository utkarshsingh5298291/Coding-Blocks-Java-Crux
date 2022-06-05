package Lecture1;
import java.util.*;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		if(age<=11)
		{
			System.out.println("Child");
		}
		else if(age>=12 && age<=17)
		{
			System.out.println("Teenager");

		}
		else if(age>=18 && age<=60)
		{
			System.out.println("Adult");

		}
		else
		{
			System.out.print("Old");
		}
		
	}

}
