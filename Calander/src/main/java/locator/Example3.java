package locator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3 {
	
	
	public static void main(String[] args) 
	{
	  
      
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         
        int pageMax=driver.findElements(By.xpath("//div[@id='example_paginate']/child::span/a")).size();
        System.out.println("Number of Page:"+pageMax);
         
        for(int i=1; i<=pageMax; i++)
        {
        	String pageSelector="//div[@id='example_paginate']/child::span/a["+i+"]";
        	driver.findElement(By.xpath(pageSelector)).click();
        	
        	List<WebElement> name = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/child::td[1]"));
        	
        	for(WebElement element:name) {
        		
        		System.out.println(element.getText());
        	}
        		
        }
	}
     
	
	

}
