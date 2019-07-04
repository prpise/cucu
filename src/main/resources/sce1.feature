Feature: Test Register
Scenario Outline: TestMe app Registeration
Given User opens signup page
When User enters the un as <"Username">
And User enters the fn as <"Firstname">
And User enters the Ln as <"Lastname">
And User enters the pwd as <"password">
And User enters the confirmpwd as <"confirm password">
And User select the gender 
And User enters the mail as <"Email">
And User enters the mobile as <"Mobile">
And User enters dob as <"DOB">
And User enters add as <"Address">
And User enters ans as <"Answer">
Then click submit button as <"Register">
And verify signup success message

Examples:
|Username|Firstname|Lastname|password|confirm Password|Email|Mobile|DOB|Address|Answer|
|priyaselvam|padma|priya|abc@123|abc@123|priyaselvam0209@gmail.com|9344635597|09/02/1997|senthilNagar|padhu|
