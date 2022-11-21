import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String recipeName;
    private Set<Product> products;
    private Integer amount;
    private float totalCoast;

    public Recipe(String recipeName, Set<Product> products,float totalCoast) {
        this(recipeName, products, 1,totalCoast);

    }

    public Recipe(String recipeName, Set<Product> products, Integer amount,float totalCoast) {
        this.recipeName = recipeName;
        this.products = products;
        this.amount = amount;
        for (Product product : products) {
            totalCoast = 0;
            totalCoast += product.getPrice() * this.amount;
        }
        this.totalCoast = totalCoast;
    }
    public float calculatePrice() {
        float totalCoast = 0;
        for (Product product : products) {
            totalCoast = totalCoast + (product.getPrice() * amount);
        }
        return totalCoast;
    }



    public String getRecipeName() {
        return recipeName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", products=" + products +
                ", amount=" + amount +
                ", totalCoast=" + totalCoast +
                '}';
    }
}
