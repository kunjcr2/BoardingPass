public class hault extends Airport{
    
    int hours;

    public hault(String airport_Name, int day, int month, String time, String terminal, int totalTermnials, int hours) {
        super(airport_Name, day, month, time, terminal, totalTermnials);
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "\n - Hault - " +
                "\nAirport Name:    " + airport_Name +
"\nDate:            " + day + "/" + month+
"\nTime:            " + time +
"\nTerminal:        " + terminal +
"\nTotal Termnials: " + totalTermnials;
    }
}
