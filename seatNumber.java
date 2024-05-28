public class seatNumber {

    String seatNumber;
    String seatAisle;
    String seattype;

    public seatNumber(String seatNumber, String seatAisle, String seattype) {
        this.seatNumber = seatNumber;
        this.seatAisle = seatAisle;
        this.seattype = seattype;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatAisle() {
        return seatAisle;
    }

    public void setSeatAisle(String seatAisle) {
        this.seatAisle = seatAisle;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    @Override
    public String toString() {
        return "\n                    Seat Number:   " + seatNumber +
                "\n                    Aisle:         " + seatAisle +
                "\n                    Seat Type:     " + seattype;
    }
}
