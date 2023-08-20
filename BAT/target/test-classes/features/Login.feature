Feature: login functionility
@test
Scenario Outline:lines: Verify that login is successful when username and password is correcy
Given user launch site URL
When enter correct "<usrname>"and "<password>"
And click on login button
Then validate is succesful
 
 Examples:
 |username|password|
 |user1|auto|
 |user|auto|
 |user|auto|