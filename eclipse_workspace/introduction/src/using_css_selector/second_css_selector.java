package using_css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//This class file is to hit google chrome browser
public class second_css_selector {
	
	public static void main(String [] args)
	{	
		//Create a key = "webdriver" and value = "chrome extension address"
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\selenium_java\\selenium-exe_file\\chromedriver.exe");
		
		//2nd create webdriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");  //invoking salesforce.com
		driver.findElement(By.cssSelector("#username")).sendKeys("Hello");; // It will find the selector which has css selector "username"
		
		
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.cssSelector("#Login")).click(); // It will bring error after login click
		
		System.out.println(driver.findElement(By.id("error")).getAttribute("innerHTML")); // we can use getAttribute as alternative for getText
		

		
		
		
		//driver.findElement(By.id("identify_email")).sendKeys("8779381704");
		
		//driver.findElement(By.xpath("//*[@id=\'identify_yourself_flow\']/div/div[3]/div/div[1]/a/span")).click(); //using xpath
		
		
//		driver.close();
//		driver.quit();
	}

}
