Feature: data table
  Scenario: try something with data table
    Given I am using given statement
    When I enter some data
      | Fields                 | Values              |
      | First Name             | Tom                 |
      | Last Name              | Kenny               |
      | Email Address          | someone@someone.com |
      | Re-enter Email Address | someone@someone.com |
      | Password               | Password1           |
      | Birthdate              | 01                  |
    Then do something afterwards