package softwareDev;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uppgift_1_b {

	public static void main(String[] args) {
		
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		String name;
		String hourSallary;
		String hours;
		
		System.out.print("Namn: ");
		name = input.nextLine();
		System.out.print("Timl�n: ");
		hourSallary = input.nextLine();
		Double foo = Double.parseDouble(hourSallary);
		
		System.out.print("Antal timmar jobbat: ");
		hours = input.nextLine();
		Double bar = Double.parseDouble(hours);
		
		Double foobar = foo * bar;
		
		String weeklySalary = decimalFormat.format(foobar);
		System.out.print(name.toUpperCase() + " du tj�nade " + weeklySalary + " kr f�rra veckan." );
		
		input.close();
	}
}

