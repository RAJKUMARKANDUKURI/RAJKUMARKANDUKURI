package java_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.page.Page;

import com.github.dockerjava.api.model.Driver;

public class Ui_verifications_commands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();

		String pageTitle =   driver.getTitle();
		System.out.println("Current window title is -->"+pageTitle);

		String pageurl = driver.getCurrentUrl();
		System.out.println("current page url==>"+pageurl);
		String handle =	driver.getWindowHandle();
		System.out.println("window handle==>"+handle);

		String source =	driver.getPageSource();
		System.out.println("page source==>"+source);
	}

}
