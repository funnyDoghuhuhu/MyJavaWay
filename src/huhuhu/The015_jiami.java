package huhuhu;

import java.io.InputStream;
import java.util.Scanner;

public class The015_jiami {
	public static void jiami(){
		System.out.println("����:");
		Scanner scanner = new Scanner(System.in);
		String nextline = scanner.nextLine();
		char[] array = nextline.toCharArray();
		for(int i=0;i<array.length;i++){
			array[i] = (char) (array[i]^20000);
		}
		System.out.println("���ܺ�Ϊ:");
		System.out.println(array);
	}

}
