package TestAutomationPractice.TestAutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
	public static void main(String[]args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver","D:\\project\\TestAutomationPractice\\Driver\\chromedriver.exe");
	            ChromeDriver driver=new ChromeDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver; 
            driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	            driver.manage().window().maximize();
	           js.executeScript("window.scrollBy(0,500)");
               driver.findElement(By.xpath("//input[@name='name']"))
                .sendKeys("Vishal");
               driver.findElement(By.xpath("//input[@name='name'][2]"))
               .sendKeys("Deshmukh");
               driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("Vishald9679@gmail.com");
	            Thread.sleep(5000);
	            
//	            driver.get("https://www.facebook.com/"); 
//	            String elementType = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getAttribute("type");
//	            System.out.println(elementType); 
////	            if (elementType.equalsIgnoreCase("text")) 
////	            { 
////	            	System.out.println("it is a textbox");
////	            	}else
////	            	{ 
////	            		System.out.println("it is NOT  a textbox");
////	            		}
//	            }
	            
	}


}