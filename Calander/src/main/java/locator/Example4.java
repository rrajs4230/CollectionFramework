package locator;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example4 {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		  
		
	
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe"); 
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String source="Aurangabad";
		String destination="Patna";
		String From="src";
		String to ="dest";
		     
//		while(true) {
//			
//		    WebElement element = driver.findElement(By.xpath("//input[@id='"+journey+"']"));
//		                element.clear();
//		                element.sendKeys("Aurangabad");
//		     
//		     
//		     if(source.equals(destination))
//		     {
//		    	 break;
//		     }
//		     else
//		    	 System.out.println("source and destination could not be same!");
//		     break;
//		}
//		
		
	}

}
