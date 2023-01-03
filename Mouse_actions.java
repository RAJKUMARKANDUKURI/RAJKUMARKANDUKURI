package manage_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws Exception {
		
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://paytm.com/");
//	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
	
  //  performing hover actions at selected target 
	WebElement  mainmenu_consumer =driver.findElement(By.xpath("//a[contains(.,'Paytm for Consumer')]"));
	new Actions(driver).moveToElement(mainmenu_consumer).perform();
	Thread.sleep(3000);
	
	WebElement payments_submenu = driver.findElement(By.xpath("(//div[contains(@class,'_2dve7')])[1]"));
	new Actions(driver).moveToElement(payments_submenu).perform();
	
	Thread.sleep(2000);
	WebElement OnlinePayment =driver.findElement(By.xpath("//a[@href='https://paytm.com/online-payments'][contains(.,'Online Payments')]"));
	new Actions(driver).click(OnlinePayment).perform();
	Thread.sleep(2000);
	WebElement mm  =driver.findElement(By.linkText(" Millions pay Online with Paytm Everyday"));
	new Actions(driver).moveToElement(mm).perform();
	
	}

}
