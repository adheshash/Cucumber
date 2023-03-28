@Login
Feature: This is the Login Feature of Amazom E-commerce WebSite
Scenario Outline: This is login Scanerio
When user enters "<username>" and "<password>" 
And Click the login button
Then check whether user able to see the home page
Examples:
|username | password|

|9677146326 | adhesh@123|
|9677146326 | adhesh@12|
|9677146326 | adhesh@1234|