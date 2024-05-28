public class person {
    namePerson namePerson;
    meals meals;
    seatNumber seatNumber;

    public person(namePerson namePerson, meals meals, seatNumber seatNumber) {
        this.namePerson = namePerson;
        this.meals = meals;
        this.seatNumber = seatNumber;
    }

    public namePerson getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(namePerson namePerson) {
        this.namePerson = namePerson;
    }

    public meals getMeals() {
        return meals;
    }

    public void setMeals(meals meals) {
        this.meals = meals;
    }

    public seatNumber getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(seatNumber seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "\n            Name:        " + namePerson +
                "\n            Meals:       " + meals +
                "\n            Seat Number: " + seatNumber;
    }
}
