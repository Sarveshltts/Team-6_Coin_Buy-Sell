### Coin Buy and Sell (SikkAass) Application (SpringBoot Web and Microservices Services)
[![Code Quality Scores](https://www.code-inspector.com/project/18990/score/svg)](https://frontend.code-inspector.com/public/project/18990/GPAConverter-Group6/dashboard)
[![Code Grade](https://www.code-inspector.com/project/18990/status/svg)](https://frontend.code-inspector.com/public/project/18990/GPAConverter-Group6/dashboard)
![Inspect](https://github.com/mohnishkheraa/GPAConverter-Group6/workflows/Inspect/badge.svg)
---------
E-Commerce application developed for performing Admin and Customer user role operations with respective user interfaces. Application is implemented in two parts:
1. RESTfull web services: API's build using spring boot are used for handling all the back end operations which includes session management. 
2. Front End: User interfaces designed and developed using basic fromt end utilising web services for handling appropriate user actions  

# Contributors List

Name                           |   PS No.  |    Features    | Issuess Raised |      Issues Resolved         
-------------------------------|-----------|----------------|----------------|------------------------------
`1) Mohnish khera`             | 99003692  |     | on bugging     | bugging issue is resolved    
`2) Saujanya Tailang`          | 99003688  |  | on operation   | operation issue is resolved  
`3) Ishan Rawat`         | 99003691  |       | error          | errors are resolved          
`4) Sarvesh Anand`             | 99003687  |      | error          | errors are resolved          
`5) Vishal J Roshan`             | 99003689  |       | on bugging     | bugging issue is resolved  

#### Features available based on the user role
* Coin Registration
  * Adding products
  * Updating products
  * Deleting products

* Customer
  * Registering into System
  * Login into Website
  * Updating the Product
  * Placing the order

* Technologies: 
  * Spring Boot
  * Hibernate with JPA 
  * MySQL
  * Session management
  * Microservices using Edureka Server

#### Web services project can be found in (https://github.com/99003688/Team-6_Coin_Buy-Sell)

#### Application screenshots
* Login
  * ![Image of screenshot](https://user-images.githubusercontent.com/78859930/112817447-12d44380-90a0-11eb-82e3-353360b794ec.png)
 * Register 
     ![Screenshot (12)](https://user-images.githubusercontent.com/78859930/112817559-34cdc600-90a0-11eb-9746-3c7b6b2e7d78.png))

*Home page
    ![Image of screenshot](https://user-images.githubusercontent.com/78859930/112817656-4ca54a00-90a0-11eb-8fbc-2b19ccc8fbc3.png)

#### Sell
    
  * Home 
     * ![Screenshot (13)](https://user-images.githubusercontent.com/78859930/112817872-8bd39b00-90a0-11eb-9215-efdee0c9936b.png)
    * After clicking on sell:- Coin registration
      ![Screenshot (14)](https://user-images.githubusercontent.com/78859930/112818077-c4737480-90a0-11eb-9777-17808468f1cf.png)  
    * After Coin Registration
       ![Screenshot (16)](https://user-images.githubusercontent.com/78859930/112818390-1a481c80-90a1-11eb-9d89-555ca832e3d2.png)

#### Buy
   
   * Home
        ![Screenshot (13)](https://user-images.githubusercontent.com/78859930/112817872-8bd39b00-90a0-11eb-9215-efdee0c9936b.png)
    * Buy Page 
        ![Screenshot (17)](https://user-images.githubusercontent.com/78859930/112818721-73b04b80-90a1-11eb-96b5-89437ed760b2.png)
    * Adding buyers Details
       ![Screenshot (19)](https://user-images.githubusercontent.com/78859930/112818985-bbcf6e00-90a1-11eb-8322-643fc171cd49.png)
    * Sucesss Page 
       ![Screenshot (21)](https://user-images.githubusercontent.com/78859930/112946105-c433b180-9152-11eb-8aa6-411c31a5444d.png)


---------
# Test Plan For Coin Buy/Sell System

#### Registration and Login Test Cases:

 #### Positive Test Cases


|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|A user clicks on Sign Up Button|Registration from opens|Successful|
|2|Enters registration details in correct format|Registration is successful and the data is stored in the database.|Successful|
|3|Receives a verification email|User needs to sign in to the specified email id and confirm his/her identity|Successful|
|4|After Successful registration, user clicks on login button |Login form opens|Successful|
|4|Enters registration details in correct format|User is successfully logged in and Home Page opens.|Successful|

#### Negative Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|A user tries to register with invalid credentials i.e. quantity of characters allowed, password requirements, Email format |Application should not move to the next page and exception occurs|Successful|
|2|User tries to sign up with invalid email id|Could not sign up because email verification is necessary in order to get access|Successful|
|3|Enters invalid credentials in the login page |Shows exception and asks user to sign up first.|Successful|

### Coin Registration form:


|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User clicks on “Sell” option|Coin Registration form opens|Successful|
|2|User enters details of the coin he/she wants to sell and submits the form|Values are stored in the database with user’s email id as one of the attribute|<p>Successful</p><p></p><p></p><p></p><p></p><p></p><p></p><p></p>|
|3|User can Logout after successful registration|Successfully logged out and back to homepage|<p>Successful</p><p></p>|





### Checkout flow Test Cases:

 #### Positive Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User clicks on “Buy” option|All the available coins stored in the database are displayed to the user|Successful|
|2|User clicks on Buy option in front of any specific coin data|Redirected to the checkout page where email id of the user is already fetched|Successful|
|3|User enters the details in correct format and submits the form|Redirected to the Success Page and buyer data is stored in the database|Successful|



#### Negative Test Cases

|SL.NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User enters invalid credentials in the buyer registration page|Shows exception and asks user to enter the details again|Successful|


---------

### Development server

This project was generated with [Springboot in SpringSuit tool].

Import the project in spring tool suit and in test file run the  /CoinBuySell/src/test/java/net/codejava/SpringBootRegistrationLoginApplicationTests.java run in Junit

Run . Navigate to `http://localhost:8080/`. The app will automatically reload if you change any of the source files.

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.
