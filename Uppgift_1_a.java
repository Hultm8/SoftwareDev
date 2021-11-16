package softwareDev;

import java.util.Scanner;

public class Uppgift_1_a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstWord;
		String secondWord;
		System.out.print("Första ordet: ");
		firstWord = input.nextLine();
		System.out.print("Andra ordet: ");
		secondWord = input.nextLine();
		System.out.println(firstWord + " " + secondWord);
		System.out.print(firstWord.length() + secondWord.length() + 1);
		input.close();

	}

}
