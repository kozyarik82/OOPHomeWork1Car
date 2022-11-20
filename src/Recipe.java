import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
//    private final String recipeName;
    private Set<Product> products;
    private float totalCost = 0;
    private Integer amount;

    public Recipe(String recipeName, Set<Product> products) {
        this(recipeName, products, 1);

    }

    public Recipe(String recipeName, Set<Product> products, Integer amount) {
//        this.recipeName = recipeName;
        this.products = products;
        this.amount = amount;
        this.totalCost = totalCost + (this.totalCost * this.amount);
    }
    public float calculatePrice() {
        float totalCoast = 0;
        for (Product product : products) {
            totalCoast = totalCoast + (product.getPrice() * amount);
        }
        return totalCoast;
    }

    public float getTotalCost() {
        return totalCost;
    }

//    public String getRecipeName() {
//        return recipeName;
//    }

    public Set<Product> getProducts() {
        return products;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Recipe recipe = (Recipe) o;
//        return Objects.equals(recipeName, recipe.recipeName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(recipeName);
//    }


    @Override
    public String toString() {
        return "Recipe{" +
                "products=" + products +
                ", totalCost=" + totalCost +
                ", amount=" + amount +
                '}';
    }
}
