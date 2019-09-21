package excelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {
	
	String path;
	String sheetName;
	FileInputStream fis;
	File file;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String data;
	static ExcelReader excel;
	

	public ExcelReader(String path) throws IOException{

		this.path=path;
		try {
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		wb.close();
		
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
		
	public int getRowCount(String sheetName){
		int index = wb.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else{
		sheet = wb.getSheetAt(index);
		int number=sheet.getLastRowNum()+1;
		return number;
		}
		
	}

	
	public String getCellData(String sheetName,String colNum,int rowNum){
		try{
			if(rowNum <=0)
				return "";
		
		int index = wb.getSheetIndex(sheetName);
		int col_Num=-1;
		if(index==-1)
			return "";
		
		sheet = wb.getSheetAt(index);
		row=sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++){
			//System.out.println(row.getCell(i).getStringCellValue().trim());
			if(row.getCell(i).getStringCellValue().trim().equals(colNum
					.trim()))
				col_Num=i;
		}
		if(col_Num==-1)
			return "";
		
		sheet = wb.getSheetAt(index);
		row = sheet.getRow(rowNum-1);
		if(row==null)
			return "";
		cell = row.getCell(col_Num);
		
		if(cell==null)
			return "";
		//System.out.println(cell.getCellType());
		if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			  return cell.getStringCellValue();
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC || cell.getCellType()==Cell.CELL_TYPE_FORMULA ){
			  
			  String cellText  = String.valueOf(cell.getNumericCellValue());
			  if (HSSFDateUtil.isCellDateFormatted(cell)) {
		           // format in form of M/D/YY
				  double d = cell.getNumericCellValue();

				  Calendar cal =Calendar.getInstance();
				  cal.setTime(HSSFDateUtil.getJavaDate(d));
		            cellText =
		             (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
		           cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +
		                      cal.get(Calendar.MONTH)+1 + "/" + 
		                      cellText;
		           
		           //System.out.println(cellText);
                      }

			  
			  
			  return cellText;
		  }else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
		      return "";
		  else 
			  return String.valueOf(cell.getBooleanCellValue());
			}
			catch(Exception e){
				
				e.printStackTrace();
				return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
			}
		         }

	                                 
	public static ArrayList<Object []> getDataFromExcel(){
		
		ArrayList<Object[]>al=new ArrayList<Object[]>();
		try {
			 excel= new ExcelReader("C:\\Users\\Ashirbad\\com.TestApplication\\resources\\DataSheet.xlsx");
		}
		catch(Exception e) {
    		e.printStackTrace();	
		}
		for(int rowNum=2;rowNum<excel.getRowCount("Sheet1");rowNum++) {
			String firstname=excel.getCellData("Sheet1", "Name", rowNum);
			String lastname=excel.getCellData("Sheet1", "Location", rowNum);
			String address1=excel.getCellData("Sheet1", "address1", rowNum);
			String address2=excel.getCellData("Sheet1", "address2", rowNum);
			String city=excel.getCellData("Sheet1", "city", rowNum);
			String state=excel.getCellData("Sheet1", "state", rowNum);
			String zipcode=excel.getCellData("Sheet1", "zipcode", rowNum);
			String emailaddress=excel.getCellData("Sheet1", "emailaddress", rowNum);
			Object[] obj= {firstname,lastname,address1,address2, city, state, zipcode,emailaddress};
			al.add(obj);
			//System.out.println(al);
		}
		return al;	
		
	}
	

  
}

