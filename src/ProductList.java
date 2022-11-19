import java.util.HashSet;
import java.util.Set;

public class ProductList {
    public static Set<Product> products = new HashSet<>();

    public static void addProduct(Product product) {
        if (products.contains(product)) {
            throw new RuntimeException("Данный товар в списке уже присутствует");
        }else{
            products.add(product);
        }
    }
    public static void deleteProduct(Product product) {
        products.remove(product);
    }

    public static void markAsBought(Product product) {
        if (products.contains(product)) {
            product.setBought(true);
        }
        if (product.getBought()) {
            System.out.println(product.getTitle() + " куплен ");
        }
    }

    public static Set<Product> getProducts() {
        return products;
    }
}
