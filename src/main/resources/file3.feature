Feature: signup

Scenario Outline: test signup function with different set of input

Given user open signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters dod as "<dob>"
And user enters pwd as "<password">
And user enters confirm pwd as "<confirmpassword>"
Then click signup button
And verify signup success message

Examples:
|firstname|lastname|dob|password|confirmpassword|
|priya|selvam|02/09/97|abc@123|abc@123|
|padma|prasi|12/05/92|abc@123|abc@123|
