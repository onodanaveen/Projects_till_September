Feature: E commerce application

@HomePage
Scenario: Homepage
Given user launch the application url
And user select the product from the dropdown
And user search the relevant product in searchbox

Scenario: Result page
When user select the first product in result page
And user switch to the newly opened tab
