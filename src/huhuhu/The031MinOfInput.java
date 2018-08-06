package huhuhu;

import java.util.Scanner;

public class The031MinOfInput {
	public static void getMin(){
		System.out.println("输入几个数，获取最小值");
		Scanner scanner = new Scanner(System.in);
		String nextline = scanner.nextLine();
		String arrStr = nextline.trim();
		if(arrStr.equals("")){
			System.out.println("请输入几个数字");
			getMin();
			}
		
		String[] arrNum = arrStr.split(" {1,}");
		//" {1,}"匹配1到多个空格
		int[] arrNumInt = new int[arrNum.length];
		for(int i = 0;i<arrNum.length;i++){
			arrNumInt[i] = Integer.valueOf(arrNum[i]);
			
		}
		int minNum=arrNumInt[0];
		for(int i = 0;i<arrNumInt.length;i++){
			if(minNum>=arrNumInt[i])
				minNum = arrNumInt[i];
		}
		System.out.println("最小值为："+minNum);
	}

}
