public class arrival extends Airport{
    public arrival(String airport_Name, int day, int month, String time, String terminal, int totalTermnials) {
        super(airport_Name, day, month, time, terminal, totalTermnials);
    }

    @Override
    public String toString() {
        return "\n - ARRIVAL - " +
                "\nAirport Name:    " + airport_Name +
            "\nDate:            " + day + "/" + month+
            "\nTime:            " + time +
            "\nTerminal:        " + terminal +
            "\nTotal Termnials: " + totalTermnials;
    }
}
