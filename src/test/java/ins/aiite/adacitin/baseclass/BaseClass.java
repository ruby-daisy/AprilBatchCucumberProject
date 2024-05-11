package ins.aiite.adacitin.baseclass;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.*;
	
	public class BaseClass{
		//WebDriverManager.chromedriver().setup();
		public static Actions action;
		public static WebDriver driver;
		static Object[][] twoDimArray=null;
		static String value=null;
		public static WebDriver browser() {
			
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			return driver;
		}
		
	public static void browserSelect(String b) {
		
		if(b.equals("chrome"))
		{
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		else if (b.equals("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("Edge");
			
		}
		else if (b.equals("firefox"))
		{
			System.out.println("I donot have firefox, so only syso");
		}
		
		else
		{
				System.out.println("The browser is feasible");
				
			}
	}
	
	
			public static void winMax(){
				driver.manage().window().maximize();
			}
			
			public static void getUrl(String url){
				driver.get(url);
			}
			public static void navigate(String Url){
				driver.navigate().to(Url);
			}
			public static void navigateback(){
				driver.navigate().back();
			}
			public static void navigateForward(){
				driver.navigate().forward();
			}
			public static void getCurrentUrlcode(){
				System.out.println(driver.getTitle());
			}
			public static void getTitle(){
				System.out.println(driver.getTitle());
			}
			public static void  getpagesource(){
				System.out.println(driver.getPageSource());
			}
			public static void close(){
				driver.close();
			}
			public static void quit(){
				driver.quit();
			}
			
			
			public static void sendKeys(WebElement element, String data) {
				element.sendKeys(data);	
			}
			
			
			//Locators
			public static WebElement byId(String value){
				return driver.findElement(By.id(value));
			}
			
			public static WebElement findElementBy(By by) {
				return driver.findElement(by);			
			}
			
			
			public static WebElement byName(String value){
				return driver.findElement(By.name(value));
			}
			public static WebElement byClassName(String value){
				return driver.findElement(By.className(value));
			}
			public static WebElement byTagName(String value){
				return driver.findElement (By.tagName(value));
			}
			public static WebElement byLinkText(String value)
			{
				return driver.findElement(By.linkText(value));
			}
			public static WebElement byPartialLinkText(String value){
				return driver.findElement(By.partialLinkText(value));
			}
			public static WebElement byXpath(String value){
				return driver.findElement(By.xpath(value));
			}
			
			public static void scrolldown(String element,int i,int j) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(i,j)");
			}
	
//			public static void Click(String value) {
//			WebElement click=driver.findElement(By.xpath(value));
//			click.click();
//			}
//			public static void clear(String value) {
//			WebElement c=driver.findElement(By.xpath(value));
//			c.clear();
//			}
		
			
			public static WebElement click(WebElement element) {
				element.click();
				return element;

			}
			//getAttributes
			public static String  getAttribute(WebElement element, String attributeName) {
			
		        return element.getAttribute(attributeName);
		    }

			public static void RightClick(WebElement value){
				action=new Actions(driver);
				action.contextClick(value).perform();
			}
			
			
			
			
//			public static void SendKeys(WebElement element,String value) {
//				element.sendKeys(value);
//			}
	public static WebElement Clear(WebElement element) {
		element.clear();
		return element;
	}

//			public static void Quit(WebElement element) {
//				((WebDriver) element).quit();
//			}
			
//			public static void Quit(WebElement element) {
//				element.quit();
//			}
			
			//Select
			//Single dropDown
			public static Select select;
			
			public static Select dropdown(WebElement element) {
				Select select = new Select(element);
				return select;

			}
			public static void selectByIndex(int index) {
				select.selectByIndex(index);
			}

			public static void SddByIndex(String value,int index) {
			select=new Select(driver.findElement(By.id(value)));
			select.selectByIndex(index);
			}
			
			public static void SddByValue(String location,String value) throws InterruptedException {
				
			//select=new Select(location);
			
			select.selectByValue(value);
			Thread.sleep(1000);
			}
			
			public static void SddByVisibleText(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
			}
			
//			public static void BygetOptions(WebElement element,String value) {
//				
//			Select select=new Select(element);
//			List<WebElement>options =select.getOptions();
//			(WebElement option:options){
//			System.out.println(option.getText());
//			}
//			//}
			//MultiDropDown
			
			public static void isMultiple(WebElement element,String value) {
			Select s=new Select(element);
			System.out.println("Selected:"+s.isMultiple());
			}
			
			public static void getFirstselectedOptions(WebElement element,int value1,String value2,String value3 ) {
			
				Select select=new Select(element);
				select.selectByIndex(value1);
				select.selectByValue(value2);
				select.selectByVisibleText(value3);
				System.out.println("First Selected Option:"+select.getFirstSelectedOption().getText());
			}
			
			public static void getAllselectedOPtion(WebElement element,int value1,String value2,String value3) {
			Select select=new Select(element);
			select.selectByIndex(value1);
			select.selectByValue(value2);
			select.selectByVisibleText(value3);
			java.util.List<WebElement>allSelect=select.getAllSelectedOptions();
			for(WebElement allop:allSelect) {
			System.out.println("Selected:"+allop.getText());
			}
			}
			
			public static void deselectedbyIndex(WebElement element,int value1,String value2,String value3,int value4) {
			Select select=new Select(element);
			select.selectByIndex(value1);
			select.selectByValue(value2);
			select.selectByVisibleText(value3);
			select.deselectByIndex(value4);
			}
			
			public static void deselectedbyValue(WebElement element,int value1,String value2,String value3,String value4) throws InterruptedException {
			
			Select select=new Select(element);
			select.selectByIndex(value1);
			select.selectByValue(value2);
			select.selectByVisibleText(value3);
			Thread.sleep(2000);
			select.deselectByValue(value4);
			}
			
			public static void deselectedbyVisibleText(WebElement element,int value1,String value2,String value3,String value4) throws InterruptedException {
				Select select=new Select(element);
				select.selectByIndex(value1);
				select.selectByValue(value2);
				select.selectByVisibleText(value3);
				Thread.sleep(2000);
				select.deselectByVisibleText(value4);
				}
			
			public static void deselectall(WebElement element,int value1,String value2,String value3) throws InterruptedException {
				
				Select select=new Select(element);
				select.selectByIndex(value1);
				select.selectByValue(value2);
				select.selectByVisibleText(value3);
				Thread.sleep(2000);
				select.deselectAll();
				}
			public static String readProperty(String key) {
				String value=null;
				try {
					FileReader r = new FileReader("C:\\Users\\Anand\\MyBatches\\MavenTaskUsingPOMAbstract\\src\\test\\resources\\testdata\\credentialsdev.properties");
					Properties prop = new Properties();
					prop.load(r);
					value = prop.getProperty(key);

				} catch (FileNotFoundException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();
				}
				return value;

			}
			//Write reuseMethod
			public static void excelWrite(String sheetName, int r, int c, String value) {

				try {
					String filePath = "C:\\Users\\Anand\\MyBatches\\MavenTaskUsingPOMAbstract\\src\\test\\resources\\testdata\\Task1.xlsx";
					File file = new File(filePath);
					FileInputStream fis = new FileInputStream(file);
					Workbook wb = new XSSFWorkbook(fis);		
					
					Sheet createSheet = wb.createSheet(sheetName);
					Row createRow = createSheet.createRow(r);
					Cell createCell = createRow.createCell(c);
					createCell.setCellValue(value);
					FileOutputStream fos = new FileOutputStream(file);
					wb.write(fos);
					wb.close();

				}

				catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			public static String excelReuse(int i,int j) {
			    String value=null;
					
					try {
						File f=new File("C:\\Users\\Anand\\MyBatches\\MavenTaskUsingPOMAbstract\\src\\test\\resources\\testdata\\Task1.xlsx");
						FileInputStream fis=new FileInputStream(f);
						Workbook w=new XSSFWorkbook(fis);
						Sheet sheet = w.getSheet("Sheet1");
							Row row = sheet.getRow(i);
							Cell cell = row.getCell(j);
							
								int cellType = cell.getCellType();//depreciated method
								
								if(cellType==1) {//string
									value = cell.getStringCellValue();
									System.out.println(value);
								}else if(cellType==0){//number /date
									if(DateUtil.isCellDateFormatted(cell)) {
										Date dateCellValue = cell.getDateCellValue();
										System.out.println(dateCellValue);
										SimpleDateFormat sf=new SimpleDateFormat("MMM/dd/yyyy");//user format
										value= sf.format(dateCellValue);
										System.out.println(value);
									}else {
										double numericCellValue = cell.getNumericCellValue();
										long numeric=(long)numericCellValue;//casting
										value = String.valueOf(numeric);//covert long-string
										System.out.println(value);
									}
								}
						

					
				} catch (FileNotFoundException e) {
					
				} catch (IOException e) {
					
				}
				return value;

				
				
				
			}
			
			public static Object[][] covertExcelToTwoDimenArray()
			{	
				
				try {
					File f=new File("C:\\Users\\Anand\\MyBatches\\NovBatchTestNGProject\\src\\test\\resources\\TestData\\LoginData.xlsx");
					FileInputStream input=new FileInputStream(f);
					Workbook workbook = new XSSFWorkbook(input);
					Sheet sheet=workbook.getSheet("Sheet1");
					int totalNumberOfRows=sheet.getPhysicalNumberOfRows();
					int totalNumberOfCells=sheet.getRow(0).getPhysicalNumberOfCells();
					
					twoDimArray= new Object[totalNumberOfRows-1][totalNumberOfCells];// if not done, u will get null pointer exception
					
					for(int i =1;i<totalNumberOfRows;i++)
					{
						Row row=sheet.getRow(i);
						for (int j =0;j<totalNumberOfCells;j++)
						{
							Cell cell= row.getCell(j);
							int cellType=cell.getCellType();
							if(cellType==1)
							{
								value=cell.getStringCellValue();
							}
							else if(cellType==0)
							{
								if(DateUtil.isCellDateFormatted(cell))
								{
									Date dateCellValue=cell.getDateCellValue();
									SimpleDateFormat sc=new SimpleDateFormat("dd-MM-yyyy");
									value=sc.format(dateCellValue);
								}
								else
								{
									double numericCellValue=cell.getNumericCellValue();
									long l=(long)numericCellValue;
									value=String.valueOf(l);
								}
							}
							twoDimArray[i-1][j]=value;			
							
						}
					}			
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return twoDimArray;
				
			}
			public static void printTwoDImArray(Object[][] convertToArray)
			{
				for(int i=0;i<convertToArray.length;i++)
				{
					for (int j=0;j<convertToArray[i].length;j++)
					{
						System.out.print(convertToArray[i][j]+ " ");
					}
					System.out.println();
				}
			}


		}
		



	

