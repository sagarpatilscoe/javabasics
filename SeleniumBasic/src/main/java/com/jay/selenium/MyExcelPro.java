/**
 * 
 */
package com.jay.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author spatil28
 *
 */
public class MyExcelPro {
	
	public static void main(String args[]) throws Exception{
		File file = new File("C:\\Users\\spatil28\\Desktop\\jayshree.xlsx");
		
		FileInputStream iostream;
		try {
		 iostream = new FileInputStream(file);
		 XSSFWorkbook workbook= new XSSFWorkbook(iostream);
		 XSSFSheet sheet=workbook.getSheet("mysheet");
		
		 //Row row = sheet.getRow(0);
		for(int j=sheet.getFirstRowNum();j<=sheet.getLastRowNum();j++)
		{
			
		 Row row= sheet.getRow(j);
		 System.out.println("This is row :"+row.getRowNum());
		 //System.out.println(row.toString());
		 for(int i=row.getFirstCellNum();i<row.getLastCellNum();i++)
		 {
			 System.out.println("Cell num : "+row.getCell(i).getColumnIndex());
			 System.out.println(row.getCell(i));
		 }
		}
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
