package com.SwagLabs.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil 
{
	public static XSSFWorkbook wb;
	
	public ExcelUtil()
	{
		//Path of file setup
		  File f1=new File("./"+"\\TestData\\Data.xlsx");
		  //File data read
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			wb=new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  //Workbook--->sheet--->row--->cell--->value
		  
		  
	}
	
	
	
	public static String getFileData(int row,int col)
	{
		return wb.getSheet("userdata").getRow(row).getCell(col).getStringCellValue();
	}

}
