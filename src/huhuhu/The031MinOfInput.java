package huhuhu;

import java.util.Scanner;

public class The031MinOfInput {
	public static void getMin(){
		System.out.println("���뼸��������ȡ��Сֵ");
		Scanner scanner = new Scanner(System.in);
		String nextline = scanner.nextLine();
		String arrStr = nextline.trim();
		if(arrStr.equals("")){
			System.out.println("�����뼸������");
			getMin();
			}
		
		String[] arrNum = arrStr.split(" {1,}");
		//" {1,}"ƥ��1������ո�
		int[] arrNumInt = new int[arrNum.length];
		for(int i = 0;i<arrNum.length;i++){
			arrNumInt[i] = Integer.valueOf(arrNum[i]);
			
		}
		int minNum=arrNumInt[0];
		for(int i = 0;i<arrNumInt.length;i++){
			if(minNum>=arrNumInt[i])
				minNum = arrNumInt[i];
		}
		System.out.println("��СֵΪ��"+minNum);
	}

}
