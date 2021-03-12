// exersize on page 291

import java.util.Scanner;

public class BankBalance
{
	public static void main(String[] args) 
	{
		// variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// input phase
		System.out.print("enter initial bank balance >> ");
		balance = keyboard.nextDouble();
		System.out.println("do you want next years balance? ");
		System.out.print("enter 1 for yes and anything else for no ");
		response = keyboard.nextInt();

		// calculation and outputphase
		while(response == 1)
		{
			balance = balance + balance * INT_RATE;
			System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $ " + balance);
			year = year + 1;
			System.out.println("do you want to see next years balance");
			System.out.println("enter 1 for yes or any other number for no ");
			response = keyboard.nextInt();
		}
	}
}