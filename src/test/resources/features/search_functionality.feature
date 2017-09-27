@Home
Feature: fourstay search

Scenario: search specific needs
	Given The user on the fourstay homepage
	When The user types the school name
	And The user enters move in date
	And The user enters move out date
	And The user select bed number
	And The user click search button
	Then The user verify the search url