package webdriver;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		//System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		// driver = new ChromeDriver();
		driver = new ChromeDriver();

		String baseUrl = "http://www.google.com";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl); //open
		
		//WebElement element;
		
	//driver.findElement(By.id("userId")).sendKeys("prem"); //type id=userId prem
	
	//driver.findElement(By.id("pwdId")).sendKeys("123"); // //type id=pwdId 123
	
	//driver.findElement(By.id("button")).click();
		

		// close Fire fox
		driver.close();

		// exit the program explicitly
		System.exit(0);

	}

}
