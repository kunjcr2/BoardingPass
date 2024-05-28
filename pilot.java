public class pilot {

    String pilot_Name;
    int yearsOfExp;

    public pilot(String pilot_Name, int yearsOfExp) {
        this.pilot_Name = pilot_Name;
        this.yearsOfExp = yearsOfExp;
    }

    public String getPilot_Name() {
        return pilot_Name;
    }

    public void setPilot_Name(String pilot_Name) {
        this.pilot_Name = pilot_Name;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString() {
        return "\n                          Pilot Name:      " + pilot_Name +
                "\n                          Years Of Exp:    " + yearsOfExp;
    }
}
