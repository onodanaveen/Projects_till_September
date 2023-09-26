Feature: Its an Ecommerce application where user search the product and place the order

Scenario: HomePage
Given user Launch The Application Url
When user search "Atlas" product in search option
And user click the preferred product

Scenario : ResultsPage
When user Select the first product

Scenario : ProductPage
Given user selects the buy now option
