package test.steps;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.baseclass.BaseClass;
import test.pom.GoogleSearchPage;

public class Steps extends BaseClass{
	
	GoogleSearchPage googleSearchPage;
	
	@Given("user navigates the url")
	public void user_navigates_the_url() throws IOException {
		googleSearchPage = new GoogleSearchPage(driver);
		launchBrowser(readPropertyFile("url"));
	}
	@When("user search the word as test selenium")
	public void user_search_the_word_as_test_selenium() throws IOException {
		googleSearchPage = new GoogleSearchPage(driver);
		googleSearchPage .getSearchInput().sendKeys(readPropertyFile("searchKeyword"));
	}
	@Then("user clicks on the list of search result")
	public void user_clicks_on_the_list_of_search_result() {
		googleSearchPage = new GoogleSearchPage(driver);
		
		List <WebElement> lists = googleSearchPage.getSearchList();
		
		for (WebElement webElement : lists) {
			if(webElement.getText().equals("test selenium java")) {
				webElement.click();
				break;
			}
		}
	}
	@Then("user able see the search result page")
	public void user_able_see_the_search_result_page() {
		googleSearchPage = new GoogleSearchPage(driver);
	    if(googleSearchPage.getVerificationText().getText().equals("https://www.selenium.dev")) {
	    	System.out.println("Successfuly user can able to see the search result page");
	    }
	}
	
	@Given("user navigates the url2")
	public void user_navigates_the_url2() throws IOException {
		googleSearchPage = new GoogleSearchPage(driver);
		launchBrowser(readPropertyFile("url"));
	}
	
	@When("user clicked on the gmail link")
	public void user_clicked_on_the_gmail_link() {
		googleSearchPage.getGmailLink().click();
	}
	
	@Given("user navigates to the {string}")
	public void user_navigates_to_the(String string) throws IOException {
		googleSearchPage = new GoogleSearchPage(driver);
		launchBrowser(string);
	}
	@When("user search for the word as {string}")
	public void user_search_for_the_word_as(String string) {
		googleSearchPage = new GoogleSearchPage(driver);
		googleSearchPage.getSearchInput().sendKeys(string);
	}
}
