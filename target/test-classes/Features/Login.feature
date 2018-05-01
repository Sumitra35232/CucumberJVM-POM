Feature: Login feature



Scenario: Verify user is signed in
Given the user is on registration page
Then I enter login credentials and click on submit button
| username | password |
| customer2@gmail.com | password1 |
