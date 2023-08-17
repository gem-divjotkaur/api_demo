# api_demo
API DEMO DEBUG APP

Tasks performed :

1) User enter the desired capabilities to recieve a session id from the server .

2) User taps on an element using TouchAction class .
 
3) User performed click and hold on an elements using longpress method.

4) User handles the auto complete drop downs for single value using keyEvents like back, Enter, Delete.

5) User handles the auto complete drop downs for multiple value using keyEvents like back, Enter, Delete.

6) User scrolls the page using UiScrollable class with all the three methods using getChildByText(), getChildByDescription(), scrollIntoView().

7) User scrolls the page horizontally using setAsHorizontalList() method.

8) User handles the toast messages by printing it on console and checking whether the output message is same as that of the toast message.

9) User performs swipes option

10) User performs drag and drop option 

*Points to be noted :

 1) Used UiSelector to located the elements.
 2) Used implicit wait for 5 seconds to let the elements to load for a certain period of time.
 3) Created a scenaio for each functionality.
 4) Created an implementation class and locators class and linked it with step definition class for better code readability and code reuasability.
 5) Used try-catch block for every method to handle exceptions.
 6) Created a background scenario for desired capabilites to launch the app always before a given scenario.
 7) Created a config file to store all the desired capabilitied inside it.
