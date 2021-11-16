package softwareDev;

import java.util.Scanner;

public class Pension {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age;
		System.out.print("Din ålder: ");
		age = input.nextInt();
		int pensionAge = (65 - age);
		System.out.println();
		System.out.print("Du har " + pensionAge + " år kvar till pensionen.");
		
		input.close();
	

	}

}
