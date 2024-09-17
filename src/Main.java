import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program Author: Imafidon Prince Perazim Class: ICS3U Date: Sept. 16,
		 * 2024 Make a program that asks for 10 inputs reads them into variables, and
		 * then prints out a story Make sure to include Strings, ints, and doubles!
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Catle of T-he Great Prince!!!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Hmm....");
		in.nextLine(); 
		System.out.println("This is highly interesting,you just may be the one of prophecy");
		in.nextLine();
		System.out.println("Now lets get your favorite number");
		int num1 = in.nextInt();
		System.out.println("Next you will give me a weapon of choice");
		in.nextLine();
		String weapon = in.nextLine();
		System.out.println(":/ " + name + ": Why amss ");
		System.out.println("Today, " + name + " slapped Logan in " + weapon +" today");

	}

}
