public class seatType {

    String seattype;
    entertainment entertainment;
    int price;

    public seatType(String seattype, entertainment entertainment, int price) {
        this.seattype = seattype;
        this.entertainment = entertainment;
        this.price = price;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public entertainment getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(entertainment entertainment) {
        this.entertainment = entertainment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String RESET = "\u001B[0m";
        String YELLOW = "\u001B[43m";
        String BLACK = "\u001B[30m";
        return "\n                  Seat Type:        " + seattype +
                "\n                  Entertainment:   " + entertainment +
                "\n                  Price:           "+YELLOW+BLACK+"$" + price +RESET+RESET;
    }
}
