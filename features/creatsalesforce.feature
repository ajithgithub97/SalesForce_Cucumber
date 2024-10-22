Feature: Creat functionality of Sales Force Application


Scenario Outline: Creat functionality with valid credential

Given Launch the browser and load the url
Then Enter the username as 'dilip@testleaf.com'
And Enter the password as 'leaf@2024'
When Click on the login butto
Then Click app launcher icon
And Click on view all
And Click on the sales option
And Click on the oppotunities dropdown
And Click on new option
Then Enter the opportunity name <opertunityname>
And Enter the amount<amount>
And Click on date option
And Select a date
And Click on stage option
Then Select option
When Click on save button
Then creat should be verifed

Examples:
|opertunityname|amount|
|'Salesforce Automation by Ajith'|'75000'|







