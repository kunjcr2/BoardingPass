public class entertainment {

    String hasTV;
    String hasLight;
    String freeDrink;

    public entertainment(String hasTV, String hasLight, String freeDrink) {
        this.hasTV = hasTV;
        this.hasLight = hasLight;
        this.freeDrink = freeDrink;
    }

    public String getFreeDrink() {
        return freeDrink;
    }

    public void setFreeDrink(String freeDrink) {
        this.freeDrink = freeDrink;
    }

    public String getHasTV() {
        return hasTV;
    }

    public void setHasTV(String hasTV) {
        this.hasTV = hasTV;
    }

    public String getHasLight() {
        return hasLight;
    }

    public void setHasLight(String hasLight) {
        this.hasLight = hasLight;
    }

    @Override
    public String toString() {
        return "\n                          TV:          " + hasTV +
                "\n                          Light:       " + hasLight+
                "\n                          Free Drink:  " +freeDrink;
    }
}
