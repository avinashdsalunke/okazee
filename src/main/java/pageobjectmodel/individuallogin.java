package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class individuallogin {
	public WebDriver driver;

	private By myaccount = By.xpath("//a[contains(text(),'My Account')]");
	
	private By individuallogin1= By.xpath("(//a[contains(text(),'Individual Login')])[1]");

	private By emaillog=By.xpath("//input[@placeholder=\"Email\"]");
	
	private By passwordlog=By.xpath("//input[@placeholder=\"Password\"]");
	
	private By signin=By.xpath("//input[@value=\"Sign In\"]");

	public individuallogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}
	public WebElement individuallogin1() {
		return driver.findElement(individuallogin1);
	}
	public WebElement emaillog() {
		return driver.findElement(emaillog);
	}
	public WebElement passwordlog() {
		return driver.findElement(passwordlog);
	}
	public WebElement signin() {
		return driver.findElement(signin);
	}

}
