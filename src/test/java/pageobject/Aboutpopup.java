package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Aboutpopup extends BasePage {

	public Aboutpopup(WebDriver driver) {
		super(driver);
		
	}
			
	private By clickProfile = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
	private By clickAbout = By.xpath("//a[text()='About']");
	private By comapnyname = By.xpath("//p[text()='Company Name: ']");
	 
	 
	 public void clickonprofile()
	 {
		 driver.findElement(clickProfile).click();
	 }
	 public void clickAonAbout()
	 {
		 driver.findElement(clickAbout).click();
	 }
	 public void companyName()
	 {
		 try
		 {
		 WebElement ele =driver.findElement(clickAbout);
		System.out.println(ele.getText());
		 }
		 catch(Exception e)
		 {
			 System.out.println("text not found");
		 }
	}
	 
	 
	 
		
	}

	
	

