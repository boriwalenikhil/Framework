@tag
Feature: Test Facebook smoke scenario

  @WithScenarioOutline
  Scenario Outline: Test login with valid credentials
    When Open "<firefox>" and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should login successfully
    Then application should be closed

    Examples: 
      | username             | password  |
      | n.boriwale@gmail.com | Apple@452 |
    # | n.boriwale@gmail.com | Nikhil111 |
    #  | n.boriwal@gmail.com  | Apple@452 |
   #  |                      |           |

     
    @Withscenarioonly @nikhil
   Scenario: Test login with valid credentials
    When Open "firefox" and start application
    When I enter valid "n.boriwale@gmail.com" and valid "Apple@452"
    Then user should login successfully
   Then application should be closed