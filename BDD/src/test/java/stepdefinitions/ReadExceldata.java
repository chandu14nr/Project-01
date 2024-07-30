package stepdefinitions;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Given;

public class ReadExceldata {
	@Given("The sheet name is {string}, row index is {int} , cell index is {int}")
public void the_sheet_name_is_row_index_is_cell_index_is(String sheet, Integer row, Integer cell) throws EncryptedDocumentException, IOException {
		generic.FileLib f=new generic.FileLib();
		String data = f.getExcelData(sheet, row, cell);
		System.out.println(data);
	}

}
