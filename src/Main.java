public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", "yellow", 2015, "Russia",1.7);
        Car audi = new Car("Audi", "A8 50L TDI quattro", "black", 2020, "Germany", 3);
        Car bmw = new Car("BMW", "Z8", "black", 2021,"Germany",3);
        Car kia = new Car("Kia", "Sportage 4",  "red",2018, "South Korea", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", "orange", 0, "South Korea", 1.6);

        lada.vehicleInformation();
        audi.vehicleInformation();
        bmw.vehicleInformation();
        kia.vehicleInformation();
        hyundai.vehicleInformation();


    }
}