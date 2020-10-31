import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.io.*;

/**
 * Used for reading and parsing the JSON file. tracks the information
 * and adds food truck applicants as keys and locations as values in
 * tree map
 */
public class FoodTruckAPI {
    private String currTime = null;
    public Map<String, FoodTruck> returnFoodTruck(String time, int day) {
        int currDay = -1;
        //tree map to keep name of restaurants in order
        Map<String, FoodTruck> foodTruck = new TreeMap<>();
        if (day != currDay || !currTime.equals(time)) {
            foodTruck = new TreeMap<>();
        }
        try {
            StringBuilder line = new StringBuilder();
            String urlStr = "https://data.sfgov.org/resource/jjew-r69b.json";
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader read = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String newLine;
            // add response to the string bulder
            while ((newLine = read.readLine()) != null) {
                line.append(newLine);
            }
            read.close();
            conn.disconnect();
            Gson jsonObj = new Gson();
            JsonArray foodArr =  new JsonParser().parse(line.toString()).getAsJsonArray();
            FoodTruck foodTruck1;
            String key;
            for(JsonElement j : foodArr) {
                try{
                    foodTruck1 = jsonObj.fromJson(j, FoodTruck.class);
                    key = foodTruck1.getApplicant();
                    foodTruck.put(key, foodTruck1);
                } catch(Exception e) {
                    System.out.println("ERROR:: " + e.getMessage());
                }
            }

        } catch(Exception e) {
            System.out.println("ERROR:: " + e.getMessage());
        }
        return foodTruck;
    }
    //Converts day and time using calendar class
    public static int getCurrDay(Calendar c) {
        return ConvertCalendar.convertDay(c.get(Calendar.DAY_OF_WEEK));
    }
    public static String getCurrTime(Calendar c) {
        return ConvertCalendar.convertHour(c.get(Calendar.HOUR_OF_DAY));
    }

}
