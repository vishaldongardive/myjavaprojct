package logicalPrograms;

import java.util.Scanner;

public class UserinputStudy{

	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the 1st number number");
	int number1=sc.nextInt();
	System.out.println("please enter the 2nd number number");
	int number2=sc.nextInt();
	int sum=number1+number2;
	System.out.println("addition of two numbers is"+sum);
	System.out.println("please enter your name");
	String name=sc.next();
	System.out.println("You entered name as"+name);
	}

}
