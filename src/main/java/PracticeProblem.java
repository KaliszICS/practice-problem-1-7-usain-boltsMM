/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Mansoor Muhammad
	* Date Created: Feb 23, 2026
	* Date Last Modified: Feb 23, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);

	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		char bool = input.next().charAt(0);
		System.out.print("Input another lowercase letter: ");
		char bools = input.next().charAt(0);
		System.out.println(bool < bools);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double boole = input.nextDouble();
		System.out.println(boole >= 0 && boole <= 10);


	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double boolw = input.nextDouble();
		System.out.println((boolw >= 1) && boolw != 5 );

	}	

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String boolb = input.nextLine();
		System.out.println(!boolb.equals("banana"));


	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int booli = input.nextInt();
		boolean loit = (booli % 2 == 0);
		System.out.println("The integer " + (booli) +" is " + (loit));

	}

}
