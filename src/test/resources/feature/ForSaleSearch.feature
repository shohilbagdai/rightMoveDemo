Feature: For Sale functionality
  
  As a product owner
  I want property search function
  So that right move user can use that function to search for properties On Sale or Rent as per their requirements

  @test
  Scenario: Verify user can search for On Sale properties as per their requirements
    Given I am on Rightmove home page
    When I search properties "For sale" at "RM8 2HU"
    Then I should be on search filter page
    And Search filter heading should display "RM8 2HU"
    When I select filter as per following
      | Within 1 mile | 300,000 | 800,000 | 2 | 4 | Houses | Last 14 days |
    And I submit to see properties
    Then I should be on search result page
    And I should see properties displayed as per selected filter
      | Within 1 mile | 300,000 | 750,000 | 2 | 4 | Houses | Last 14 days |
    When I select "Newest Listed" from sort drop down
    Then I should see properties are displayed as per selected sort list "Newest Listed"
    When I click on first Non Features property
    Then I should see properties details page is displayed
