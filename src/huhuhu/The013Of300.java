package huhuhu;

import java.util.Scanner;

public class The013Of300 {
	public static void whatISay(){
		System.out.println("Hello sir!What do you want to tell me?");
		Scanner scanner = new Scanner(System.in);
		String nextline = scanner.nextLine();
		System.err.println("Oh!You say this,"+nextline);
	}

}
