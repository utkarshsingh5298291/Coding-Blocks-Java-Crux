package Lecture2;
import java.util.*;
public class UpperOrLowerCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);//take 0 th vlaue
		System.out.println(ch);
		
		if(ch>=97 && ch<=122)
		{
			System.out.println("Lowercase");

		}
		else if(ch>=65 && ch<=90)
		{
			System.out.println("Uppercase");

		}
		else {
			System.out.println("Invalid character");

		}
	}

}
