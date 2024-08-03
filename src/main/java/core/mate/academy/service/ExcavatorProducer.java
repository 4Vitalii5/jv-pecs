package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("John Deere", "WHITE", 5);
        Excavator excavator2 = new Excavator("Caterpillar", "PURPLE", 10);
        Excavator excavator3 = new Excavator("Volvo", "GREY", 8);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }
}
