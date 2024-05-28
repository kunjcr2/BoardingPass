public class airlineName {
    String airline_name;
    airCraft aircraft;
    seatType seatType;

    public airlineName(String airline_name, airCraft aircraft, seatType seatType) {
        this.airline_name = airline_name;
        this.aircraft = aircraft;
        this.seatType = seatType;
    }

    public String getAirline_name() {
        return airline_name;
    }

    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }

    public airCraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(airCraft aircraft) {
        this.aircraft = aircraft;
    }

    public seatType getSeatType() {
        return seatType;
    }

    public void setSeatType(seatType seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return  "\n            Airline info:    " + airline_name +
                "\n            Aircraft Type:   " + aircraft +
                "\n            Seat Type:       " + seatType;
    }
}
