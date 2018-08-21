package huhuhu;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class readExcel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Workbook workbook = Workbook.getWorkbook(new File("D:/ahhhha/MyJavaWay/src/huhuhu/AAA.xls"));
		Sheet sheet = workbook.getSheet(0);
		Cell cell = sheet.getCell(0, 1);
		System.out.println(cell.getContents());

	}

}
