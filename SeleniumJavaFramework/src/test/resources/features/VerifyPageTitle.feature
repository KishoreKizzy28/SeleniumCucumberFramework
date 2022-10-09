Feature: Verify Page Title 

@validation
Scenario: Verify Mobile Page Title
Given User on Home Page
When Click Mobile link
Then Validate Mobile Page Title

@validation
Scenario: Verify Tv Page Title
Given User on Home Page
When Click TV link
Then Validate TV Page Title


