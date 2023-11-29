
Feature: Email page test

  Scenario: New file for docString demo
    When I reset my password on the email
    Then I should receive an email with the following content
      """
      Hello Malay,
       Please click on this to reset the password
       
       Thanks,
       Admin Team
       
      """