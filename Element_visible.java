package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_visible {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		try{
			WebElement email =driver.findElement(By.id("email"));


			if (email.isDisplayed())
				System.out.println("element displayed at webpage");
			else 
				System.out.println("element not displayed at webpage");
		}
		catch(Exception e) {
			System.out.println("element not in webpage");
		}
	}

}
