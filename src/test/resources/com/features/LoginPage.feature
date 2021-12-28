Feature: Login page feature

Scenario: Login page title
 Given user is on login page
 When User gets the title of the page
 Then page title should be "Login - My Store"
 
Scenario: Forgot Password Link
 Given user is on login page
 Then  forgot password link should be displayed
 
Scenario: Login with correct credentials
 Given user is on login page
 When User enters username "dec2020secondbatch@gmail.com"
 And User enters password "Selenium@12345"
 And User clicks on login button
 Then User gets the title of the page
 And page title should be "My account - My Store"