public class airCraft {

    String planeType;
    int capacity;
    int engines;
    pilot pilot;

    public airCraft(String planeType, int capacity, int engines, pilot pilot) {
        this.planeType = planeType;
        this.capacity = capacity;
        this.engines = engines;
        this.pilot = pilot;
    }

    public pilot getPilot() {
        return pilot;
    }

    public void setPilot(pilot pilot) {
        this.pilot = pilot;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    @Override
    public String toString() {
        return "\n                      Plane Type:   " + planeType +
                "\n                      capacity:    " + capacity +
                "\n                      engines:     " + engines +
                "\n                      Pilot:       " +pilot;
    }
}
