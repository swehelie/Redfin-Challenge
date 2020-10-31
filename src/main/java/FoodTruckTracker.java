import java.util.*;

/**
 * Main class of program. Creates tree map, retrieves user's date,
 * Prints out server that the user can see to track Food Trucks based
 * on what's open at the time
 */
public class FoodTruckTracker {
    public static void main(String[] args) {
        FoodTruckTracker server = new FoodTruckTracker();
        FoodTruckAPI consumer = new FoodTruckAPI();
        //Get Time and Day
        Calendar c = Calendar.getInstance();
        int day = FoodTruckAPI.getCurrDay(c);
        String currTime = FoodTruckAPI.getCurrTime(c);
        int currStart = 0;
        Scanner scan = new Scanner(System.in);
        String line;
        //Header
        System.out.println("```````````````````````````````````````````");
        System.out.println("Discover Food Trucks");
        System.out.println("```````````````````````````````````````````");
        //Create Map
        Map<String, FoodTruck> foodTruck = consumer.returnFoodTruck(currTime, day);
        System.out.println("Current Date & Time: " + c.getTime());
        server.openFoodTruck(currStart, foodTruck);
        System.out.println("Info: 'exit' to leave the service");
        System.out.print("Insert: ");
        line = scan.nextLine();
        while(!line.equals("exit")) {
            System.out.print("FAILED: Invalid Input. Please try again -> ");
            line = scan.nextLine();
        }
        System.out.println("Thank you for using the FoodTruck Tracker. We hope you found something to eat!");
        scan.close();
    }
    public void openFoodTruck(int start, Map<String,FoodTruck> truckList) {
        System.out.println("Full List of FoodTrucks Found: ");
        String setup1 = String.format("%-3s %-90s %-8s", "", "FoodTrucks", "Location");
        System.out.println(setup1);
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" +
                ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        if(truckList.size() == 0) {
            System.out.println("There are no food trucks open at this time :(");
        }
        for(Map.Entry<String, FoodTruck> x : truckList.entrySet()){
            String setup2 = String.format("%-3s %-90s %-8s", ((start++) + 1), x.getKey(), x.getValue());
            System.out.println(setup2);
        }
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" +
                ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
    }
}
