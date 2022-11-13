import transport.*;

import java.util.List;
//import transport.Train;

public class Main {
    public static void main(String[] args) {


        Bus bmw = new Bus(" BMW ",  " GTM-5 ", 2.5f, PassengerCapacity.small);
        Bus mercedes = new Bus(" Mercedes ", " RH ", 3, PassengerCapacity.medium);
        Bus scania = new Bus(" Scania ", " Touring ", 6, PassengerCapacity.large);
        Bus yutong = new Bus(" Yutong ", " ZK6122H9 ", 5.5f, PassengerCapacity.extraSmall);
        Truck man = new Truck(" MAN ", " AG ", 3.8f, LoadCapacity.N1);
        Truck volvo = new Truck(" Volvo ", " V-275 ", 4, LoadCapacity.N3);
        Truck hino = new Truck(" HINO ", " AKM ", 15, LoadCapacity.N2);
        Truck iveco = new Truck(" IVECO ", " A-22 ", 13.2f, LoadCapacity.N3);
        Car ford = new Car(" Ford ", " RS200 ", 10.2f, BodyType.sedan);
        Car toyota = new Car(" Toyota ", " Celica 1600GT ", 5, BodyType.hatchback);
        Car bugatti = new Car(" Bugatti ", " Veyron ", 16.4f, BodyType.coupe);
        Car ferrari = new Car(" Ferrari ", " FF ", 6.2f, BodyType.coupe);
        Mechanic<Car> sokolov = new Mechanic<Car>("Sokolov Stepan", "FerrariCo");
        Mechanic<Bus> steklov = new Mechanic<Bus>("Steklov Stekol Steklovich", "Stek");
        Mechanic<Truck> pupkin = new Mechanic<Truck>("Pupkin Pupok Pupkovich", "Pupok");
        Sponsor ivanov = new Sponsor("Konkoro", 1850000);
        Sponsor kolob = new Sponsor("Kolobok", 4529300);
        DriverCatB romov = new DriverCatB("Romov Roman Romanovich", "B", 7f, ford);
        DriverCatB somov = new DriverCatB("Somov Sergey Sergeevich", "B", 12f, toyota);
        DriverCatC rapaport = new DriverCatC("Рапапорт Инна Николаевна", "C", 10f,man);
        DriverCatC rogov = new DriverCatC("Rogov Petr petrovich", "C", 5f, hino);
        DriverCatD stepanov = new DriverCatD("Степанов Андрей Романович","D",15f,scania);
        DriverCatD hvostik = new DriverCatD("Хвостик Антон Михайлович", "D", 7f,bmw);
        List<Transport> transports = List.of(bmw, mercedes, scania, yutong, man, volvo, hino, iveco, ford, toyota, bugatti, ferrari);
        List<Driver> drivers = List.of(rogov, romov, somov, rapaport, stepanov, hvostik);
        List<Mechanic> mechanics = List.of(sokolov, steklov, pupkin);
        List<Sponsor> sponsors = List.of(ivanov, kolob);
        ford.addDriver(somov);
        ford.addSponsor(kolob,ivanov);
        ford.addMechanic(sokolov);
        bmw.addDriver(stepanov);
        bmw.addMechanic(steklov);
        bmw.addSponsor(kolob);
        man.addDriver(rapaport);
        man.addMechanic(pupkin);
        man.addSponsor(ivanov,kolob);
        printInfo(man);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(ford);
        serviceStation.addTruck(man);
        serviceStation.doInspectionOfTransport();
        serviceStation.doInspectionOfTransport();
        for (Transport transport : transports) {
            printInfo(transport);
        }

        boolean success = Data.validate("login", "password", "password");
        if (success) {
            System.out.println("Данные валидны");
        }else{
            System.out.println("Данные не валидны");
        }
        getDiagnosed(bmw,mercedes,scania,yutong,man,volvo,hino,iveco,ford,toyota,bugatti,ferrari);
    }

    private static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " " + transport.getDrivers() + "  " + transport.getMechanics() + "  " + transport.getSponsors());
    }

    private static void getDiagnosed(Transport... transports) {
        for (Transport transport : transports) {
            diagnosedTransport(transport);
        }
    }

    private static void diagnosedTransport(Transport transport) {
        try {
            if (!transport.getDiagnosed()) {
                throw new RuntimeException(" Транспортному средству " + transport.getBrand() + transport.getModel() + " необходимо срочно пройти диагностику ");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}