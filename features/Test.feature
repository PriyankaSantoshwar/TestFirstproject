Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	When User enters <"UserName"> and <"Password">
	Then Message displayed Login Successfully
	

	Examples:
    |UserName|Password|
	|bpriyankav@gmail.com|Priyanka@1953|
  