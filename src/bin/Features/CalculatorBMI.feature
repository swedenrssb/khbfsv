Feature: Calulate BMI
@Regression
Scenario: Check for Title of Page
Given Open URL for "https://www.calculator.net/calorie-calculator.html"
Then Validate the Tittle of the current page
And Close the browser
@Regression
Scenario Outline: Check for BMI
Given Open URL for "https://www.calculator.net/calorie-calculator.html"
When Click on BMI Calculator 
Then Validate the Tittle of the current page
When Enter age as "<Age>"
And Enter height as "<Height>"
And Enter weight as "<Weight>" 
And Tap on Calulate BMI
Then Capture the BMI Result value & Print it
And Close the browser
Examples:
#weight change to 15 from 10 validation is present on site
| Age | Height | Weight |
|15|180|65|
|30|156|70|
|25|152|55|
|20|160|45|
|35|160|70|