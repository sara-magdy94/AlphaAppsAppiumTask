package Tests;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Data.ExcelReader;
import Pages.LoginPage;
import io.appium.java_client.AppiumDriver;





public class LoginTest extends TestBase {





	LoginPage loginObject;

	public AppiumDriver<WebElement> driver;	

	@DataProvider(name="ExcelData")
	public static Object[][ ] UserRegisterData() throws IOException{	


		ExcelReader ER = new ExcelReader();

		return ER.getExcelData("SignIn");


	}



	@Test(priority=1,alwaysRun=true,dataProvider = "ExcelData")
	public void openApplication(String companyName , String phone , String password) throws  InterruptedException {

		loginObject = new LoginPage(driver); 

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		loginObject.GetTextInFirstWorkthrough();

		loginObject.ClickOnNextBtn();

		loginObject.GetTextInSecondWorkthrough();

		loginObject.ClickOnNextBtn();

		loginObject.GetTextInThirddWorkthrough();

		loginObject.ClickStartBtn();
		loginObject.CloseFirstWorkthrough();

		loginObject.ClickOnEmployeeBtn();

		loginObject.AddCompmanyName(companyName);

		loginObject.AddPhoneNum(phone);
		loginObject.AddPassword(password);

		loginObject.ClickOnLoginBtn();

	}

}


