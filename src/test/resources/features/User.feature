Feature: New Supporter Account Creation.


  Scenario: Successful account creation
    Given I am on the "New Supporter Account" page
    And I set my date of birth to "08/08/1984"
    And I enter "njao" as my first name
    And I enter "njaosson" as my last name
    And I enter "njaao@hotmail.com" as my email address
    And I confirm my email address with "njaao@hotmail.com"
    And I enter "hellojapan123" as my password
    And I confirm my password with "hellojapan123"
    And I agree to the terms and conditions
    And I verify that i am 18
    And I agree to the code of ethics and conduct
    When I click the "join" button
    Then My account is created and verified with "THANK YOU FOR CREATING AN ACCOUNT WITH BASKETBALL ENGLAND"

  Scenario: Account creation without last name
    Given I am on the "New Supporter Account" page
    And I set my date of birth to "08/08/1984"
    And I enter "njao" as my first name
    #And I enter "njaosson" as my last name
    And I enter "njaao@hotmail.com" as my email address
    And I confirm my email address with "njaao@hotmail.com"
    And I enter "hellojapan123" as my password
    And I confirm my password with "hellojapan123"
    And I agree to the terms and conditions
    And I verify that i am 18
    And I agree to the code of ethics and conduct
    When I click the "join" button
    Then My account creation should fail with the error message: "Last Name is required"

  Scenario: Account creation without confirm password
    Given I am on the "New Supporter Account" page
    And I set my date of birth to "08/08/1984"
    And I enter "njao" as my first name
    And I enter "njaosson" as my last name
    And I enter "njaao@hotmail.com" as my email address
    And I confirm my email address with "njaao@hotmail.com"
    And I enter "hellojapan123" as my password
    #And I confirm my password with "hellojapan123"
    And I agree to the terms and conditions
    And I verify that i am 18
    And I agree to the code of ethics and conduct
    When I click the "join" button
    Then Account creation failure because I didnt confirm my password: "Confirm Password is required"

  Scenario: Account creation without terms and conditions
    Given I am on the "New Supporter Account" page
    And I set my date of birth to "08/08/1984"
    And I enter "njao" as my first name
    And I enter "njaosson" as my last name
    And I enter "njaao@hotmail.com" as my email address
    And I confirm my email address with "njaao@hotmail.com"
    And I enter "hellojapan123" as my password
    And I confirm my password with "hellojapan123"
    #And I agree to the terms and conditions
    And I verify that i am 18
    And I agree to the code of ethics and conduct
    When I click the "join" button
    Then Account creation failure because i didnt agree to t&c: "You must confirm that you have read and accepted our Terms and Conditions"