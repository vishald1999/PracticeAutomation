package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchUrl {
	@Test
 public void m1() {
	 System.setProperty("webdriver.chrome.driver","D:\\project\\TestAutomationPractice\\Driver\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
 
 }
}
