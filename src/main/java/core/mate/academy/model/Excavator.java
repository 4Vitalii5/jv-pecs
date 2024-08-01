package core.mate.academy.model;

public class Excavator extends Machine {
    private int dippingDepth;

    public Excavator(int dippingDepth) {
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
