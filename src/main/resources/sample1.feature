Feature: Login Test
Description: Registered user can login into application using valid username and valid password


Scenario: Login with valid combination
Given user opens login page is newtours application
When user enter the username as "mercury" And password as "mercury"
And click submit button
Then verify login success