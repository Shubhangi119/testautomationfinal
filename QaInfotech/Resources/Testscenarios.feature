@AutomationQa
Feature: Open Qainfotech official website and explore

Scenario: Search bar is visible on the homepage qainfotech website 
Given the user is on homepage of the qainfotech website
Then he/she is able to see a search bar on top right corner of the page

Scenario: When the user is in home page he/she is able to view images displaying in loop in top section
Given the user is on homepage of the qainfotech website 
Then he/she is able to view images moving in loop  in image panel of the top section of the page

Scenario: There is a pause button in the image panel and the image moving in loop are paused by it
Given he/she is able to view a pause button on the image panel
When the user clicks on the pause button 
Then the image stops there and next image in loop do not come up

Scenario: There is a play button in the image panel and the image moving in loop are played by it
Given he/she is able to view a play button on the image panel
When the user clicks on the play button 
Then the images starts moving again in loop 

Scenario: The user is able to see a blue notepad icon on the home page of the website
Given the user is on homepage of the qainfotech website 
Then he/she is able to see a blue notepad icon in bottom right corner of the homepage

Scenario: The user is able to see a sales enquiry contacts number in the home page header
Given the user is on homepage of the qainfotech website 
Then the user is able to see "Sales Enquiry:" text and contact numbers along with it

Scenario: Verify user clicks on "Careers" link available on topright corner of website homepage then he navigates to another page about career information 
Given the user is on homepage of the qainfotech website
When he/she clicks the "Careers" link on topright corner
Then he/she is navigated to another page dedicated for giving information about careers

Scenario: The user clicks on "VERTICALS" link appearing in the topbar , he/she moves to verticals section in the website
Given the user is on homepage of the qainfotech website
When he/she clicks the "VERTICALS" link on topbar containing qainfotech logo on leftmost side 
Then he/she  automatically scrolled down to a portion in the page with Heading "Verticals" portion

Scenario: The user clicks on "ABOUT" link appearing in the topbar , he/she moves to about section in the website
Given the user is on homepage of the qainfotech website
When he/she clicks the "ABOUT" link on topbar containing qainfotech logo on leftmost side 
Then he/she  automatically scrolled down to a portion in the page with Heading "About Us"
 
Scenario: The user clicks on "SERVICES" link appearing in the topbar , he/she moves to services section in the website
Given the user is on homepage of the qainfotech website
When he/she clicks the "SERVICES" link on topbar containing qainfotech logo on leftmost side 
Then he/she  automatically scrolled down to a portion in the page with Heading "Our Services" 



Scenario: The user clicks on "CONTACT" link appearing in the topbar , he/she moves to contact section in the website
Given the user is on homepage of the qainfotech website
When he/she clicks the "CONTACT" link on topbar containing qainfotech logo on leftmost side
Then he/she  automatically scrolled down to a portion in the page with Heading "Contact Us" portion



Scenario: The user clicks on "NEWS" link appearing in the topbar , he/she moves to about section in the website
Given the user is on homepage of the qainfotech website 
When he/she clicks the "NEWS" link on topbar containing qainfotech logo on leftmost side 
Then he/she  automatically scrolled down to a portion in the page with Heading news portion

Scenario: The user clicks on "TEAM" link appearing in the topbar , he/she moves to about section in the website
Given the user is on homepage of the qainfotech website
When he/she clicks the "TEAM" link on topbar containing qainfotech logo on leftmost side 
Then he/she  automatically scrolled down to a portion in the page with Heading "Meet Our Team"
 
 
Scenario: The user clicks on "KNOWLEDGE CENTER" link appearing in the topbar , he/she moves to knowledge section in the website
Given the user is on homepage of the qainfotech website
When he/she clicks the "KNOWLEDGE CENTER" link on topbar containing qainfotech logo on leftmost side 
Then he/she  automatically scrolled down to a portion in the page with Heading "Downloads"
 
Scenario: The user is able to see seven tabs in the homepage
Given the user is on homepage of the qainfotech website
Then seven menu bar tabs should be there on right side of header

Scenario: The user clicks on "CONTACT" link appearing in the topbar , he/she views a enquiry form
Given the user is on homepage of the qainfotech website
When he/she clicks the "CONTACT" link on topbar containing qainfotech logo on leftmost side
Then he/she is able to see a enquiry form 

Scenario: The user clicks on "KNOWLEDGE CENTER" link appearing in the topbar , he/she is able to view a slider image section
Given the user is on homepage of the qainfotech website
When he/she clicks the "KNOWLEDGE CENTER" link on topbar containing qainfotech logo on leftmost side 
Then he/she is able to view a knowledge downloads section
 

Scenario: The user types any avaialable query in the search bar of the website , the websites gives responses
Given he/she is able to see a search bar on top right corner of the page
When he/she types a available query in that search bar and clicks on search button or press enter
Then he/she is able to go to another page and sees result links containg query term under title"Search Results for"


Scenario: The user types any unavaialable query in the search bar of the website , the websites gives responses
Given he/she is able to see a search bar on top right corner of the page
When he/she types a unavailable query in that search bar and clicks on search button or press enter
Then he/she is able to go to another page and sees results not found message

Scenario: The user is on careers page he/she is able to view a menu list regarding career/jobs information
Given the user is on homepage of the qainfotech website
When he/she clicks the "Careers" link on topright corner
Then he/she is able to see a menulist that is giving information about careers
