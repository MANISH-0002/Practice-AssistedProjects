Feature: Create account on wiki page

  Scenario: User creates account on wiki page using input from cucumber data table
    Given User is on Create Account Page1
    Then User enters following details using column name
      | Username | Password  | retype    | EmailId               |
      | admin    | admin@123 | admin@123 | admin@gmail.com       |
      | Farhan   | admin@123 | admin@123 | farhanadmin@gmail.com |
      | Kiran    | admin@123 | admin@123 | kiranadmin@gmail.com  |
      | Arpita   | admin@123 | admin@123 | arpitaadmin@gmail.com |
      | pavan    | admin@123 | admin@123 | pavanadmin@gmail.com  |
      | John     | admin@123 | admin@123 | johnadmin@gmail.com   |
      | Marc     | admin@123 | admin@123 | marcadmin@gmail.com   |
    Then Account creation is successful1
