package locator;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerExample6 {

	public static void main(String[] args) {
		String expectedMonthYear="June 2023";   
	    String expectedDate="6";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/span/span")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		while(true)
		{
			String monthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			System.out.println("Current month And Year"+monthYear);
			if(expectedMonthYear.contains(monthYear))
			{
				List<WebElement> date = driver.findElements(By.xpath("//p[@class='fsw__date']"));
				for(WebElement element:date)
				{
					String calenderDate=element.getText();
					if(expectedDate.contains(calenderDate))
					{
					element.click();
						break;
					}
				}
			   
				break;
				
			}
			else
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
	}

}
