import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human(1987," Максим ","Минск","бренд-менеджер");
        Human anna = new Human(1993,"Аня","Москва",  "методист образовательных программ");
        Human kate = new Human(1994,"Катя", "Калининград",  "продакт-менеджер");
        Human artyom = new Human(1995,"Артем", "Москва",  "директор по развитию бизнеса");
        Human vladimir = new Human(2001," Владимир "," Казань ", null);


        maksim.greetings();
        anna.greetings();
        kate.greetings();
        artyom.greetings();
        vladimir.greetings();

        Car lada = new Car("Lada", "Granta", "yellow", 2015, "Russia",1.7f,"automatic","sedan","М215ВК263",5,true,new Car.Key(true,true), new Car.Insurance(LocalDate.now().plusMonths(4),7000.0f,"123456789"));
        Car audi = new Car("Audi", "A8 50L TDI quattro", "black", 2020, "Germany", 3f,"manual","sports car", "А000АА000",2,true,new Car.Key(true,false),new Car.Insurance(LocalDate.now().plusMonths(2),13000.0f,"987654321"));
        Car bmw = new Car("BMW", "Z8", "black", 2021,"Germany",3f,"automatic","sedan","ВВ252ВА831",5,false, new Car.Key(false,true), new Car.Insurance(LocalDate.now().plusMonths(5), 3500.0f,"257614328"));
        Car kia = new Car("Kia", "Sportage 4",  "red",2018, "South Korea", 2.4f,"manual","sedan","К525МН005",5,true,  new Car.Key(true,true), new Car.Insurance(LocalDate.now().plusMonths(1), 7000.0f,"628431579"));
        Car hyundai = new Car("Hyundai", "Avante", "orange", 0, "South Korea", 1.6f,"automatic","hatch back","О325ВА125",3,false,  new Car.Key(true,true), new Car.Insurance(LocalDate.now().plusMonths(3), 8200.0f,"628931475"));
        System.out.println(kia);







    }
}