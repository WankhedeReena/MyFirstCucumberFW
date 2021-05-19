Feature: My First feature

Scenario: Open Browser and Navigate
Given User Opened the Browser
When User navigated to the app url
Then User is able to see application landing page

Scenario: User is able to search for a product
Given User Opened the Browser and User navigated to the App url
When User search for a product
Then Search result for the product is displayed 