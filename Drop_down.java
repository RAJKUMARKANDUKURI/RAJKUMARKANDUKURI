package manage_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javafx.util.Duration;

public class Drop_down {

	public static void main(String[] args) throws Exception {
		 
	WebDriver driver = new FirefoxDriver();
	driver.get("http://bridgeqsystems.com/demo.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(30));
	
	//driver.findElement(By.xpath("(//span[@class='p_ si34 '])[1]")).click();
	
	
	WebElement Button_link=driver.findElement(By.xpath("//button[contains(.,'Buttons')]"));
	Button_link.click();
	Thread.sleep(4000);

	WebElement Element=driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"));
	new Actions(driver).doubleClick(Element).perform();

	
	
	

	}

}
