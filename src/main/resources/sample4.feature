Feature: test login


Scenario: Login with valid
Given user opens neutors app
When user enters username as "mercury" And password as "mercury"
And user submit Login button
Then Verify Pass

