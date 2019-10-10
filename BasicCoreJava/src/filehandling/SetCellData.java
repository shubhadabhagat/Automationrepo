package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Automation\\Automationrepo\\BasicCoreJava\\src\\filehandling\\TestData.xls");
		HSSFWorkbook wb=new HSSFWorkbook(file);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		HSSFRow row=sheet.getRow(0);
		HSSFCell cell=row.getCell(0);
		cell.setCellValue("Shubhada");
		FileOutputStream fileOut=new FileOutputStream("C:\\Automation\\Automationrepo\\BasicCoreJava\\src\\filehandling\\TestData.xls");
				wb.write(fileOut);
	}

}
