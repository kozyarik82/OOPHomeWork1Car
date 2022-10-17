public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model,String color, int productionYear, String productionCountry) {
        this(brand, model, color, productionYear, productionCountry, 1.5);
    }

    Car(String brand, String model,  String color, int productionYear, String productionCountry,double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        }else{
            this.model = model;
        }
        this.engineVolume = engineVolume;
        if (color == null) {
            this.color = "white";
        }else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        }else{
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;
        }
    }

    void vehicleInformation() {
        System.out.println(" Марка: " + brand + ", модель: " + model + " , объем двигателя: " + engineVolume + " литров, цвет кузова: " + color + " , год производства: " + productionYear + " , страна сборки: " + productionCountry);
    }

}
