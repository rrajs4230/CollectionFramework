package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers");
	
		String company_name="G V Films";
		
		String price= driver.findElement(By.xpath("//a[contains(text(),'"+company_name+"')]/parent::td/following-sibling::td[3]")).getText();
	     System.out.println(price);
		
	}

}
