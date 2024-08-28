package Testcases;

import org.testng.annotations.Test;

import Testbase.BaseClass;
import pageobject.HomePage;

public class Login_Page extends BaseClass {

	
		@Test(groups="Sanity")
		public void verify_account_registration() throws InterruptedException
		{
			logger.info("***TC_001_AccountRegistrationTest***");
			
			HomePage hp=new HomePage(driver);
			try {
			logger.info("logging in to wensite");
			hp.enterName("Admin");
			hp.enterPassword("admin123");
			hp.clickOnLogin();
			}
			catch(Exception e)
			{
				logger.error("test failed"); 
				logger.debug("debug logs");
			}
			
			logger.info("finish");
		}
		
		
	

}
