package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rajkamal");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Cold Call");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murthy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kamal");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Road and Track");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/25/1997");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("dontknow");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("12");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("INR - Indian Rupee");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Computer Software");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("12");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2001");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("qwerty");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("good task");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("602001");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("note");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9487312723");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("rajkamal");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mrajjkamal@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("mrajjkamal@testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("rajkamal");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kamal");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("poonga nagar thiruvallur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Thiruvallur");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Armed Forces Americas");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602001");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("21");
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
