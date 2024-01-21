package web.models;

public class Car {

    private String model;
    private int year, hp;

    public Car() {}

    public Car(String model, int year, int hp) {
        this.model = model;
        this.year = year;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                '}';
    }
}
