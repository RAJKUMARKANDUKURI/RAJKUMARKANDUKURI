package manage_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        
        
        WebElement doc1 =driver.findElement(By.xpath("(//img[@class='document'])[1]"));
        WebElement doc2 =driver .findElement(By.xpath("(//img[@class='document'])[2]"));
        WebElement doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
        WebElement doc4= driver.findElement(By.xpath("(//img[@class='document'])[4]"));
        WebElement Trashbin =driver.findElement(By.xpath("//div[@class='trash']"));
        
        Thread.sleep(3000);
        new Actions(driver).dragAndDrop(doc1,Trashbin).perform();
        new Actions(driver).dragAndDrop(doc2, Trashbin).perform();
        
        new Actions(driver).clickAndHold(doc3).moveToElement(Trashbin).release().perform();
        new Actions(driver).clickAndHold(doc4).moveToElement(Trashbin).release().perform();
        
        
        
       
        
        
    
        
	}
	}
		
	
