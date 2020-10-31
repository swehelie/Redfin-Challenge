# Redfin-Challenge

As this was my first-time fetching data from a URL in a short amount of time, I split up the functions into parts. Also, I found this easier to be done on my own IDE.
The Java classes that I have created are FoodTruck.java, FoodTruckAPI.java, FoodTruckTracker.java, ConvertCalendar.java.

FoodTruck.java –
This class is mainly for implementing getters and setters in order to create a FoodTruck object that holds all the information from a json statement. The getters are called in other classes like the FoodTruckAPI to be added into the treemap. 

FoodTruckAPI.java
The class that is mainly for reading and parsing the URL. A treemap was used to keep the food truck names in alphabetical order. The Google gson library for ease of reading and parsing the json objects into arrays that were to be added into the foodtruck object and map. Tracks error exceptions in case of no food trucks open or present.

FoodTruckTracker.java
The main class of the program. Creates the tree map and keeps track of the day and time of the user. Also allows the user to interact and exit the program. 

ConvertCalendar.java
Converts time to digital and day into a day order that the data prefers. 
