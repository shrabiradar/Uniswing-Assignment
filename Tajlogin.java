package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tajlogin {
	WebDriver driver;
	    @BeforeTest
	    @Parameters("browser")
		public void setup(String browser) throws InterruptedException{
				if(browser.equalsIgnoreCase("firefox")){
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("chrome")){
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
		}
		
		@Test
		public void testParameterWithXML() throws InterruptedException{
		// TODO Auto-generated method stub
		driver.get("https://beta.admin.taj.upswing.global/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Username*']")).sendKeys("test@upswing.global");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Password*']")).sendKeys("Test@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ion-button[text()='Sign In ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='NO THANKS']")).click();
		Thread.sleep(9000);
		driver.quit();
	}
}
