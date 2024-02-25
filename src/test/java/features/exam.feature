@exam
Feature: Verify Website Functionality

  @exam1
  Scenario: test 1
    Given I launch the URL "http://the-internet.herokuapp.com/"
    When I am on the HomePage
    Then I validate the title "The Internet" of the Page


  @exam2
  Scenario: test 2
    Given launch the URL "http://the-internet.herokuapp.com/"
    When I click on the "A/B Testing" link
    Then Verify the text "A/B Test Variation 1"

  @exam3
  Scenario: test 3
    Given I click the URL "http://the-internet.herokuapp.com/"
    When I click on the dropdown link
    Then I select "Option1" from the dropdown
    And I confirm that "Option 1" is selected

  @exam4
  Scenario: test 4
    Given click the URL "http://the-internet.herokuapp.com/"
    When I click on the "Frames"
    Then I verify that the following hyperlinks are presented on the Frames Page Nested Frames and  iFrame

