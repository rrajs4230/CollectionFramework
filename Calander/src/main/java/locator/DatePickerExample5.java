package locator;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerExample5 {
	
	
	public static void main(String[] args) throws InterruptedException {
		String expectedMonthYear="Jun 2025";   
	    String expectedDate="6";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		
		
		
		while(true)
		{
			String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println("Current Month And Year-->"+monthYear);
			if((expectedMonthYear).contains(monthYear))
			{
//				List<WebElement> date=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
//				for(WebElement element:date)
//				{
//					String calenderDate=element.getText();
//					if(expectedDate.equals(calenderDate))
//					{
//						element.click();
//						break;
//					}
//				}
//				break;
				
				driver.findElement(By.xpath("//td[text()='"+expectedDate+"']")).click();
				  break;
			}
			
			else
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]")).click();
			   
		}
		
	}


}

