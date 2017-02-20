package calculationWithMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Hello, user! What's your name, dude?");
	String name = sc.nextLine();
		System.out.println("Ololo " + name + "!. Would you like to see a grate magik?! Enter Y, if Yes, or something else if No");
				String s = sc.nextLine();
		if (s.equals("Y")) {
			System.out.println("Please, say me, what sign do you prefer? +, -, / or * ?");
		String znak = sc.nextLine();
		System.out.println("Ok! Give me first digit and push Enter button. After that, enter second digit and push Enter again.");
		int i = sc.nextInt();
		int j = sc.nextInt();
		CalculationMethod res = new CalculationMethod (i, j, znak);
		if (znak.equals("+")) {
			System.out.println("Your result is: " + res.resultP());
		} else if (znak.equals("-")) {
			System.out.println("Your result is: " + res.resultM());
		} else if (znak.equals("*")) {
			System.out.println("Your result is: " + res.resultU());
		} else if (znak.equals("/")) {
			if (j > 0) {
			System.out.println("Your result is: " + res.resultD());
			} else {
				System.out.println("Idiot! I can't divide on 0!");
			}
		} else {
			System.out.println("What a hall are you enter in me?");
		}
		} else {
			System.out.println("Ok? bye!");
			
		}
		sc.close();
		
	}

}
