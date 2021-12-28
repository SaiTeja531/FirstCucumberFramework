Feature: Account Page Feature

Background:
	Given user has already logged into the application
	|username|password|
	|mamamia@gmail.com|Sakesh@143|
	
Scenario: Accounts page title
	Given User is on accounts page
	When User gets the title of the page
	Then page title should be "My Account - My Store"
	
Scenario: Accounts section count
	Given User is on accounts page
	Then User gets accounts section
	|ORDER HISTORY AND DETAILS|
	|MY CREDIT SLIPS|
	|MY ADDRESSES|
	|MY PERSONAL INFORMATION|
	|MY WHISHLISTS|
	And Accounts section count should be 4