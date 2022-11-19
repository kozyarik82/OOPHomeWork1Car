import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        Product banana = new Product("банан", 150f, 2.1f);
        Product lemon = new Product("лимон", 58.5f, 0.5f);
        Product bread = new Product("хлеб", 45f, 0.7f);
        Product milk = new Product("молоко", 55f, 0.5f);
        ProductList.addProduct(new Product( "хлеб",2f,2f));
        ProductList.addProduct(new Product("яйца",2f,0.2f));
        ProductList.addProduct(new Product("рыба", 125f, 2.1f));

        ProductList.addProduct(banana);
        ProductList.addProduct(lemon);
        ProductList.deleteProduct(lemon);
        ProductList.markAsBought(banana);
        System.out.println(ProductList.getProducts());
        System.out.println(banana.getPrice());
        Recipe salat = new Recipe("салат", ProductList.getProducts());
        Recipe borsch = new Recipe("борщь", ProductList.getProducts());
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(salat);
        recipes.add(borsch);
        System.out.println(recipes);
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
        System.out.println(multiplicationTable);









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
