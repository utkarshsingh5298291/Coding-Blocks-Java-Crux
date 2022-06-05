package Lecture2;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//--------------------------------------part-1-----------------------------------------------
		byte b=10;
		short sh=20;
		int in=30;
		long dl=40;
		
		//b=sh;
		//b=in;
		//b=ln;
		
		sh=b;
		System.out.println(sh);
	float f=5.5f;
	
	
//--------------------------------part-6----------------------------------------------

		
		 in=(int) f;
		 System.out.println(in);
		 
		 f=in;

		 System.out.println(f);
		 
//--------------------------------part-7----------------------------------------------
	
	boolean bit=true ;
			
	//bit=0;
	//bit=1;
	
	if(bit)
	{
		System.out.println("Hello");
	}
	else {
		System.out.print("Bye");
	}
	
bit=false;


if(in>0)
{
	System.out.println("greater");
}
else {
	System.out.print("lesser or equal");
}

//part -8

char ch='a';
ch=99;
System.out.println(ch);

//ch=64000;
//System.out.println(ch);
ch=(char)(ch+2);
System.out.println(ch);

in =ch;
System.out.println(in);

//part9

System.out.println(10+20+"hello"+10+20);
System.out.println(2 + ' ' + 5);
System.out.println(2 + " " + 5);
System.out.println("hello" + '\t' + "world");
System.out.println("hello" + "\t" + "world");

}
}
