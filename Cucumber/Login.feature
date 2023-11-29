Feature: Testing rediff myPage

Scenario: User has to test if login on rediff is successful or not

Given i open chrome browser
When i enter rediff mypage url
Then i capture the title of thepage
Then i enter usernameas admin and password as admin@123
When i click on login button
Then i should see an error message
And i click on click here link 
And i close the browser  