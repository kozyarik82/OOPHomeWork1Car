package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new LinkedList<>();

    private void addTransportToQueue(Transport transport) {
        transports.offer(transport);
    }

    public void addCar(Car car) {
        addTransportToQueue(car);
    }

    public void addTruck(Truck truck) {
        addTransportToQueue(truck);
    }

    public void doInspectionOfTransport() {
        Transport transport = transports.poll();
        if (transport != null) {
            System.out.println("Проводится технический осмотр Транспортного средства " + transport);
            doInspectionOfTransport();
        }
    }

//    public void service() {
//        if (!transports.isEmpty()) {
//            Transport transport = transports.poll();
//            boolean result = transport.service();
//            if (!result) {
//                transport.repair();
//            }
//        }
//    }
}
