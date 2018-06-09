package TestNGPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
	
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password){
		driver.get("http://newtours.demoaut.com")
		System.out.println("Username is "+username +"and password is "+password);
	}username
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0]= "user1";
		data[0][1]= 10;
		
		
		data[1][0]= "user2";
		data[1][1]= 20;
		
		
		return data;
	}
	
	
	

}
