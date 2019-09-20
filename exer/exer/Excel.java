package exer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public void createExcel() {
		
		try {
			XSSFWorkbook excel =  new XSSFWorkbook();
			//XSSFSheet sheet= excel.createSheet();
			System.out.println("Excel criado");
			
			FileOutputStream out = new FileOutputStream(new File("D:\\FileEx\\workbook.xlsx"));
			excel.write(out);
			
			excel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
