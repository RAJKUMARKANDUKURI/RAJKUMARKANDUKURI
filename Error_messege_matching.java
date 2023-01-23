import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_prasented_at_location {

	public static void main(String[] args) throws Exception {


		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */


		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();

		WebElement signup = driver.findElement(By.xpath("(//a[contains(@data-task,'signin')])[1]"));
		signup.click();

		//		WebElement passwordinstead=driver.findElement(By.xpath("//a[contains(.,'Use your password instead')]"));
		//		passwordinstead.click();

		Thread.sleep(2000);
		WebElement nextbtn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		nextbtn.click();
		Thread.sleep(2000);

		WebElement error =driver.findElement(By.xpath("//div[@class='col-md-24 error ext-error'][contains(.,'Enter a valid email address, phone number, or Skype name.')]"));
		String error_messege  =   error.getText();
		System.out.println(error_messege);

		if (!error_messege.isEmpty()) 
		{
			System.out.println("text is prasented at location");

			String error_text ="Enter a valid email address, phone number, or Skype name.";
			if (error_messege.equals(error_text)) {
				System.out.println("error text matched");
			}
			else {
				System.out.println("error txt not matched");
			}

		}

		else
			System.out.println("error messege not prasented at location");


	}

}


