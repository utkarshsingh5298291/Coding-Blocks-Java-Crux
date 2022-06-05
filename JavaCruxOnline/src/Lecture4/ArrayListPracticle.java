package Lecture4;
import java.util.ArrayList;
public class ArrayListPracticle {
	
	public static void main(String args[])
	{
		
	 ArrayList<Integer> list=new ArrayList<>();

		list.add(10);
		System.out.println(list);
	    System.out.println(list.size());

		list.add(20);
		System.out.println(list);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

	System.out.println(list.get(2));
	System.out.println(list.remove(1));
	}
}
