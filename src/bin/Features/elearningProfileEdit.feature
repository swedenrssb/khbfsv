Feature: Edit elearning Profile
@Regression
Scenario: edit eLearning Profile 
Given Open URL "http://elearningm1.upskills.in/"
When Click on Sign up
And Fill up all the fields and then tap on register button 
Then After successsful registeration , verify that the next button is visible
And Click on Next
And Click on name dropdwon
And Click on Profile
When Click on Edit Profile
Then Enter firstName
And Enter lastname
And Enter  phone , pass , new pss, confirm password
And Save settings
