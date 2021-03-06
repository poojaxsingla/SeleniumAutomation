import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class UploadEx
{

   public static void main(String[] args) throws FindFailed
   {
      WebDriver driver = new FirefoxDriver();

      driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

      driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();

      Pattern img1 = new Pattern("C:\\Sikuli\\Img1.png");
      Pattern img2 = new Pattern("C:\\Sikuli\\Img2.png");

      Screen screen = new Screen();

      screen.wait(img1,10);

      screen.type("C:\\mycom\\test4.txt");

      screen.wait(img2,10);
      screen.click(img2);
   }

}
