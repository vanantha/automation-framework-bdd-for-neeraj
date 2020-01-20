@order-items
Feature: Acceptance testing to validate order items is working.
In order to validate that the order items is working fine
we will test the scenario.

@order-items-positive-scenario
Scenario: Validate User is able to Order Items and checkout successfully
Given User is on the home page
When The user wants to place order
And He selects items from the displayed list of items
And He checks his shopping cart
And He does a check out 
And He logins with this credentials
And enters his address
And He confirms terms and conditions
And pays for the items
Then He confirms his order
And checks if the order is places successfully
