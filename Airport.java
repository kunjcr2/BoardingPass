import java.util.*;
import java.time.*;
public class Airport {
    
    String airport_Name;
    int day;
    int month;
    String time;
    String terminal;
    int totalTermnials;

    public Airport(String airport_Name, int day, int month, String time, String terminal, int totalTermnials) {
        this.airport_Name = airport_Name;
        this.day = day;
        this.month = month;
        this.time = time;
        this.terminal = terminal;
        this.totalTermnials = totalTermnials;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAirport_Name() {
        return airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        this.airport_Name = airport_Name;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public int getTotalTermnials() {
        return totalTermnials;
    }

    public void setTotalTermnials(int totalTermnials) {
        this.totalTermnials = totalTermnials;
    }
}
