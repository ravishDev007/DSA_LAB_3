package com.Balance.One;

import java.util.Scanner;

public class Driver {
	
	public static void main(String args[])
	{
		BalanceOne balanceOne=new BalanceOne();
		String input;
		
		System.out.println("Enter a String of brackets:");
		Scanner scan=new Scanner(System.in);
		input=scan.next();
		
		boolean returned=balanceOne.validate(input);
		scan.close();	
		
		if(returned)
			System.out.println("String has Balanced Brackets");
		else
			System.out.println("String does not has Balanced Brackets");
	}

}
