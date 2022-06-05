package Lecture1;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 
	        System.out.println("Please enter a number in decimal to make it binary");
	        int n=sc.nextInt();
	        int new_num=0;long rem;int i=0;
	        
	        while(n!=0)
	        {
	            
	            rem=n%2;
	            n=n/2;
	            new_num+= rem*(Math.pow(10,i));
	            i++;
	       


	        }
	   System.out.println(new_num);

	}

}
