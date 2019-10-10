package filehandling;

import java.io.IOException;

public class TestXlsReaderClass {

	public static void main(String[] args) throws IOException {
		Xls_Reader xl=new Xls_Reader("C:\\Automation\\Automationrepo\\BasicCoreJava\\src\\filehandling\\TestData.xls");
        //Get Row Count
		System.out.println(xl.getrowcount("Sheet1"));
		//Get Column count
		System.out.println(xl.getColumncount("Sheet1"));
		//Get Cell Data
		System.out.println(xl.getCellData("Sheet1", 1, 1));
	}

}
