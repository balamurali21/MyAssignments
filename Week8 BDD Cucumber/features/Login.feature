Feature: Login functionality for Leaftaps Application

Background: 
Given Launch the browser
And Load the url

Scenario: Login for Positive testcase
Given Enter the username as 'demosalesmanager'
And Enter password as 'crmsfa'
When Click login button
Then Homepage should be displayed

Scenario: Login invalid credntials
Given Enter the username as 'demos csr'
And Enter password as 'crmsfa'
When Click login button
But The leaftaps is not logged in

