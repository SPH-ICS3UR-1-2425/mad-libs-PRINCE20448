import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program Author: Imafidon Prince Perazim Class: ICS3U Date: Sept. 16,
		 * 2024 Make a program that asks for 10 inputs reads them into variables, and
		 * then prints out a story Make sure to include Strings, ints, and doubles!
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Catle of The Great Prince!!!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Hmm....");
		in.nextLine(); 
		System.out.println("This is highly interesting,you just may be the one of prophecy");
		in.nextLine();
		System.out.println("Now lets get your favorite number");
		int num1 = in.nextInt();
		System.out.println("Are you a Man or a Woman, My people do not assumer gender ");
		in.nextLine();
		String sex = in.nextLine();
		System.out.println(" What prefix do you prefere, Sir or Madam ");
		String prefix = in.nextLine();
		System.out.println("Next you will give me a weapon of choice");
		String weapon = in.nextLine();
		System.out.println("( " + name + ": )Why am i getting such profound treatment and where in the universe am I? ");
		in.nextLine();
		System.out.println("Oh, I apologize");
		in.nextLine();
		System.out.println("This must all be sudden");
		in.nextLine();
		System.out.println(" ( " + name + ":)You think 0__0 ");
		in.nextLine();
		System.out.println(" I sincerely apologize young " + sex +" ");
		in.nextLine();
		System.out.println(" My name is Gugutar and you've been assigned as the Champion of our Planet, Tereble");
		in.nextLine();
		System.out.println(" We have been challenged to a duel of coding, which is a subject we are unfamiliar with so we sought out your Sector");
		in.nextLine();
		System.out.println(" We heard the creatures of Earth are very profound in this topic so we sought one who looked good enough for the task,"
				+ "With permision from your Sector Leader of course, Sir Zebarth of Sector 616 (Planet Earth)");
		in.nextLine();
		System.out.println(" So without further ado, we will assign you the gear and weapon you will need");
		in.nextLine();
		System.out.println(" As of today, " + prefix+ " " + name + " the Chapion of our Dear Planet Tereble will fight for us with a Code Wave " + weapon +" from "
				+ "storage level number " + num1 + " One of the Best level of Weapons ");

	}

}
