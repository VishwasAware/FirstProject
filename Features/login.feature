Feature: User should be able to login to the TutorialsNInja website

  @demo
  Scenario: User should able to login with only Valid credentials
    Given I visit to the TutorialsNinja Website
    When I enter the username abcg@gmail.com  and password 1234567890 as fields
    And I clicked on login
    Then user should login
#Examples:
#username      |password  |loginstatus
#xyz@gmail.com |1234      |Fail
#abcg@gmail.com|1234567890|Pass
#tytg@gmail.com|345678    |Fail
