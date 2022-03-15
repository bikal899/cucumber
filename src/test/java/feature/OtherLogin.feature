@OtherLoginFeature @Regression
Feature: Validate Techfios Other login functionality
Background:
Given User is on techfios login page

@OtherScenario1 @Smoke
Scenario Outline: Login with Incorrect Username(other)
When User enter username as "<username>"
When User enter password as "<password>"
When User click on signin button
Then User should not land on Dashboard page
Examples:
|username|password|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc1234|
|demo2@techfios.com|abc1234|
