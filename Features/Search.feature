Feature: Searching of various categories should be possible

@All
Scenario: Search for the product under book category
Given I visit the website as a guest user
When I select the books option from dropdown
And I click on search option
Then I should be abel to see books page loaded 
And I should see Books at Amazon as heading
But I should not see the products from other categories
@All
Scenario: Search for the product under baby category
Given I visit the website as a guest user1
When I select the Baby option from dropdown
And I click on search option1
Then I should be abel to see Baby page loaded 
And I should see The baby Store  at Amazon as heading
But I should not see the products from other categories