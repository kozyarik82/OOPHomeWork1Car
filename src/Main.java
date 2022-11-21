import transport.*;

import java.util.*;

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
        Set<Driver> drivers = Set.of(rogov, romov, somov, rapaport, stepanov, hvostik);
        Set<Mechanic> mechanics = Set.of(sokolov, steklov, pupkin);
        Set<Sponsor> sponsors = Set.of(ivanov, kolob);
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

        Product banana = new Product("банан", 150f, 2.1f);
        Product lemon = new Product("лимон", 58.5f, 0.5f);
        Product bread = new Product("хлеб", 45f, 0.7f);
        Product milk = new Product("молоко", 55f, 0.5f);
        Product.addProduct(new Product( "хлеб",2f,2f));
        Product.addProduct(new Product("яйца",2f,0.2f));
        Product.addProduct(new Product("рыба", 125f, 2.1f));

        Product.addProduct(banana);
        Product.addProduct(lemon);
        Product.deleteProduct(lemon);
        Product.markAsBought(banana);
        System.out.println(Product.getProducts());
        System.out.println(banana.getPrice());
        Recipe salat = new Recipe("салат", Product.getProducts(),2,0);
        Recipe borsch = new Recipe("борщь", Product.getProducts(),3,0);
        HashMap<Recipe,Integer> recipes = new HashMap<>();
        recipes.put(salat,2);
        recipes.put(borsch,3);
        System.out.println(borsch.calculatePrice());
        System.out.println(salat.calculatePrice());

        Passport pupkov = new Passport(Collections.singleton(123456789), "Пупков", "Пупок", "29,09,99", null);
        Passport jupkov = new Passport(Collections.singleton(987456321), "Жупков", "Жупок", "19,09,97", null);
        Passport lubkov = new Passport(Collections.singleton(852147963), "Лубков", "Клубок", "01,02,20", null);
        Set<Passport> passportSet = new HashSet<>();
        passportSet.add(pupkov);
        passportSet.add(jupkov);
        passportSet.add(lubkov);
        System.out.println("passportSet = " + passportSet);
        System.out.println("findPassport(passportSet,123456789) = " + findPassport(passportSet, 123456789));

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.print(multiplicationTable);
        System.out.println();
        Exercise3 exercise = new Exercise3();
        exercise.addMap("str", 1);
        exercise.addMap("str1", 2);
        exercise.addMap("str1",3);
        System.out.println(exercise);

        MapCollection mapCollection = new MapCollection();
        System.out.println(mapCollection.getMapTransformed());

        Map<Integer, String> task2 = new LinkedHashMap<>();
        task2.put(10, "велосипед");
        task2.put(2, "лыжи");
        task2.put(7, "ружье");
        task2.put(15, "удочка");
        task2.put(5, "палатка");
        task2.put(3, "конделябр");
        task2.put(11, "хлеб");
        task2.put(8, "спички");
        task2.put(9, "червяк");
        task2.put(1, "весло");
        System.out.println(task2);
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
    public static Passport findPassport(Set<Passport> passportSet, Integer number) {
        for (Passport passport : passportSet) {
            if (passport.isSetNumber(number)) {
                return passport;
            }
        }
        return null;
    }
}