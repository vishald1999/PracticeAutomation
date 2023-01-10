package WindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	public static void main (String[]args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		//we store parent window handle for switching back to parent window
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("document.getElementById('newWindowsBtn').click();");
		
		Set<String>setOfHandles=driver.getWindowHandles();
		
		Iterator<String>itr=setOfHandles.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				System.out.println("childWindow title = "+driver.getTitle());
			    Thread.sleep(5000);
			    jse.executeScript("window.scrollBy(0,500)");			    
			    driver.findElement(By.xpath("//input[@id='firstName']")) .sendKeys("Vishal");
			    Thread.sleep(5000);
				driver.close();			
			}
			////input[@id='firstName']
			////input[@name='name']
		
			String childWindow1=itr.next();
			if(!parentWindow.equals(childWindow1)) {
				driver.switchTo().window(childWindow1);
				driver.manage().window().maximize();		
				System.out.println("childWindow title = "+driver.getTitle());
			    jse.executeScript("window.scrollBy(0,500)");    
			    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("deshmukh");
			    Thread.sleep(5000);
				driver.close();		
			}
			//then switch parent window		
			driver.switchTo().window(parentWindow);
			System.out.println("parentWindow title = "+driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("pw");
			Thread.sleep(5000);
		}
		
	}

}
