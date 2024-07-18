Feature:To validate signin functioanlity of amazon application
Scenario:To validate signin with valid username and invalid paassword
Given to launch the chrome browser and hit the amazon url
When to enter the valid email in username field
And To enter invalid password in password field
And To click the signin button
Then to close the browser




Scenario Outline:
To validate login with valid username and valid password
Given To launch  chrome browser and launch fb url
When To enter valid email  "<email>"  in username field
And To enter valid password "<password>" in password field
And To click the login button
Then To close chrome browser


Examples:
|email                |password|
|java123@gmail.com    |java|
|selenium123@gmail.com|selenium|
|Testng123@gmail.com  |testng|
