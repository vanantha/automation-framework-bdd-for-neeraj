Feature: Accpetance testing to validate Sydneys Weather
On Thruady is > 10 degree C

Scenario: A happy holidaymaker
Given I like to holiday in Sydney
And I only like to holiday on Thursdays
When I look up the weather forecast
Then I receive the weather forecast
And the temperature is warmer than 10 degrees
