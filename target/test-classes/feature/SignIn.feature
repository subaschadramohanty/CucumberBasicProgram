Feature:  LogIn into Application
Scenario: 	Home page default login
Given User is in NetBanking landing page
When Login to application with username and password 
Then Home page is populated
And Cards are displayed

