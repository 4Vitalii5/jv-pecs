package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<T> bulldozer = (List<T>) new BulldozerProducer().get();
        List<T> excavator = (List<T>) new ExcavatorProducer().get();
        List<T> truck = (List<T>) new TruckProducer().get();
        if (type.equals(Bulldozer.class)) {
            return bulldozer;
        } else if (type.equals(Excavator.class)) {
            return excavator;
        } else if (type.equals(Truck.class)) {
            return truck;
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
