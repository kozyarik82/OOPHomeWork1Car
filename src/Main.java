import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;
//import transport.Train;

public class Main {
    public static void main(String[] args) {

//        Human maksim = new Human(1987," Максим ","Минск","бренд-менеджер");
//        Human anna = new Human(1993,"Аня","Москва",  "методист образовательных программ");
//        Human kate = new Human(1994,"Катя", "Калининград",  "продакт-менеджер");
//        Human artyom = new Human(1995,"Артем", "Москва",  "директор по развитию бизнеса");
//        Human vladimir = new Human(2001," Владимир "," Казань ", null);
//
//
//        maksim.greetings();
//        anna.greetings();
//        kate.greetings();
//        artyom.greetings();
//        vladimir.greetings();
//
//        Car lada = new Car("Lada", "Granta", "yellow", 2015, "Russia",1.7f,"automatic","sedan","М215ВК263",5,true,new Car.Key(true,true), new Car.Insurance(LocalDate.now().plusMonths(4),7000.0f,"123456789"));
//        Car audi = new Car("Audi", "A8 50L TDI quattro", "black", 2020, "Germany", 3f,"manual","sports car", "А000АА000",2,true,new Car.Key(true,false),new Car.Insurance(LocalDate.now().plusMonths(2),13000.0f,"987654321"));
//        Car bmw = new Car("BMW", "Z8", "black", 2021,"Germany",3f,"automatic","sedan","ВВ252ВА831",5,false, new Car.Key(false,true), new Car.Insurance(LocalDate.now().plusMonths(5), 3500.0f,"257614328"));
//        Car kia = new Car("Kia", "Sportage 4",  "red",2018, "South Korea", 2.4f,"manual","sedan","К525МН005",5,true,  new Car.Key(true,true), new Car.Insurance(LocalDate.now().plusMonths(1), 7000.0f,"628431579"));
//        Car hyundai = new Car("Hyundai", "Avante", "orange", 0, "South Korea", 1.6f,"automatic","hatch back","О325ВА125",3,false,  new Car.Key(true,true), new Car.Insurance(LocalDate.now().plusMonths(3), 8200.0f,"628931475"));
//        System.out.println(kia.getMaxSpeed());
//        kia.setMaxSpeed(250);
//        System.out.println(kia.getMaxSpeed());
//
//        Train lastochka = new Train(" Ласточка ","B-901",2011," Россия ",null,301,3500,18," Белорусский вокзал "," Минск-Пассажирский ",11);
//        Train leningrad = new Train(" Ленинград ", " D-125 ", 2019, " Россия ", null, 270, 1700, 13, " Ленинградский вокзал ", " Ленинград-Пассажирский ", 8);
//        System.out.println(lastochka);
//        lastochka.train();
//        leningrad.train();
//
//        Bus huyndai = new Bus(" Huyndai ", " DM-25 ", 2017, " Korea ", " yellow ", 190);
//        Bus gazel = new Bus(" Газель ", " A-1 ", 2020, " Россия ", " white ", 220);
//        Bus mercedes = new Bus(" Mercedes ", " GTA ", 2018, " Germany ", " black", 320);
//
//        huyndai.bus();
//        gazel.bus();
//        mercedes.bus();
//
//        System.out.println(huyndai);
//        bmw.refill();
        Bus bmw = new Bus("BMW", "GTM-5", 2.5f, Bus.PassengerCapacity.extraSmall);
        Bus mercedes = new Bus("Mercedes", "RH", 3, Bus.PassengerCapacity.small);
        Bus scania = new Bus("Scania", "Touring", 6, Bus.PassengerCapacity.large);
        Bus yutong = new Bus("Yutong", "ZK6122H9", 5.5f, Bus.PassengerCapacity.medium);
        Truck man = new Truck("MAN", "AG", 3.8f, Truck.LoadCapacity.N1);
        Truck volvo = new Truck("Volvo", "V-275", 4, Truck.LoadCapacity.N3);
        Truck hino = new Truck("HINO", "AKM", 15, Truck.LoadCapacity.N2);
        Truck iveco = new Truck("IVECO", "A-22", 13.2f, Truck.LoadCapacity.N3);
        Car ford = new Car("Ford", "RS200", 10.2f, Car.BodyType.sedan);
        Car toyota = new Car("Toyota", "Celica 1600GT", 5, Car.BodyType.hatchback);
        Car bugatti = new Car("Bugatti", "Veyron", 16.4f, Car.BodyType.coupe);
        Car ferrari = new Car("Ferrari", "FF", 6.2f, Car.BodyType.coupe);
        System.out.println(bmw);
        System.out.println(man);
        System.out.println(ford);
        mercedes.pitStop();
        volvo.getMaxSpeed();
        toyota.getBestLapTime();

        DriverCatB<Car> stepanov = new DriverCatB<>("Степанов Андрей Романович", "B", 10);
        DriverCatC<Truck> rapaport = new DriverCatC<>("Рапапорт Инна Николаевна", "C", 15);
        DriverCatD<Bus> hvostik = new DriverCatD<>("Хвостик", "D", 7);
        System.out.println(" Водитель " + stepanov.getFullName() + " управляет автомобилем " + ferrari.getBrand() + " и будет участвовать в заезде ");
        System.out.println(" Водитель " + rapaport.getFullName() + " управляет автомобилем " + hino.getBrand() + " и будет участвовать в заезде ");
        System.out.println(" Водитель " + hvostik.getFullName() + " управляет автомобилем " + scania.getBrand() + " и будет участвовать в заезде ");
        yutong.printType();



    }
}