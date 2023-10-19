package Testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.common;
import pageobjectmodel.createaccount;
import resource.baseclass;
import resource.constant;

@Test
public class createaccounttest extends baseclass {
	public static String email;
	SoftAssert assertions = new SoftAssert();

	@Test
	public void createacc() throws IOException {
		createaccount CA = new createaccount(driver);
		CA.myaccount().click();
		CA.individuallogin().click();
		CA.createaccount1().click();
		CA.firstname().sendKeys(constant.firstname);
		CA.lastname().sendKeys(constant.lastname);
		CA.mobileno().sendKeys(constant.mobileno);
		WebElement m=CA.countrycode();
		Actions k=new Actions(driver);
       k.moveToElement(m).build().perform();
      Select A=new Select(CA.indcode());  
        
        
        
        
        
        
        
        
        
	}
}