Feature: Test Registration of new user

Background:
Given the user is on registration page

Scenario Outline: Test successful registration of a new user
Then I enter email address of new user as "<customerEmail>"
And I click on CreateAccount button
Then I fill all mandatory details  with parameters as "<title>" , "<customerFirstName>" , "<customerLastName>" , "<password>" , "<addrFirstName>" , "<addrLastName>" , "<addr1>" ,"<city>" , "<state>" ,"<zip>" , "<mobile>"
When I click on Register button and redirected to MyAccount Home Page


Examples:
| customerEmail | title | customerFirstName | customerLastName | password | addrFirstName | addrLastName | addr1 | city | state | zip | mobile |
| customer2@gmail.com | Mr | John | Smith | password1 | John | Smith | Address1 | City1 | Arizona | 12345 | 98765 |

Scenario: To test unsuccessful registration of an already registered user
When I enter  an already registered emailID
| registeredEmail |
| customer1@gmail.com |
And I click on CreateAccount button
Then I validate the error message received
