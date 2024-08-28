package Testcases;

import org.testng.annotations.Test;

import Testbase.BaseClass;
import pageobject.Aboutpopup;
import pageobject.HomePage;

public class AboutSection extends BaseClass {

	
	@Test(groups= {"Master"})
	public void aboutpopup() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.enterName("Admin");
		hp.enterPassword("admin123");
		hp.clickOnLogin();
		
		Aboutpopup ap = new Aboutpopup(driver);
		ap.clickonprofile();
		ap.clickAonAbout();
        ap.companyName();	
	}
}
