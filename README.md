# 🧪 OrangeHRM Leave Management - Automation Framework

This project is an automated testing framework for the **OrangeHRM Leave Management** module. It uses **Java**, **Selenium WebDriver**, **TestNG**, **Maven**, and **ExtentReports**.

---
## 🔧 Technologies Used

- Java 21
- Selenium WebDriver 4.20.0
- TestNG 7.8.0
- Maven
- WebDriverManager
- ExtentReports
- Eclipse IDE
---

## ✅ Key Features

- Login to OrangeHRM
- Apply Leave
- Cancel Leave
- Add Entitlements
- Create Employee
- Screenshot capture on failure
- HTML Reports via ExtentReports
- Page Object Model with reusable components
---

## 📁 Project Structure



qa-automation/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── orangehrm/
│ │ │ ├── abstractcomponent/
│ │ │ │ └── AbstractComponent.java
│ │ │ ├── pageobjects/
│ │ │ │ ├── ApplyLeavePage.java
│ │ │ │ ├── CancelLeavePage.java
│ │ │ │ └── LandingPage.java
│ │ └── resources/
│ │ └── GlobalData.properties
│ └── test/
│ └── java/
│ └── tests/
│ ├── ApplyLeaveTest.java
│ ├── CancelLeaveTest.java
│ └── LoginTest.java
├── testng.xml
├── pom.xml
├── reports/
│ └── ExtentReport.html
└── README.md




## ▶️ How to Run the Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/orangehrm-leave-automation.git
   cd orangehrm-leave-automation

2. **Update Configurations**
Update browser and URL in GlobalData.properties

3. **Run Tests**
Using Maven:
mvn test Or right-click on testng.xml and run as TestNG Suite from Eclipse

**📊 Test Report**
After execution, open the report:
reports/ExtentReport.html
