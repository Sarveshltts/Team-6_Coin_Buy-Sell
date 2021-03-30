Test Plan For Coin Buy/Sell System

Registration and Login Test Cases:

- Positive Test Cases


|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|A user clicks on Sign Up Button|Registration from opens|Successful|
|2|Enters registration details in correct format|Registration is successful and the data is stored in the database.|Successful|
|3|Receives a verification email|User needs to sign in to the specified email id and confirm his/her identity|Successful|
|4|After Successful registration, user clicks on login button |Login form opens|Successful|
|4|Enters registration details in correct format|User is successfully logged in and Home Page opens.|Successful|

- Negative Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|A user tries to register with invalid credentials i.e. quantity of characters allowed, password requirements, Email format |Application should not move to the next page and exception occurs|Successful|
|2|User tries to sign up with invalid email id|Could not sign up because email verification is necessary in order to get access|Successful|
|3|Enters invalid credentials in the login page |Shows exception and asks user to sign up first.|Successful|

Coin Registration form:


|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User clicks on “Sell” option|Coin Registration form opens|Successful|
|2|User enters details of the coin he/she wants to sell and submits the form|Values are stored in the database with user’s email id as one of the attribute|<p>Successful</p><p></p><p></p><p></p><p></p><p></p><p></p><p></p>|
|3|User can Logout after successful registration|Successfully logged out and back to homepage|<p>Successful</p><p></p>|





Checkout flow Test Cases:

- Positive Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User clicks on “Buy” option|All the available coins stored in the database are displayed to the user|Successful|
|2|User clicks on Buy option in front of any specific coin data|Redirected to the checkout page where email id of the user is already fetched|Successful|
|3|User enters the details in correct format and submits the form|Redirected to the Success Page and buyer data is stored in the database|Successful|



- Negative Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User enters invalid credentials in the buyer registration page|Shows exception and asks user to enter the details again|Successful|



