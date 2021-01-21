    Feature: Search Properties for Sale
         As a customer I want the ability to search for a property for sale
	     so that I can purchase the property.

	Background: User navigates to Zoopla
                Given I am on Zoopla Homepage


	Scenario Outline: Customer can search for properties for sale.
		When   I enter  "<Location>"in the search textbox
		And    I select "<MinPrice>"from Min price dropdown
		And    I select "<MaxPrice>"from Max price dropdown
		And    I select "<Property>"from Property type dropdown
		And    I select "<Bed>"from Bedrooms dropdown
		And    I click on Search button
		Then   a list of "<PropertyType>" in "<Location>" are displayed
		Then   application should be closed.

		Examples:
			    |Location| MinPrice|MaxPrice |Property | Bed |PropertyType|
				|London| £300,000|£550,000 |Houses | 3+ |Houses|
				#|Birmingham| £200,000|£500,000 |Houses | 3+| Houses |
				#|Coventry| £200,000|£300,000|Houses  | 3+|Houses|

	@ignore
	Scenario Outline: Customer can search for properties for sale.
		When   I enter a "<Location>"in the search textbox
		And    I select "<MinPrice>"from Min price dropdown
		And    I select "<MaxPrice>"from Max price dropdown
		And    I select "<Property>"from Property type dropdown
		And    I select "<Bed>"from Bedrooms dropdown
		And    I click on Search button
		Then   a list of "<PropertyType>" in "<Location>" are displayed
		Then   application should be closed.

		Examples:
			|Location| MinPrice|MaxPrice |Property | Bed |PropertyType|
			|London| £200,000|£450,000 |Houses | 3+ |Houses|
			|Birmingham| £200,000|£400,000 |Houses | 3+| Houses |
	        |Coventry| £250,000|£300,000|Houses  | 3+|Houses|


