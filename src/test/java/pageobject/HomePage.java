package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class HomePage extends BasePage{
		
		//CommonMehods common = new CommonMehods();
		public HomePage(WebDriver driver)
		{
			super(driver);
		}
		/*
		 * @FindBy(xpath="//input[@name='username']") WebElement userName;
		 * 
		 * @FindBy(xpath="//input[@type='password']") WebElement password;
		 * 
		 * @FindBy(xpath="//button[@type='submit']") WebElement login;
		 * 
		 * 
		 * public void username(String username) throws InterruptedException {
		 * Thread.sleep(9000); userName.sendKeys(username); }
		 * 
		 * public void password(String Password) { password.sendKeys(Password); } public
		 * void clickOnLogin() { login.click(); }
		 */	
		
		
		
	 private By username = By.name("username");
	  By password =By.name("password");
	  By clickOnLogin = By.xpath("//button[@type='submit']");
	  
	  public void enterName(String UserName) throws InterruptedException
	  {
	  driver.findElement(username).sendKeys(UserName);
	  }
	  public void enterPassword(String Password) 
	  {
		  driver.findElement(password).sendKeys(Password);
		  	  }
	  
	  public void clickOnLogin() 
	  { 
		 driver.findElement(clickOnLogin).click(); 
		}
	
	}
	  
	
	
	

	