
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class Selenium_Day31 {

	public static void main(String[] args) throws IOException {
		//ctrl+shift+o
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		/*driver.findElement(By.linkText("REGISTER")).click();
		
		Select dropDown = new Select(driver.findElement(By.name("country")));*/
		/*dropDown.selectByVisibleText("INDIA");
		
		dropDown.selectByValue("234");
		dropDown.selectByIndex(1);*/
		
              pending  // No of options and print all options in dropdown

		/*List<WebElement> allOptions = dropDown.getOptions();
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++){
			System.out.println(allOptions.get(i).getText());
		}*/
		
		
		//Find no of Links in a page
		
	/*	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText() + " -> " + allLinks.get(i).getAttribute("href"));
		}*/

		// Making own Relative Path:Done

		/*driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();*/
		
		
		//Capture Screenshot of page
		
		/*File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\CaptureImage.bmp"));*/
		
                // Object repository file reading:

		FileInputStream fis = new FileInputStream("C:\\JavaConcepts\\MyFirstWebDriverProject\\src\\OR.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
	/*	prop.getProperty("x");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("tutorial");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		*/
		
		driver.findElement(By.xpath(prop.getProperty("x"))).sendKeys("tutorial");
		driver.findElement(By.xpath(prop.getProperty("y"))).sendKeys("tutorial");
		driver.findElement(By.xpath(prop.getProperty("z"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
