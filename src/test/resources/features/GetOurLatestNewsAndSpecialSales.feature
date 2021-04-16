Feature: GetOurLatestNewsAndSpecialSales

Scenario: Check error message on field
  Given I am on the main page
  When I scroll main page to email field and enter 'asdasd' into email field
  And I click on the subscribe button
  Then I check is error message visibility