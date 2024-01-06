@smartbearall
Feature: Scenarious Passing data
Background: precondition step
Given Open the Browser
@login @sanity
Scenario Outline: Home page login
#Given Open the Browser
Given Navigate to the URL "<url>"
When Enter Username "<username>"
When Enter Password "<Password>"
When Click on login button
Then Verify wheater login is successful
Examples: 
|url|username|Password|
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx|Tester|test|
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx|vijay|test1|
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx|kumar|test2|

@order @regression
Scenario Outline: After login orders the item
#Given Open the Browser
Given Navigate to the URL "<url>"
When Enter Username "<username>"
And Enter Password "<Password>"
And Click on login button
Then Verify wheater login is successful
When Click on orders menu
And Select product dropdown
And Enter Quantity "<quantity>"
And Enter the Customer name  "<customername>"
And Enter the Street      "<street>"
And Enter the city    "<city>"
And select the State  "<state>"
And select the zip "<zip>"
And Select card   
And Enter card no "<cardno>"
And Expirydate    "<expirydate>"
And click on process button
Then verify order is sucessful added.

Examples:
|url|username|Password|quantity|customername|street|city|state|zip|cardno|expirydate|
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx|Tester|test|1|saikumar|sriramatemple|marlapudi|AP|524407|1234321|08/20|

@testOrder @regression
Scenario Outline: navigate to order
#Given Open the Browser
Given Navigate to the URL "<url>"
When Enter Username "<username>"
And Enter Password "<Password>"
And Click on login button
Then Verify wheater login is successful
When Click on orders menu

Examples:
|url|username|Password|
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx|Tester|test|

@irctcregistration @sanity
Scenario Outline: irctc registration for end users
#Given Open the Browser
Given Navigate to the URL "<url>"
When click on register button 
And wait for sometime to load the page
And Enter username "<irctcusername>"
And Enter password "<irctcpassword>"
And Enter Confirmpassword "<confirmpassword>"
And wait for sometime to load the page
And Select language
And Select securityquestion
And Enter securityAnswer "<securityAnswer>"
And Click on continue

Examples:
|url|irctcusername|irctcpassword|confirmpassword|securityAnswer|
|https://www.irctc.co.in/nget/train-search|saikumarpinnu|Sai123456|Sai123456|cricket|

@irctccontactus @sanity
Scenario: More infirmation you may contact us
#Given Open the Browser
Given Navigate to the URL "<url>"
When click on contactus
And wait for sometime to load the page

Examples:
|url|
|https://www.irctc.co.in/nget/train-search|

@personaldetails @regression
Scenario Outline: personal details
Given Navigate to the URL "<url>"
When click on register button 
And wait for sometime to load the page
And Enter username "<irctcusername>"
And Enter password "<irctcpassword>"
And Enter Confirmpassword "<confirmpassword>"
And wait for sometime to load the page
And Select language
And Select securityquestion
And Enter securityAnswer "<securityAnswer>"
And Click on continue
And Enter firstname "<firstname>"
And Enter middlename "<middlename>"
And Enter lastname "<lastname>"
And Select occupation 


Examples:
|url|irctcusername|irctcpassword|confirmpassword|securityAnswer|firstname|middlename|lastname|
|https://www.irctc.co.in/nget/train-search|saikumarpinnu|Sai123456|Sai123456|cricket|sai|kumar|pinnu|


@datausingdatatableconcept
Scenario: dologin
Given Open the Browser
Given Navigate to the URL
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx|
When dologin
|Tester|test|
|sai|kumar|
|raja|test|
Then verify login is succesfull













