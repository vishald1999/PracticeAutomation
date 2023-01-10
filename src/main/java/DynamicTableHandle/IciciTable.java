package DynamicTableHandle;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IciciTable {
    public static void main(String[]args) {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.bseindia.com/eqstreamer/StreamerMarketwatch.html?flag=1");
    	driver.manage().window().maximize();
    	
    	List<WebElement>iciciBank=driver.findElements(By.xpath("//a[text()='ICICIBANK']/ancestor::tr/child::td"));
    	System.out.println(" All Entity Of Icici Bank "+iciciBank.size());
    	Iterator<WebElement>itr=iciciBank.iterator();
    	int coloumn=1;
    	while(itr.hasNext()) {
    		System.out.println(driver.findElement(By.xpath("//a[text()='ICICIBANK']/ancestor::tr/child::td["+coloumn+"]")).getText());
    	coloumn++;
    	}
    	
    }
}
