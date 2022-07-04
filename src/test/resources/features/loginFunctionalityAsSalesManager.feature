Feature: Fidexio App Login Feature as PosManager
  User Story :

  As a user, I should be able to log in so that I can land on homepage.

  Accounts are: PosManager, SalesManager

  Acceptance Criteria :
  1-Users can log in with valid credentials (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  2-"Wrong login/password" should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials

  3- "Please fill out this field" message should be displayed if the password or username is empty

  4-User land on the ‘reset password’ page after clicking on the "Reset password" link

  5-User should see the password in bullet signs by default

  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

  Background: For the scenarios in the feature file user ıs expected to be login page
    Given  user is on the login page

@FIDEX-401
  Scenario: user can login with valid credentials as SalesManager
    When user enter a valid "<username>" inside of the email Box
    And user enter a valid "<password>" inside of the password Box
    And user click on login button successfully
    Then user should see home page of fidexio Website
    Examples:
      | username                | password     |
      | salesmanager10@info.com | salesmanager |

@FIDEX-402
  Scenario: user can not log in with Valid Username-Invalid Password as SalesManager
    When user enter a valid "<username>" inside of the email Box
    And user enter a invalid "<password>" inside of the password Box
    And user click on login button successfully
    Then user should see Wrong login password Message
    Examples:
      | username                | password     |
      | salesmanager10@info.com | salesmeneger |
@FIDEX-403
  Scenario: user can not log in with Invalid Username-Valid Password as SalesManager
    When user enter a invalid "<username>" inside of the email Box
    And user enter a valid "<password>" inside of the password Box
    And user click on login button successfully
    Then user should see Wrong login password Message
    Examples:
      | username                | password     |
      | salesmaneger10@info.com | salesmanager |

@FIDEX-404
  Scenario: user see "Please fill out this field" message if Username is empty as SalesManager
    When user enter no data inside of the Email Box
    And user enter a valid "<password>" inside of the password Box
    And user click on login button successfully
    Then User should see "Please fill out this field" Message
    Examples:
      | password     |
      | salesmanager |
@FIDEX-405
  Scenario: user see "Please fill out this field" message if Password is empty
    When user enter a valid "<username>" inside of the email Box
    And user enter no data inside of the password Box
    And user click on login button successfully
    Then User should see "Please fill out this field" Message

    Examples:
      | username                |
      | salesmanager10@info.com |
@FIDEX-406
  Scenario: user see "Please fill out this field" message if the both Password and Username are empty
    When user enter no data inside of the Email Box
    And user enter no data inside of the password Box
    And user click on login button successfully
    Then User should see "Please fill out this field" Message
@FIDEX-407
  Scenario: user land on the ‘reset password’ page after clicking on the "Reset password" link.
    When user click on "Reset Password" text on the home page
    Then user should be able to landing on "Reset Password" page
@FIDEX-408
  Scenario: user see the password in Bullet signs by default
    When user enter a valid "<username>" inside of the email Box
    And user enter a valid "<password>" inside of the password Box
    Then user should see its password as a Bullet sign by Default
    Examples:
      | username                | password     |
      | salesmanager10@info.com | salesmanager |

@FIDEX-409
  Scenario: user push enter key of keyboard to achieve home page
    When user enter a valid "<username>" inside of the email Box
    And user enter a valid "<password>" inside of the password Box
    And user push enter key of the Keyboard to retrieve home page
    Then user should see home page of fidexio Website
    Examples:
      | username                | password     |
      | salesmanager10@info.com | salesmanager |

