@feature1
Feature: To test the Open MRS application
@sc1
Scenario: To test the valid login page of openmrs appln
Given Open chrome browser and url of the appln
When Enter valid username and valid password
And Click login button
Then login to account
@sc2
Scenario: To test the invalid login page of openmrs appln
Given Open chrome browser and url of the appln
When Enter invalid username and invalid password
And Click login button
Then error msg to be diplayed-invalid details