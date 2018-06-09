import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Handle Alert class
public class HandleAlert
{

   public static void main(String[] args) throws InterruptedException, AWTException
   {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
      
      /*driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
      
      Alert x = driver.switchTo().alert();
      
      System.out.println(x.getText());
      
      x.accept();*/
      
      
      //Second Example
      
      driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
      
      Alert x = driver.switchTo().alert();
      x.sendKeys("Selenium");
      
      Thread.sleep(3000);

     // x.dismiss();
      x.accept();
      
      driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
      
      x = driver.switchTo().alert();
      
      x.sendKeys("selenium");
      
      Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyPress(KeyEvent.VK_SPACE);
      
      //driver.switchTo().alert().accept();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

   }

}
