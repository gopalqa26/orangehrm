package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import orangehrm.TestComponents.BaseTest;
import orangehrm.TestComponents.Retry;
import orangehrm_leave.pageobjects.ApplyLeavePage;

public class LoginTest extends BaseTest {
	
	@Test(retryAnalyzer=Retry.class)
	public void testLoginSuccess() {
        ApplyLeavePage applyLeavePage = new ApplyLeavePage(driver);
		landingPage.loginApplication("Admin", "admin123");
		Assert.assertTrue(applyLeavePage.leaveModule.isDisplayed());	
	}
}
