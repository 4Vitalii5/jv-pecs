package core.mate.academy.model;

public class Truck extends Machine {
    private int curbWeight;

    public Truck(String name, String color, int curbWeight) {
        super(name, color);
        this.curbWeight = curbWeight;
    }

    public Truck() {
    }

    public void setCurbWeight(int curbWeight) {
        this.curbWeight = curbWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
