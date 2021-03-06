# Redfin-Challenge
## How to run program
Thank you for taking the time to look at my program.
1. Clone or download folder from github.
```
git clone Redfin-Challenge
```
2. If Java and Apache Maven aren't already installed, then install using these links:
http://maven.apache.org/download.cgi
https://www.java.com/en/download/
3. Compile and run using terminal:
```
javac FoodTruckTracker.java
java FoodTruckTracker
```
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

## Aspects I would have changed:
I would change the way the restaurants are listed. I would try to implement pages, so that the user isn't overwhelmed with the number of food trucks that are open. 
