package TestNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("This is before suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is before test");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("Opening the browser");
	}
	
	
	@Test(priority=1)
	public void f(){
		
		//Call Open browser
		System.out.println("Performing the Login Operation");
		//call close browser
	}
	
	@Test(priority=2)
	public void a(){
		//Call opening browser
		System.out.println("Performing the registartion operation");
		//call close browser
	}
	
	
	@Test
	public void z(){
		//Call opening browser
		System.out.println("Performing the zz operation");
		//call close browser
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("closing the browser");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("this is after test");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("This is after suite");
	}

}
