$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckWeather.feature");
formatter.feature({
  "line": 1,
  "name": "Accpetance testing to validate Sydneys Weather",
  "description": "On Thruady is \u003e 10 degree C",
  "id": "accpetance-testing-to-validate-sydneys-weather",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "A happy holidaymaker",
  "description": "",
  "id": "accpetance-testing-to-validate-sydneys-weather;a-happy-holidaymaker",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I like to holiday in Sydney",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I only like to holiday on Thursdays",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I look up the weather forecast",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive the weather forecast",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the temperature is warmer than 10 degrees",
  "keyword": "And "
});
formatter.match({
  "location": "CheckWeatherStep.i_like_to_holiday_in_Sydney()"
});
formatter.result({
  "duration": 614059769,
  "status": "passed"
});
formatter.match({
  "location": "CheckWeatherStep.i_only_like_to_holiday_on_Thursdays()"
});
formatter.result({
  "duration": 38990181,
  "status": "passed"
});
formatter.match({
  "location": "CheckWeatherStep.i_look_up_the_weather_forecast()"
});
formatter.result({
  "duration": 3039661143,
  "status": "passed"
});
formatter.match({
  "location": "CheckWeatherStep.i_receive_the_weather_forecast()"
});
formatter.result({
  "duration": 214843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 31
    }
  ],
  "location": "CheckWeatherStep.the_temperature_is_warmer_than_degrees(int)"
});
formatter.result({
  "duration": 4261383,
  "status": "passed"
});
formatter.uri("OrderItem.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate order items is working.",
  "description": "In order to validate that the order items is working fine\r\nwe will test the scenario.",
  "id": "acceptance-testing-to-validate-order-items-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@order-items"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Validate User is able to Order Items and checkout successfully",
  "description": "",
  "id": "acceptance-testing-to-validate-order-items-is-working.;validate-user-is-able-to-order-items-and-checkout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@order-items-positive-scenario"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "The user wants to place order",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "He selects items from the displayed list of items",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "He checks his shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "He does a check out",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "He logins with this credentials",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enters his address",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "He confirms terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "pays for the items",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "He confirms his order",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "checks if the order is places successfully",
  "keyword": "And "
});
formatter.match({
  "location": "OrderItemStep.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 21318037891,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.the_user_wants_to_place_order()"
});
formatter.result({
  "duration": 37380,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.he_selects_items_from_the_displayed_list_of_items()"
});
formatter.result({
  "duration": 4671990941,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.he_checks_his_shopping_cart()"
});
formatter.result({
  "duration": 4389864433,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.he_does_a_check_out()"
});
formatter.result({
  "duration": 2661209106,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.he_logins_with_this_credentials()"
});
formatter.result({
  "duration": 143198476,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.enters_his_address()"
});
formatter.result({
  "duration": 2554632621,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.he_confirms_terms_and_conditions()"
});
formatter.result({
  "duration": 3326673554,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.pays_for_the_items()"
});
formatter.result({
  "duration": 1392192222,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.he_confirms_his_order()"
});
formatter.result({
  "duration": 2171167436,
  "status": "passed"
});
formatter.match({
  "location": "OrderItemStep.checks_if_the_order_is_places_successfully()"
});
formatter.result({
  "duration": 783717635,
  "status": "passed"
});
});