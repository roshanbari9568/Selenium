package using_regex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a key = "webdriver" and value = "chrome extension address"
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse_parent\\eclipse_resources\\selenium_java\\selenium-exe_file\\chromedriver.exe");
				
				//2nd create webdriver
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://rediff.com");  //invoking rediff.com
				
				driver.findElement(By.cssSelector("a.signin")).click();
				driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("login"); //xpath - //tag[@attribute='value']
				driver.findElement(By.cssSelector("input#password")).sendKeys("password"); //In css selector we can use tag#id
				driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click(); //Regex contains = matches -> 'proceed' words
				var a = driver.findElement(By.cssSelector("#div_login_error")).getText();
				System.out.println(a);

	}

}
