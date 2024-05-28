public class meals {

    char haveMeal;
    String meal;

    public meals(char haveMeal, String meal) {
        this.haveMeal = haveMeal;
        this.meal = meal;
    }

    public meals(char haveMeal) {
        this.haveMeal = haveMeal;
    }

    public meals() {
    }

    public char getHaveMeal() {
        return haveMeal;
    }

    public void setHaveMeal(char haveMeal) {
        this.haveMeal = haveMeal;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "\n              Have Meal:   " + haveMeal +
                "\n              Meal:        " + meal;
    }
}
