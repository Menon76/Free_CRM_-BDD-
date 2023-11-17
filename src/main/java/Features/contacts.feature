Feature: FreeCRM create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given Login Page
When title is Free CRM
Then user enters username and password
Then login button
Then home page
Then user moves to new contact page
Then user enters contact details firstname and lastname and position
Then Close the browser
