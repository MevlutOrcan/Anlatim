Feature: US 01 First Test
  Scenario: TC 01 to verify Amazon URL

   Given User goes to "https://www.amazon.com"
    Then User verify Amazon URL is "https://www.amazon.com"
    And User verify to title contains "Amazon.com"