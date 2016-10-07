Feature: Verify login and logout functionality of OrangeHRM

Scenario: As as adminI should login with all access

Given the browser is launched and orangehrm home page is opened
When we enter the username and password
And click on the login button
Then it should display Welcome Admin msg 


Scenario: As an admin I should be able to logout
When I click on Welcome Admin
And also click on Logout
Then it should come to the home page of OrangeHRM