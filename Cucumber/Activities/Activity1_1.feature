@activity1_1
Feature: First Test

@SmokeTest
Scenario: Opening a WebPage with Selenium
   Given User is on the Google Home page
   When User types in Cheese and hits ENTER
   Then Show how many search results are available
   And Close the browser