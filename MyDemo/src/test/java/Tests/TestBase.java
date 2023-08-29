package Tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static   ExtentReports	extent;
	public static ExtentHtmlReporter htmlReporter;
	
	@BeforeClass
	public void startDriver() throws IOException {

		
		
		File app = new File ("app\\TaskedIn_qc1295501502971117063.apk");

		

		DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");	
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554 (11)");
	  caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			
	caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.megatrust.taskedin.presentation.screens.onboarding.OnBoardingActivity}");
	caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.megatrust.taskedin.qc");


			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		htmlReporter = new ExtentHtmlReporter("extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		 ExtentTest test1 = extent.createTest("User Can LogIn" ); 
			test1.pass("User logged in successfully");
			
	}
	
	
@AfterClass
	public void flushReport() {
		
		extent.flush();
	}

}
