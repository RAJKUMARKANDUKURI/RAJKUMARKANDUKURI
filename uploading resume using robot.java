import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_practice {

	public static void main(String[] args) throws Exception {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMIm-H64-Gv_AIVzp1LBR0zbQRKEAAYAiAAEgKys_D_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement uplode_button = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		uplode_button.click();
		Thread.sleep(3000);



		String path ="D:\\dummy\\fake\\krish.docx";
		StringSelection spth =new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents (spth, spth);

		// create object for roboat 
		Robot robot = new  Robot();
		robot.setAutoDelay(300);

		// pressing ctrl=v 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		//robot key release 
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);



	}

}
