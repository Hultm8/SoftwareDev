package softwareDev;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		String surName;
		String lastName;
		System.out.print("Vad heter du i förnamn? ");
		surName = stdIn.nextLine();
		System.out.print("Vad heter du i Efternamn? ");
		lastName = stdIn.nextLine();
		System.out.println(lastName + " " + surName);
		stdIn.close();


	}

}
