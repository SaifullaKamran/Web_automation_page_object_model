package framework.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import framework.automation.drivers.PageDriver;

public class LoginPage {
	ExtentTest test;
	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		this.test=test;
	}
	@FindBys({
		@FindBy(xpath="//*[@name='username']"),
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	})
	WebElement userName;
	@FindBys({
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	})
	WebElement password;
	@FindBys({
		@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
	})
	WebElement login;
	public void login() {
		try {
			if (userName.isDisplayed()) {
				userName.sendKeys("ADMIN");
				try {
					if (password.isDisplayed()) {
						password.sendKeys("admin123");
						try {
							if (login.isDisplayed()) {
								login.click();
							}
						} catch (Exception e) {
							System.out.println("Login cannot clikable");
						}
					}
				} catch (Exception e) {
					System.out.println("Passwod was not locatable");
				}
			}
		} catch (Exception e) {
			System.out.println("Username was not locatable");
		}
	}

}
