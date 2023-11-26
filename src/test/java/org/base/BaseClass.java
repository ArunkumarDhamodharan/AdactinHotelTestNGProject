package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class BaseClass {
	public static WebDriver driver;

	public static void getDriver(String browserType) {

		switch (browserType) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Project1Oct\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.Edge.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Project1Oct\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser type");
			break;
		}
	}

	public static void windMax() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void sendBasedOnJs(String txtInput, WebElement LoginUserName) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','" + txtInput + "')", LoginUserName);
	}

	public static void selectMethod(WebElement obj, String text) {
		Select s = new Select(obj);
		s.selectByVisibleText(text);
	}

	public static String excelRead(int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Documents\\xl datas\\baseClass.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.getRow(rownum);

		Cell cell = row.getCell(cellnum);

		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
				value = simple.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(l);
				value = valueOf.toString();
			}
			break;

		default:

			break;
		}
		return value;
	}
	@DataProvider(name="LoginDatas")
	private Object[][] getDatas() throws IOException {
		return new Object[][] {
			{excelRead(1,0),excelRead(1,1)},
				{excelRead(2,0),excelRead(2,1)},
			};
		}

}
