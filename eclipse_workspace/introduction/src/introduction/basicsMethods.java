package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//This class file is to check page title
public class basicsMethods {
	
	public static void main(String [] args)
	{	
		//Create a key = "webdriver" and value = "chrome extension address"
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\selenium_java\\selenium-exe_file\\chromedriver.exe");
		
		//2nd create webdriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com"); // getMethod is to get url address
		driver.getTitle(); // To get page title
		
		//System.out.println(driver.getCurrentUrl());  //Url validation
		//System.out.println(driver.getPageSource()); //To get page source or code
		
		driver.get("http://yahoo.com");  //It will hit yahoo from google chrome
		driver.navigate().back();  // It will navigate back after hitting yahoo in google
		//driver.navigate().forward(); // It will navigate forward after hitting yahoo in google
		
		driver.close(); // It will close the chrome exe extension
		//driver.quit(); // It close all the tabs open by selenium
	
		
	}

}
