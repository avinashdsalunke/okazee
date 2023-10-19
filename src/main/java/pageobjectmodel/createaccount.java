package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createaccount {
	public WebDriver driver;

	private By myaccount = By.xpath("//a[contains(text(),'My Account')]");

	private By individuallogin= By.xpath("(//a[contains(text(),'Individual Login')])[1]");
	
	private By createaccount1= By.xpath("//a[contains(text(),'Create account')]");

	private By firstname=By.xpath("(//input[@name=\"first_name\"])[1]");
	
	private By lastname=By.xpath("(//input[@name=\"last_name\"])[1]");

	private By mobileno=By.xpath("(//input[@name=\"mobile_no\"])[1]");
	
	private By countrycode=By.xpath("//a[@id=\"selected_country\"]");
	
	private By indcode=By.xpath("//a[contains(text(),' IN (+91)')]");
	
	private By email=By.xpath("(//input[@name=\"email\"])[1]");
	
	private By password=By.xpath("(//input[@name=\"password\"])[1]");
	
	private By apptno=By.xpath("(//input[@name=\"appartment_no\"])[1]");
	
	private By buildingname= By.xpath("(//input[@name=\"building_name\"])[1]");
	
	private By streetname=By.xpath("(//input[@name=\"street_name\"])[1]");
	
	private By country=By.xpath("(//select[@name=\"country\"])[1]");

	private By city=By.xpath("(//select[@name=\"city\"])[1]");

private By createbutton=By.xpath("//input[@type=\"button\"]");

	public createaccount(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}
	public WebElement individuallogin() {
		return driver.findElement(individuallogin);
	}

	public WebElement createaccount1() {
		return driver.findElement(createaccount1);
	}
	public WebElement firstname() {
		return driver.findElement(firstname);
	}
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	public WebElement mobileno() {
		return driver.findElement(mobileno);
	}
	public WebElement countrycode() {
		return driver.findElement(countrycode);
	}
	public WebElement indcode() {
		return driver.findElement(indcode);
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement apptno() {
		return driver.findElement(apptno);
	}

	public WebElement buildingname() {
		return driver.findElement(buildingname);
		
	}
	public WebElement streetname() {
		return driver.findElement(streetname);
	}
	public WebElement country() {
		return driver.findElement(country);
	}
	public WebElement city() {
		return driver.findElement(city);
	}
	public WebElement createbutton() {
		return driver.findElement(createbutton);
	}

}
