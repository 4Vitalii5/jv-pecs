package core.mate.academy.model;

public class Excavator extends Machine {
    private int dippingDepth;

    public Excavator(String name, String color, int dippingDepth) {
        super(name, color);
        this.dippingDepth = dippingDepth;
    }

    public Excavator() {
    }

    public void setDippingDepth(int dippingDepth) {
        this.dippingDepth = dippingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
