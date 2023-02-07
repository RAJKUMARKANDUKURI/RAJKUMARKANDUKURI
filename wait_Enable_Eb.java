package validation_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_Eb {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		WebElement roundtrip =	driver.findElement(By.xpath("//li[contains(@data-cy,'roundTrip')]"));
		try{
			roundtrip.isSelected();
			System.out.println("Roundtrip is selected");

			WebElement doubleseat =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[6]"));
			if(!doubleseat.isEnabled())
				System.out.println("disabled double seat fire");
			else
				System.out.println("doubleseat fire is enabled");
		}
		catch(Exception e) {
			System.out.println("it is not selected");

		}



	}

}
