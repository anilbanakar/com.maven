package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile_dropdown extends BasePage {
	
	
	public Profile_dropdown(WebDriver driver)
	{
		super(driver);
	}

	private By clickProfile = By.xpath("//p[@class='oxd-userdropdown-name']");
	By abount = By.xpath("//a[text()='About']");
	By title = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
	By closePopup = By.xpath("//h6[text()='About']");
	
	
	public void ClickProfile()
	{
		driver.findElement(clickProfile).click();
	}
	
	public void about()
	{
		driver.findElement(abount).isDisplayed();
	}
	
}
