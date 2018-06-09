import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Selenium_Day1April {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum()+1);
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		//System.out.println(sheet.getRow(0).getCell(1).getNumericCellValue());
		
		System.out.println(sheet.getRow(0).getCell(3).getBooleanCellValue());
		
		XSSFCell cell = sheet.getRow(0).getCell(2);
			
		if(cell.getCellType()==Cell.CELL_TYPE_STRING){
			System.out.println(cell.getStringCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			System.out.println(cell.getNumericCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN){
			System.out.println(cell.getBooleanCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_BLANK){
			
		}
		
		System.out.println(workbook.getSheetIndex("Sample"));
		
		System.out.println(workbook.getSheetIndex("Sheet1"));
		
		
		int index = workbook.getSheetIndex("Sample");
		if(index==-1){
			System.out.println("Sheet doesn't exist");
		}
		
		
		System.out.println(workbook.getNumberOfSheets());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
