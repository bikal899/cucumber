@LoginFeature @Regression
Feature: Validate Techfios login functionality
Background:
Given User is on techfios login page


@Scenario1 @Smoke
Scenario: Login with valid credentials
When User enter password as "abc123"
When User enter username as "demo@techfios.com"
When User click on signin button
Then User should land on Dashboard page



@Scenario2
Scenario: Login with Incorrect Username
When User enter username as "demo2@techfios.com"
When User enter password as "abc123"
When User click on signin button
Then User should not land on Dashboard page

