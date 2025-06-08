package tests;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import orangehrm.TestComponents.BaseTest;
import orangehrm.TestComponents.Retry;
import orangehrm_leave.pageobjects.CancelLeavePage;

public class CancelLeaveTest extends BaseTest {
	@Test(retryAnalyzer=Retry.class)
	public void testLoginSuccess() throws InterruptedException {
		CancelLeavePage cancelLeavePage = new CancelLeavePage(driver);
		landingPage.loginApplication("Admin", "admin123");
		cancelLeavePage.openMyLeaveTab();
		List<WebElement> cancelButtons = driver.findElements(By.xpath("//button[normalize-space()='Cancel']"));
		for (WebElement cancelBtn : cancelButtons) {
		    cancelBtn.click(); 
		    }
	}
}
