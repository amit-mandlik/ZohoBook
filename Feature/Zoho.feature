Feature: Zoho Sign in feature
Description: To test Zoho Sign in feature
Scenario: log in with valid Email and Password
Given to open Chrome browser
When Enter the url "https://www.zoho.com/"
And click on sign button
And enter the Email and Password
Then user should be on homepage