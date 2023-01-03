package manage_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_2 {
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement scroll = driver.findElement(By.id("js-rangeslider-0"));
		Thread.sleep(3000);
		new Actions(driver).dragAndDropBy(scroll, 134, 0).perform();
		new Actions(driver).dragAndDropBy(scroll, -58,0).perform();
		
		
		
		
	}

}
