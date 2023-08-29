package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}



	@AndroidFindBy(xpath ="//*[contains(@text,'Check tasks progress at any given time and anywhere through the app.')]")
	WebElement TextinFirstWorkthrough ; 

	@AndroidFindBy(id ="com.megatrust.taskedin.qc:id/next_mbtn")
	WebElement NextPage ; 



	@AndroidFindBy(xpath ="//*[contains(@text,'Can quickly and easily chat with your team')]")
	WebElement TextinSecondWorkthrough ; 



	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/next_mbtn")
	WebElement NextPage2 ; 



	@AndroidFindBy(xpath ="//*[contains(@text,'reports for your tasks and team, so you can better identify obstacles and see progress over time.')]")
	WebElement TextinThirdWorkthrough ; 

	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/start_mbtn")
	WebElement StartBtn ; 



	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/close_mbtn")
	WebElement closeFirstWorkthrough ; 

	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/employee_mbtn")
	WebElement EmployeeBtn ; 

	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/company_name_tiet")
	WebElement CompanyName ; 

	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/phone_tiet")
	WebElement Phone ; 


	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/password_tiet")
	WebElement Password ; 

	@AndroidFindBy(id="com.megatrust.taskedin.qc:id/login_mbtn")
	WebElement LoginBtn ; 






	public void GetTextInFirstWorkthrough() {
		String Text1 = TextinFirstWorkthrough.getText();
		System.out.println("first page text is : "+ Text1);
		Assert.assertEquals("Check tasks progress at any given time and anywhere through the app.", Text1);
	}

	public void ClickOnNextBtn() {
		clickButton(NextPage);
	}

	public void GetTextInSecondWorkthrough() {
		String Text2 = TextinSecondWorkthrough.getText();
		Assert.assertEquals(Text2,"Can quickly and easily chat with your team");
		System.out.println("second page text is : "+Text2);
	}


	public void ClickOnSecondNextBtn() {
		clickButton(NextPage2);
	}

	public void GetTextInThirddWorkthrough() {

		String Text3 = TextinThirdWorkthrough.getText();
		Assert.assertEquals(Text3,"reports for your tasks and team, so you can better identify obstacles and see progress over time.");
		System.out.println("third page text is : " +Text3);
	}

	public void ClickStartBtn() {
		clickButton(StartBtn);
	}

	public void CloseFirstWorkthrough() {

		clickButton(closeFirstWorkthrough);

		System.out.println("first page could be closed ");

	}



	public void ClickOnEmployeeBtn() {

		clickButton(EmployeeBtn);

		System.out.println("Employee Btn clicked ");

	}


	public void AddCompmanyName(String companyName) {

		setTextElementText(CompanyName,companyName);

	}

	public void AddPhoneNum(String phone) {

		setTextElementText(Phone,phone);

	}

	public void AddPassword(String password) {

		setTextElementText(Password,password);

	}


	public void ClickOnLoginBtn() {



		clickButton(LoginBtn);

		System.out.println("Employee Signed in successfully. ");

	}

	
}


