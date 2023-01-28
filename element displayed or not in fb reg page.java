package validation_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_displayed_or_not {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("keerthi.bangaram123@gmail.com");
		Thread.sleep(3000);

		WebElement retype_email = driver.findElement(By.name("reg_email_confirmation__"));

		if (retype_email.isDisplayed())
			System.out.println("Retype emailbox is displayed");
		else
			System.out.println("retype emailbox is not displayed");




	}

}
