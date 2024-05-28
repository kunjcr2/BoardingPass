public class flight {

    airlineName airlinename;
    Airport airport;
    person person;

    public flight(airlineName airlinename, Airport airport, person person) {
        this.airlinename = airlinename;
        this.airport = airport;
        this.person = person;
    }

    public flight(airlineName airlinename, person person) {
        this.airlinename = airlinename;
        this.person = person;
    }

    public airlineName getAirlinename() {
        return airlinename;
    }

    public void setAirlinename(airlineName airlinename) {
        this.airlinename = airlinename;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public person getPerson() {
        return person;
    }

    public void setPerson(person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return " - BEST FIT - \nGO ALL THE WAY DOWN TO SEE BEST FIT FLIGHT...\n" +
                "\nAirline Details: " + airlinename +
                "\nPassanger      : " + person;
    }
}
