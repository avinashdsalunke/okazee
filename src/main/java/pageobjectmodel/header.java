package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class header {
	public WebDriver driver;

	private By home = By.xpath("(//a[contains(text(),'Home')])[5]");
	
	private By allprices=By.xpath("//span[contains(text(),'All Prices')]");
	
	private By dropprice=By.xpath("//span[@title=\"All Prices\"]");
	
	private By allcategories=By.xpath("//span[@title=\"All Categories\"]");
	
	
	private By bagsandbackpack =By.xpath("//span[contains(text(),'Bags & Backpacks')]");
	
	private By subcategory=By.xpath("//span[contains(text(),'Select Subcategory')]");
	
	private By  subcat=By.xpath("//span[contains(text(),'Cosmetic Bags & Pouches')]");
	
	private By Brand =By.xpath("//span[contains(text(),'Select Brand')]");
	
	private By search =By.xpath("//button[@id=\"home\"]");
	
	private By productkey=By.xpath("(//p[contains(text(),'Products')])[2]");
	public header(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement home() {
		return driver.findElement(home);
		
	}
	public WebElement allprices() {
		return driver.findElement(allprices);
		
	}
	public WebElement dropprice() {
		return driver.findElement(dropprice);
		
	}
	public WebElement allcategories() {
		return driver.findElement(allcategories);
		
	}
	public WebElement bagsandbackpack() {
		return driver.findElement(bagsandbackpack);
		
	}
	public WebElement subcategory() {
		return driver.findElement(subcategory);
		
	}
	public WebElement subcat() {
		return driver.findElement(subcat);
		
	}

	public WebElement search() {
		return driver.findElement(search);
		
	}
	public WebElement productkey() {
		return driver.findElement(productkey);
		
	}
	


}
