package softwareDev;

public class Task1 {
	
	public static void main(String[] args) {
		
		int tal = 10;
		int tal2 = 25;
		System.out.println(tal++ + tal++);
		System.out.println(tal);
		tal = 10;
		System.out.println(tal++ + ++tal);
		tal = 10;
		System.out.println(++tal + ++tal);
		System.out.println(++tal - tal++ - --tal - tal--);
		System.out.println(tal++ - --tal2);
	}
}
