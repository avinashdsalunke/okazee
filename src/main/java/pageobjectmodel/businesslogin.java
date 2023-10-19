package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class businesslogin {
	public WebDriver driver;

	private By myaccount = By.xpath("//a[contains(text(),'My Account')]");
	
	private By BusinessLogin = By.xpath("(//a[contains(text(),'Business Login')])[2]");
	private By emailb2b = By.xpath("(//input[@name=\"email\"])[2]");
	private By passb2b = By.xpath("(//input[@type=\"password\"])[2]");
	private By signinb2b = By.xpath("//input[@type=\"button\"]");

	public businesslogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}
		public WebElement BusinessLogin() {
			return driver.findElement(BusinessLogin);}
		
			public WebElement emailb2b() {
				return driver.findElement(myaccount);}
			
				public WebElement passb2b() {
					return driver.findElement(passb2b);}
				
					public WebElement signinb2b() {
						return driver.findElement(signinb2b);}
					
						
	}

