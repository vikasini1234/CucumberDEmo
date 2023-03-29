Feature: LoginFeature
  This feature deal with login functionality

  Scenario: Login with correct username and password
    Given i navigate to login page
    And Pass credentials username as "admin" and password as "adminpassword"
    And i enter following details
      | UserName | Password      |
      | admin    | adminpassword |
    And Click on Login
    Then It should navigate to Userform page

 Scenario Outline:  Login with correct username and passwordEx
   Given i navigate to login page
   And i enter <username> and <Password>
   And Click on Login
   Then It should navigate to Userform page
   Examples:
     | userName | Password      |
     | admin    | adminpassword |
     | admin2   | adminpasswod  |


