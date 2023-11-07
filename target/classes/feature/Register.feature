
Feature: Welcome to democart
  Scenario: Register to democart page
    Given user is in the democart page
    Then user clicck on register
     And users selects a gender
    When users enter valid credentials
      | firstname| lastname | email |password|cofmpassword|
      |kavya| jagadeesh|kavya76@gmailcom|kavay@123|kavya@123|
      Then user click on continue
    
