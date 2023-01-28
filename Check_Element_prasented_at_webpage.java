package validation_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Element_prasented_at_webpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		boolean flag = false ;
		try {
			WebElement multicity = driver.findElement(By.xpath("//li[@data-cy='mulitiCityTrip']"));
			multicity.click();

			WebElement add_another_city = driver.findElement(By.xpath("(//button[@data-cy='addAnotherCity'])[2]"));
			flag=true;
			System.out.println("element prasented");
		}
		catch (Exception e ) {
			System.out.println("element not prasented");

		}



	}

}
