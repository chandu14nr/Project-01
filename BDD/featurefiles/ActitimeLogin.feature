@Actitime
Feature: Actitime Login feature
Scenario Outline: Valid login
Given User should enter "http://localhost/login.do" in the browser
When He enters username as "<username>"
And he enters password as "<password>"
And click on login button
Then Home page should be displayed

Examples:
|username|password|
|admin|manager|
|Virat|Anushka|
|RCB|ESCN|
|Darshan|Shedige baa|
|admin|manager|