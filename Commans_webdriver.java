package manage_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Tab;

public class Commans_webdriver {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
	
           driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("krish",Keys.TAB+"k"+Keys.TAB+"93930309");
		
          driver.findElement(By.id("day")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.TAB+"8",Keys.TAB+"2022");
	}

}
