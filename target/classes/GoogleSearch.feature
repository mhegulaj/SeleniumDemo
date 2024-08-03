Feature: As a user i can able to see the search result of google

	Scenario: user need to test the search function
	
	Given user navigates the url
	When user search the word as test selenium
	Then user clicks on the list of search result
	Then user able see the search result page
	
	Scenario: user need to test the gmail link
	
	Given user navigates the url2
	When user clicked on the gmail link
	
	Scenario Outline: user need to test the search function2
	
	Given user navigates to the "<url>"
	When user search for the word as "<searchKeyword>"
	
	Examples:
	
	| url | searchKeyword |
	| https://www.google.com/ | test selenium python |
	| https://www.facebook.com/ | test selenium python |



