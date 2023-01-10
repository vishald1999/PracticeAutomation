package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
public static void main(String[]args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scrollBy(0,1500)");
	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("home");
	 Thread.sleep(5000);
	 //below line will shift driver focus to frame 2
	 driver.switchTo().frame("frm3");
	 driver.switchTo().frame("frm2");
	 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vishal");
	 Thread.sleep(5000);
	 driver.switchTo().parentFrame();
	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("deshmukh");
	 Thread.sleep(5000);
	 driver.switchTo().defaultContent(); 
	 Thread.sleep(3000);
	 
} 
}
