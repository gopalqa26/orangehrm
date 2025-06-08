package orangehrm_leave.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.abstractcomponent.AbstractComponent;

public class CancelLeavePage extends AbstractComponent {
	
	WebDriver driver;

	public CancelLeavePage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='My Leave']")
	 WebElement myLeaveTab;
	
	
	@FindBy(xpath = "//span[normalize-space()='Leave']")
	 WebElement leaveModule;
	
	public void openMyLeaveTab() throws InterruptedException {
		leaveModule.click();
		Thread.sleep(5000);
		myLeaveTab.click();
		Thread.sleep(5000);
	}
	
	
	
}
