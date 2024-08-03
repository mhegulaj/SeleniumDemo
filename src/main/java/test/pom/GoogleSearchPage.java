package test.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "APjFqb123")
	private WebElement searchInput;


	public WebElement getSearchInput() {
		return searchInput;
	}
	
	@FindBy(xpath = "(//ul[@class='G43f7e'])[1]/li")
	private List<WebElement> searchList;


	public List<WebElement> getSearchList() {
		return searchList;
	}
	
	@FindBy(xpath = "(//cite[text()='https://www.selenium.dev'])[1]")
	private WebElement verificationText;


	public WebElement getVerificationText() {
		return verificationText;
	}
	
	@FindBy(linkText = "Gmail")
	private WebElement gmailLink;


	public WebElement getGmailLink() {
		return gmailLink;
	}
	
	
	
	
	
}
