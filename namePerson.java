public class namePerson {

    String name;
    int age;
    String gate;

    public namePerson(String name, int age, String gate) {
        this.name = name;
        this.age = age;
        this.gate = gate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return  "\n              Name:    " + name +
                "\n              Age:     " + age +
                "\n              Gate:    " + gate;
    }
}
