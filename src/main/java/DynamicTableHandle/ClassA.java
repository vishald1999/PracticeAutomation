package DynamicTableHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	public static void main (String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bseindia.com/eqstreamer/StreamerMarketwatch.html?flag=1");
		driver.manage().window().maximize();
		List <WebElement> icici =driver.findElements(By.xpath("//tbody[@id='idTbody']/tr[11]/td"));
		for(int i=1;i<=icici.size();i++) {
			System.out.println(driver.findElement(By.xpath("//tbody[@id='idTbody']/tr[11]/td["+i+"]")).getText());
	}		
}
}

