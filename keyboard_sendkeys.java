package manage_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

import javafx.scene.control.Tab;

public class Keyboard_interactions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
//		new Actions(driver).sendKeys("krish"+Keys.TAB+"k"+Keys.TAB+"krish222@gmail.com"+Keys.TAB+"krish222@gmail.com").perform();
//		
		//we can using keyboard interactions using time intervells
		
	    
		
		WebElement fname1=driver.findElement(By.xpath("//input[@name='firstname']"));
		new Actions(driver).sendKeys(fname1, "Radha").pause(3000)
		.sendKeys(Keys.TAB).pause(3000)
		.sendKeys("k").pause(3000)
		.sendKeys(Keys.TAB).pause(3000)
		.sendKeys("radha krishna143@gmail.com").pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys("radha krishna143@gmail.com").pause(3000)
		.sendKeys(Keys.TAB)
		.sendKeys("9010028808").pause(1000)
		.sendKeys(Keys.TAB).pause(1000)
		.sendKeys(Keys.TAB).pause(1000)
		.sendKeys("12"+Keys.TAB+"dec",Keys.TAB+"2011")
		.sendKeys(Keys.TAB,Keys.TAB).click().perform();
