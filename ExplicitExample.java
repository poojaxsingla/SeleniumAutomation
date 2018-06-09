import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitExample
{

   public static void main(String[] args)
   {
      WebDriver driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Global Wait
      driver.get("http://newtours.demoaut.com/");
      
      //Explicit wait
      
      WebDriverWait wait = new WebDriverWait(driver, 30);
      //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username1")));
      
      wait.until(ExpectedConditions.alertIsPresent());
      
      wait.until(ExpectedConditions.textToBePresentInElement(locator, text))
      wait.until(ExpectedConditions.textToBePresentInElement(element, text))
      WebElement x = driver.findElement(By.xpath(""));
      wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(""), text));
      wait.until(ExpectedConditions.textToBePresentInElement(x, text));
      
      wait.until(ExpectedConditions.invisibilityOfElementLocated(locator))
      wait.until(ExpectedConditions.attributeToBe(locator, attribute, value))
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

   }

}
