package softwareDev;

import java.util.Scanner;

public class Uppgift_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int firstInt;
		int secondInt;

		for (int i = 0; i < 5; i++) {
			System.out.print("F�rsta v�rdet: ");
			firstInt = input.nextInt();

			if (firstInt == 0) {
				System.out.print("Tackar");
				System.exit(0);
			}
			System.out.print("Andra v�rdet: ");
			secondInt = input.nextInt();
			if (firstInt < secondInt) {
				System.out.println(secondInt + " �r st�rre �n " + firstInt);
			} else if (firstInt == secondInt) {
				System.out.println(firstInt + " �r samma som " + secondInt);
			} else {
				System.out.println(firstInt + " �r st�rre �n " + secondInt);
			}
			System.out.println();
			System.out.println();
		}
		input.close();
	}

}
