package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class venderlogin {
	public WebDriver driver;

	private By myaccount = By.xpath("//a[contains(text(),'My Account')]");
	
	private By individuallogin1= By.xpath("(//a[contains(text(),'Individual Login')])[1]");
	
	private By vendorlog=By.xpath("//a[contains(text(),'Vendor Login')]");
	
	private By emailvendor=By.xpath("(//input[@name=\"email\"])[3]");
	
	private By passwordvendor=By.xpath("(//input[@type=\"password\"])[3]");
	
	private By signinvendor=By.xpath("//input[@type=\"button\"]");
	
	public venderlogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}
	public WebElement individuallogin1() {
		return driver.findElement(individuallogin1);
	}
	public WebElement vendorlog() {
		return driver.findElement(vendorlog);
	}
	public WebElement emailvendor() {
		return driver.findElement(emailvendor);
	}
	public WebElement passwordvendor() {
		return driver.findElement(passwordvendor);
	}
	public WebElement signinvendor() {
		return driver.findElement(signinvendor);
	}

}
