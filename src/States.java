
/*
* author Bogdan Hnatusiv
* 02.10.2020
* */

public class States {
    String name;

    public States(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                '}';
    }
}
