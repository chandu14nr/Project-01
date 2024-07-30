package generic;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
public class FileLib {
public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
public String getPropertyData(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	java.util.Properties p=new java.util.Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
}

