package softwareDev;

import java.util.Scanner;

public class Uppgift_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] myNum = new int[5];
		int sum = 0;
		double middle = 0;
		System.out.println("Skriv in fem nummer: ");
		int max = myNum[0];
		for (int i = 0; i < myNum.length; i++) {

			myNum[i] = input.nextInt();
			sum = sum + myNum[i];
			middle = middle + (myNum[i]);
			if (myNum[i] > max) {
				max = myNum[i];
			}
		}
		System.out.println("Summan av talen: " + sum);
		System.out.println("Största talet: " + max);
		System.out.println("Medelvärdet av talen: " + (middle / myNum.length));
		input.close();
	}

}
