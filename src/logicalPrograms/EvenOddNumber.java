package logicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd number");
		}

	}

}
