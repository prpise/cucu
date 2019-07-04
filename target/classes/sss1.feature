Feature: Login 

Scenario Outline: valid login application

Given User opens signin page
When User enters un as "<Username>"
When User enters pwd as "<password>"
And User clicks submit button
Then verify login success

Examples:
|Username|password|
|lalitha|password123|
