package Facebook;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class CreateLoginPage {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\TestAutomationPractice\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement 	Create =driver.findElement(By.xpath("//a[text()='Create New Account']"));
		Create.click();
	//   WebDriverWait wait=new WebDriverWait(driver,50);
	 //  Create=wait.until(ExpectedConditions.visibilityOf(Create));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vishal");;		
		//WebDriverWait wait=new WebDriverWait(driver,30,100);
		//name=wait.until(ExpectedConditions.visibilityOf(name));
	//	name.sendKeys("vishal");
       WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
       Select select=new Select(day);
       select.selectByValue("10");
       Thread.sleep(5000);
		
	}
} 