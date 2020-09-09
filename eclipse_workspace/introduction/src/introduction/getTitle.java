package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//This class file is to check page title
public class getTitle {
	
	public static void main(String [] args)
	{	
		//Create a key = "webdriver" and value = "chrome extension address"
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\selenium_java\\selenium-exe_file\\chromedriver.exe");
		
		//2nd create webdriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com"); // getMethod is to get url address
		driver.getTitle(); // To get page title
		
		if(driver.getTitle() =="Google");
		{
			System.out.println("Page Title is genuine");
		}
		
	}

}
