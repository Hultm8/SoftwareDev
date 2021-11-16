package softwareDev;

import java.util.Scanner;

public class Uppgift_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int firstInt;
		int secondInt;

		for (int i = 0; i < 5; i++) {
			System.out.print("Första värdet: ");
			firstInt = input.nextInt();

			if (firstInt == 0) {
				System.out.print("Tackar");
				System.exit(0);
			}
			System.out.print("Andra värdet: ");
			secondInt = input.nextInt();
			if (firstInt < secondInt) {
				System.out.println(secondInt + " är större än " + firstInt);
			} else if (firstInt == secondInt) {
				System.out.println(firstInt + " är samma som " + secondInt);
			} else {
				System.out.println(firstInt + " är större än " + secondInt);
			}
			System.out.println();
			System.out.println();
		}
		input.close();
	}

}
