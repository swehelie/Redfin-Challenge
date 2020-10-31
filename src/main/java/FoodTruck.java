/**
 * creates FoodTruck object with list of information
 * given by url
 */
public class FoodTruck {
    private String DayofWeekStr;
    private String starttime;
    private String endtime;
    private String start24;
    private String end24;
    private String applicant;
    private String locationdesc;
    private String location;

    /** SETTERS */
    public void setDayofWeekStr(String dayofweekstr) {
        this.DayofWeekStr = dayofweekstr;
    }
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    public void setStart24(String start24) {
        this.start24 = start24;
    }
    public void setEnd24(String end24) {
        this.end24 = end24;
    }
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
    public void setLocationdesc(String locationdesc) {
        this.locationdesc = locationdesc;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    /** GETTERS */
    public String getDayofWeekStr() {
        return DayofWeekStr;
    }
    public String getStarttime() {
        return starttime;
    }
    public String getEndtime() {
        return endtime;
    }
    public String getApplicant() {
        return applicant;
    }
    public String getLocationdesc() {
        return locationdesc;
    }
    public String getStart24() {
        return start24;
    }
    public String getEnd24() {
        return end24;
    }
    public String getLocation() {
        return location;
    }
    @Override
    public String toString() {
        return location;
//        return "Food Truck -- Applicant:" + applicant + ", Location:" + location + ", LocationDesc:" + locationdesc +
//                ", StartTime:" + starttime + ", EndTime:" + endtime + " DayofWeekStr:" + DayofWeekStr + " --";
    }
}
