Feature: To check the Login functionality is working as expected

Scenario Outline: Login to a application with the given below credentials

Background: TO check whether the user is able to login to the application succesfully

Given The user is on the login page
When The user enters the username as "<username>" and password as "<password>"
Then The user should be able to login to the application succesfully

Examples:
|username|password|
|vignesh|12345|
|yogi|12345|
|dishaan|12345|