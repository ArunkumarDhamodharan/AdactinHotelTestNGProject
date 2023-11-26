package org.test;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass;
import org.testng.annotations.Test;

public class ChromeTesting extends BaseClass {
	
	
	@Test(dataProvider="LoginDatas",dataProviderClass=BaseClass.class)
	private void tc01(String user,String pass) throws IOException {
		
		getDriver("Chrome");
		windMax();
		
		getUrl(excelRead(13,2));
		
		PageClass a = new PageClass();
		WebElement username = a.getUsername();
		username.sendKeys(user);
		
		WebElement passWord = a.getPassWord();
		passWord.sendKeys(pass);
		
		System.out.println(user);
		System.out.println(pass);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Parameters({"Browser"})
//	@Test(priority=1)
//	public  void tc01(String browserType) {
//		try {
//			getDriver(browserType);
//			windMax();
//			System.out.println(" Chrome Browser getting Launched Sucessfull");
//
//		} catch (Exception e) {
//			System.out.println("Chrome Browser not getting Launched Sucessfull" + "Error -" + e.getMessage());
//		}
//	}
//
//	@Test(priority=2)
//	public void tc02() {
//		try {
//			getUrl("https://adactinhotelapp.com/");
//			System.out.println("Url Launched Successfully");
//
//		} catch (Exception e) {
//			System.out.println("Url Not Launched " + "Error -" + e.getMessage());
//		}
//	}
//	
//    @Parameters({"userName","password"})
//	@Test(priority=3)
//	public void tc03(String userName,String password) {
//
//		try {
//			PageClass a = new PageClass();
//			WebElement username = a.getUsername();
//			username.sendKeys(userName);
//			WebElement passWord = a.getPassWord();
//			passWord.sendKeys(password);
//			System.out.println("Valid Credential  are Entered");
//		} catch (Exception e) {
//			System.out.println("Valid Credential  are not Entered " + "Error-" + e.getMessage());
//		}
//	}
//	@Test(priority=4)
//	public void tc04() {
//		try {
//			PageClass a = new PageClass();
//			WebElement login = a.getLogin();
//			login.click();
//			
//			System.out.println("Login Button Clicked Successfully ");
//
//		} catch (Exception e) {
//			System.out.println("Login  Button Not Clicked " + "Error-" + e.getMessage());
//		}
//	}
//	@Test(priority=5)
//
//	public  void tc05() {
//		System.out.println("Verify Successfully BookNow Message");
//	}
}