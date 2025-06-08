package orangehrm_leave.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import orangehrm.abstractcomponent.AbstractComponent;

public class ApplyLeavePage extends AbstractComponent {
	WebDriver driver;

	public ApplyLeavePage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
	WebElement pimModuleElement;

	@FindBy(xpath = "//a[normalize-space()='Add Employee']")
	WebElement addEmployeeTab;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNameField;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNameField;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	WebElement employeeId;

	@FindBy(xpath = "//div[@class='oxd-switch-wrapper']")
	WebElement createLoginToggle;

	@FindBy(xpath = "//label[text()='Username']/following::input[1]")
	WebElement usernameField;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement passwordField;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement confirmPasswordField;

	@FindBy(xpath = "//span[normalize-space()='Leave']")
	public WebElement leaveModule;

	@FindBy(xpath = "//span[normalize-space()='Entitlements']")
	WebElement entitlementsDropdown;

	@FindBy(xpath = "//a[normalize-space()='Add Entitlements']")
	WebElement addEntitlements;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement adminNameElement;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employeeNameField;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement firstOptionEmployeeName;

	@FindBy(xpath = "//div[contains(text(),'-- Select --')]")
	WebElement leaveTypeDropdown;

	@FindBy(xpath = "(//div[@role='option'])[2]")
	WebElement firstOptionLeaveType;

	@FindBy(xpath = "//label[text()='Entitlement']/following::input[1]")
	WebElement entitlementField;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveBtn;

	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//label[text()='To Date']/following::input[1]")
	WebElement toDate;
	
	@FindBy(xpath = "//label[text()='From Date']/following::input[1]")
	WebElement fromDate;

	@FindBy(xpath = "//button[normalize-space()='Apply']")
	WebElement applyBtn;
	
	@FindBy(xpath = "//a[text()='Apply']")
	WebElement applyTab;

	
	public void applyLeave() throws InterruptedException {
		leaveModule.click();
		Thread.sleep(5000);
		applyTab.click();
		Thread.sleep(2000);
		leaveTypeDropdown.click();
		Thread.sleep(2000);
		firstOptionLeaveType.click();
		Thread.sleep(2000);
		fromDate.clear();
		fromDate.sendKeys("2025-10-06");
		Thread.sleep(2000);
		toDate.clear();
		toDate.sendKeys("2025-10-06");
		Thread.sleep(5000);
		applyBtn.click();
		Thread.sleep(5000);
	}
	
	
	

	public void addLeave() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Thread.sleep(5000);
		String adminName = adminNameElement.getText();
		leaveModule.click();
		Thread.sleep(5000);
		entitlementsDropdown.click();
		Thread.sleep(2000);
		addEntitlements.click();
		Thread.sleep(3000);
		employeeNameField.sendKeys(adminName);
		Thread.sleep(3000);
		firstOptionEmployeeName.click();
		leaveTypeDropdown.click();
		Thread.sleep(2000);
		firstOptionLeaveType.click();
		Thread.sleep(2000);
		entitlementField.sendKeys("10");
		saveBtn.click();
		Thread.sleep(5000);

		confirmBtn.click();
		Thread.sleep(3000);

	}

	public void createEmployee() throws InterruptedException {
		Thread.sleep(3000);
		pimModuleElement.click();
		Thread.sleep(3000);
		addEmployeeTab.click();
		firstNameField.sendKeys("Gopal");
		lastNameField.sendKeys("Sakhiya");
		employeeId.clear();
		createLoginToggle.click();
		Thread.sleep(2000);
		usernameField.sendKeys("gopal");
		passwordField.sendKeys("admin123");
		confirmPasswordField.sendKeys("admin123");

	}

}
