package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.page.Page.GetAppIdResponse;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testaa {
	
public static void main(String[] args) {
	
//     WebDriver driver   = new ChromeDriver();
//     driver.get("http://www.facebook.com");
//     System.out.println(driver.getTitle());
	
	
//	WebDriver ff= new FirefoxDriver();
//	ff.get("http://www.gmail.com");
//System.out.println(ff.getCurrentUrl());
//ff.close();
	
	//calling ie with webdriver
	
	WebDriver ie= new InternetExplorerDriver();
	
	ie.get("http://outlook.com");
	System.out.println(ie.getTitle());
	ie.close();
}
}
