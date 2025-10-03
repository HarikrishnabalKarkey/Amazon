Feature: Validating Amazon Build
Scenario: TC01_Validating the build with valid credentials 
Given User loads the browser and launch the Url
When user enters the valid username 
And clicks the login button
Then verifies whether the home page is displayed or not 
