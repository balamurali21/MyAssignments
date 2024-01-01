Feature: Create Lead functionality Leaftaps Application

Background: 
Given Open the browser
And Open the url

Scenario Outline: Create Lead for using Leaftaps
Given Enter the user name as 'demosalesmanager'
And Enter passwrd as 'crmsfa'
When Click logon button
Then Home Page should be displayed
When Click on CRMSFA button button
And Click on Leads button
And Click on CreateLead
Given Enter company name as <companyName>
And Enter First name as <FirstName>
And Enter Last name as <LastName>
And Enter mob no. as <phoneNum>
When Click on Create Lead
Then View Leads page should be displayed

Examples:
|companyName|FirstName|LastName|phoneNum|
|BNY MELON|Bala|Murali|7904|
|TCS|Siva|Ranjani|9039|





