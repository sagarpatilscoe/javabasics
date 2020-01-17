/**
 * 
 */
package com.jay.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 * @author spatil28
 *
 */
public class ExcelRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fio;
		try {
			fio = new FileInputStream("c:\\YourMove18032019.xlsx");
		XSSFWorkbook myworkbook = new XSSFWorkbook(fio);
      
           XSSFSheet sheet = myworkbook.getSheetAt(0);
           XSSFRow row=sheet.getRow(0);
           XSSFCell c1=row.getCell(0);
           System.out.println(c1.getStringCellValue());
	       
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
