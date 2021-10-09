package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//Create Leads
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FName");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LName");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FNLocal");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LNLocal");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("PersonalTitle");
		
		driver.findElement(By.name("birthDate")).sendKeys("10/6/21");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("GeneralTitle");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DepName");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("A111");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ABC");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating a Lead");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Entering a Note");
		
		//Contact information 
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("10025");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9000000010");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2345");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("SampleName");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		
		
		//Primary Address
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ToName");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("AttnName");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("AddLine1");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("AddLine2");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600020");
		
		driver.findElement(By.name("submitButton")).click();
		
		//Get First Name
		String fnValue = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("First Name is : " +fnValue);
		
		String title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		if(title.equalsIgnoreCase("View Lead"))
		{
			System.out.println("The Title Matches");
		}
		else
			System.out.println("The Title Doesn't Matches");
		
	}

}
