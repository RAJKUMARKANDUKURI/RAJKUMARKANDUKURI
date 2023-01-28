package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enabled_disabled {

	public static void main(String[] args) throws Exception {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	WebElement login_button =	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]"));
		//WebElement login_button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button"));
		if (!login_button.isEnabled())
			System.out.println("login button disabled");
		else
			System.out.println("loggin button enabled");
		
	}

}
