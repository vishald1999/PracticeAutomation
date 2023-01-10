package DynamicTableHandle;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassB {
	public static void main (String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.bseindia.com/eqstreamer/StreamerMarketwatch.html?flag=1");
	driver.manage().window().maximize();
	List <WebElement> INDUSINDBK =driver.findElements(By.xpath("//tbody[@id='idTbody']/tr[21]/td"));
	//USING iterator
	Iterator<WebElement>itr=INDUSINDBK.iterator();
	int coloumn=1;
	while(itr.hasNext()) {
		itr.next();
		System.out.println(driver.findElement(By.xpath("//tbody[@id='idTbody']/tr[21]/td["+coloumn+"]")).getText());
		coloumn ++;
	}
	
}
}