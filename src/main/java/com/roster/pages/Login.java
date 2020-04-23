package com.roster.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.roster.testbase.Base;

public class Login extends Base {
	
	public HomePage hp;
	
	@FindBy(id="txtuname")
	WebElement id;
	
	@FindBy(name="txtpwd")
	WebElement pwd;
	
	@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/span/text()")
	WebElement  title;
	
	@FindBy(name="Button1")
	WebElement btn;
	
	
	public Login()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String loginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage log()
	{
		id.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("pwd"));
		btn.click();
		return new HomePage();
		
	}

}
