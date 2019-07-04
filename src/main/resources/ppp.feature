Feature: purchase product


Scenario: valid purchase in Testme App
Given user opens the sign in page
When user enter un as "shwesam"
And user enter pwd as "password123"
Then user clicks signin button
And user search for the product as "headphone"
And click purchase button
Then verify purchase success

