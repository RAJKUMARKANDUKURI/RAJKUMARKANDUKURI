package java_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_prasented {

	public static void main(String[] args) {

		WebDriver driver=null;
		try {
			driver  = new ChromeDriver();
			System.out.println("browser is opened");
		}catch (Exception b) {
			b.printStackTrace();
		}
		if (driver != null) {
			driver.get("http:facebook.com");
			driver.manage().window().maximize();
			if (driver.getPageSource().contains("email")) {
				driver.findElement(By.id("email")).sendKeys("krish");
				String title   =		driver.getTitle(); System.out.println("title"+title);
			}
			else {
				System.out.println("element is not prasented");
			}
		}
	}

}
