Feature: createNewAccount

  Scenario: Create new account with valid date
    Given I am on the main page
    When I click on the Sing in Button
    And  I click on the create new account button
    And  click Mr. social title button
    And  enter 'Andrii' into first name field
    And  enter 'Bilonozhko' into second name field
    And  enter 'asdasd@gmail.com' into email field
    And  enter '1231qaedae' into password field
    And  enter '12/12/1995' into birthday date field
    And  click on the Customer Privacy Button
    And  click on the click Agree Button
    And  click on the click Save Button
    Then I see main page with login in the right top of the page

