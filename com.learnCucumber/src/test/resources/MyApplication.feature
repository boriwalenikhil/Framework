@tag
Feature: Test Facebook smoke scenario

  @WithScenarioOutline
  Scenario Outline: Test login with valid credentials
    When Open Firefox and start application
    And I enter valid "<username>" and valid "<password>"
    Then user should login successfully
    And application should be closed

    Examples: 
   
    
      | username             | password  |
      | n.boriwale@gmail.com | Apple@452 |
      |kadtand@yahoo.com		 | apple@452 |

 
