package TestAutomationPractice.TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLogin {
	public static void main(String[]args) throws Exception {
		WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	Thread.sleep(1000);
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Thread.sleep(1000);
	Select select = new Select(day);
	select.selectByValue("22");
}
}