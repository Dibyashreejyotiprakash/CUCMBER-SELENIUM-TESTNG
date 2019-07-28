package com.cucmber.filereader;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.cucmber.filereader.*;

public class ExcelReader {

PropertyReader prop=new PropertyReader();
	
	String path=prop.getTestDataExcelPath();
	
	public String readExcel(String Sheetname,int rownum,int colnum) throws Exception 
	{
		String data="";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			
			Workbook wb=WorkbookFactory.create(fis);
			
			Sheet sh=wb.getSheet(Sheetname);
			
			Row row=sh.getRow(rownum);
			
			data=row.getCell(colnum).getStringCellValue();		
		}
		catch(Exception e)
		{
			System.out.println("Read Excel failed due to "+ e);
			throw e;
		}
		return data;
		
	}
	
}
