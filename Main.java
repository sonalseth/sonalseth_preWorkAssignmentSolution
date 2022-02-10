package glassignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1: {
				obj.checkPalindrome();
			}
				break;
			case 2: {
				obj.printPattern();
			}
				break;
			case 3: {
				obj.checkPrimeNumber();
			}
				break;
			case 4: {
				obj.printFibonacciSeries();
			}
				break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

	public void checkPalindrome() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value to check Palindrome");
		// Number variable to be checked for palindrome
		int r, sum = 0, Val;
		// Read Value from Scanner
		int pl = scanner.nextInt();
		Val = pl;
		while (pl > 0) {

			r = pl % 10;
			sum = (sum * 10) + r;
			pl = pl / 10;
		}
		if (Val == sum)
			System.out.println("Entered Number is Palindrome");
		else
			System.out.println("Entered Number is Not Palindrome");

		System.out.println();

	}

	public void checkPrimeNumber() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Value to check Prime Number");
		// Read Value from Scanner
		int primeNo = scanner.nextInt();

		int i, Num = 0, flag = 0;
		// divide prime number by 2
		Num = primeNo / 2;
		// if entered value is 1 or 0 then it is not prime number
		if (primeNo == 0 || primeNo == 1) {
			System.out.println(primeNo + " is not prime number");
		} else {

			for (i = 2; i <= Num; i++) {
				if (primeNo % i == 0) {
					System.out.println(primeNo + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(primeNo + " is prime number");
			}
		} // end of else
		System.out.println();

	}

	public void printFibonacciSeries() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value for Fibonacci Series");
		// Read Value from Scanner
		int count = scanner.nextInt();
		int i;
		int first = 0, second = 1, num3;

		// by default first two numbers are 0,1 (hardcoded),
		System.out.print(first + " " + second);

		i = 2;
		// starting loop from 2 because 0 and 1 are already printed
		do {
			// Add first + n2
			num3 = first + second;
			// display series value
			System.out.print(" " + num3);
			// set n2 value to first and n3 value to n2
			first = second;
			second = num3;
			++i;
		} while (i < count);
		System.out.println();

	}

	public void printPattern() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Value to draw Star Pattern");
		// Read Value from Scanner
		int pattern = scanner.nextInt();
		int star = pattern;

		while (pattern > 0) {
			while (star > 0) {
				System.out.print("*");
				// decrease star by 1
				star--;
			}
			// decrease input value by one
			pattern--;

			star = pattern;

			System.out.println();
		}

		System.out.println();

	}
}
