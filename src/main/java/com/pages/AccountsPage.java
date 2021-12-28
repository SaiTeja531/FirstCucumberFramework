package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private WebDriver driver;
	
	private By accountsSection = By.cssSelector("div.row.addresses-lists span");
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public int getAccountsSectionCount() {
		return driver.findElements(accountsSection).size();
	}
	
	public List<String> getAccountsSectionsList() {
		List<WebElement> accounts=driver.findElements(accountsSection);
		List<String> mama = new ArrayList<>();
		for(WebElement e:accounts) {
			System.out.println(e.getText());
			mama.add(e.getText());
		}
		return mama;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

}
