package AlertSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select {
	public static void main(String[]args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//select[@id='course']")).click();
		Thread.sleep(5000);
		WebElement Course=driver.findElement(By.xpath("//select[@id='course']"));
		Select select=new Select(Course);
		select.selectByVisibleText("Java");
		
		Thread.sleep(5000);
		WebElement Ide=driver.findElement(By.xpath("//select[@id='ide']"));
		Select select1=new Select(Ide);
		select1.selectByVisibleText("Eclipse");
		Ide.sendKeys(Keys.CONTROL);
		select1.selectByVisibleText("IntelliJ IDEA");
		Ide.sendKeys(Keys.CONTROL);
		select1.selectByVisibleText("Visual Studio");
	    Ide.sendKeys(Keys.CONTROL);
		select1.selectByVisibleText("NetBeans");
		Thread.sleep(5000);
		select1.deselectByIndex(2);
	}
	
}
