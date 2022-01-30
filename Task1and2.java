package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1and2 {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
				ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("rajkamal");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("selenium");
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		driver.findElement(By.partialLinkText("Email")).click();
		driver.findElement(By.id("ext-gen160")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("ext-gen212")).click();
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		
		
	}
}
