package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//This class file is to hit google chrome browser
public class locators {
	
	public static void main(String [] args)
	{	
		//Create a key = "webdriver" and value = "chrome extension address"
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\selenium_java\\selenium-exe_file\\chromedriver.exe");
		
		//2nd create webdriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");  //invoking fb.com
		driver.findElement(By.id("email")).sendKeys("Hello");; // It will find the selector which has id "email"
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.findElement(By.id("identify_email")).sendKeys("8779381704");
		
		driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a/span")).click(); //using xpath
		
		
//		driver.close();
//		driver.quit();
	}

}
