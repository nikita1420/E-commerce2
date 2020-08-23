package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils
{
	public static FileInputStream fis;
	public static FileOutputStream fo;
public static XSSFWorkbook wb;
public static XSSFSheet ws;
public static XSSFRow row;
public static XSSFCell cell;




public static  int getRowCount(String xlfile,String sheetname) throws IOException
{
	fis = new FileInputStream(xlfile);
	 wb= new XSSFWorkbook(fis);
	 ws = wb.getSheet(xlfile);
	int rowcount=ws.getLastRowNum();
	wb.close();
	fis.close();

	
	return rowcount;


}
public static  int getCellCount(String xlfile,String sheetname, int rownum) throws IOException
{
	fis = new FileInputStream(xlfile);
	 wb= new XSSFWorkbook(fis);
	 ws = wb.getSheet(xlfile);
	 row=ws.getRow(rownum);
	 int cellcount =row.getLastCellNum();
	
	
	return cellcount;


}
public String getData(int sheetIndex,int row,int column)
{
	String data =wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	return data;
	}
public String getData(String Sheetname,int row,int column)
{
	String data =wb.getSheet(Sheetname).getRow(row).getCell(column).getStringCellValue();
	return data;
	}
}



