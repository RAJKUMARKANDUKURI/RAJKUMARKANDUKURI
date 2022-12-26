package librarys_test;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Selenium_praccties {

	

	public static void main(String[] args) {//
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9dsgsg");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB+"0kfedkl",Keys.ENTER);
	    driver.findElement(By.linkText("xlink:href=\"https://scontent.fhyd7-1.fna.fbcdn.net/v/t39.30808-1/316200531_3404818753128967_4781247149025215387_n.jpg?stp=c0.0.60.60a_cp0_dst-jpg_p60x60&_nc_cat=111&ccb=1-7&_nc_sid=7206a8&_nc_ohc=Mokzqzr9xnYAX-7gkKW&_nc_ht=scontent.fhyd7-1.fna&oh=00_AfDbdbqWMVHmJvl0jN5B0ia9F52U7PQoTUFMmynJ124VjQ&oe=63AEB9D1\""))
	    .click();
	    driver.findElement(By.linkText("Log Out")).click();
	  
	  
	    
	    
	}
}
