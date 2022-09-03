Feature: Valid user able to login application with valid credintatial and buy house


 @sanity
Scenario: Valid user able to use valid username and password to login the application
   
   Given User able to open any browsers.
   And User able to enter "https://www.zoopla.co.uk/" URL
   When User able to click  sign_in button
   And User able to enter username 
   And User able to enter password
   When User able to click login button 
   Then User able to validate the title page "Welcome back to your account" on the UI and LogOut
   