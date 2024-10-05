@alpha
Feature: To validate Login functionality in Facebook application

  Background: 
    Given User is in facebook login page

  @sanity @beta
  Scenario Outline: 
    To validate login by using invalid username and invalid password

    When User enter invalid username "<username>" and valid password "<password>"
    And User click login button
    Then User should be in invalid credentials page

    Examples: 
      | username | password |
      | java123  |     9087 |
      | selenium |    89765 |
      | cucumber |    75436 |

  @regression
  Scenario: 
    To validate forgetten password scenario

    When User click the forgetten password button
    And User enter the mail address or phone number
      | username             | password     | mailId                   |
      | smartskill           | javaselenium | srikeerthana10@gmail.com |
      |               897655 | git          | smartskill123@gmail.com  |
      | smartskill@gmail.com | jenkins      | skill76@Gmail.com        |
    And User click the search btn
    Then User enter into invalid credentials page
