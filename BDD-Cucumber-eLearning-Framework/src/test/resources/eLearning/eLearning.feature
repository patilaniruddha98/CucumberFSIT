Feature: Validate Registration
  This Feature includes scenario that would register the new user and validate by sending the Email
 
 Scenario: Validate Email
    Given able to navigate on website
    When click on sign in link
    And I  enter First Name as "Aniruddha" 
    And I  enter Last Name as "Patil"
    And I  enter email as "patilaniruddha98@gmail.com"
    And I enter username as "aniruddha456789"
		And I  enter password as "ani123"
		And I  enter confirm password as "ani123"
		And I  click on register button
		And I should see the the confirmation message
		And I click on the image on top right corner
		And I click on the homepage link
		And I click on the Compose link
		And I select naveen naveen (naveen) for send to 
		And I enter the subject as " Hi For Testing"
		And I enter the message 
    And I click on the send 
   Then I should navigate to next page and able to see acknowledgement
	




