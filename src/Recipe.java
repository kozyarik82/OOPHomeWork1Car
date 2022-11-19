import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String recipeName;
    private Set<Product> products;

    public Recipe(String recipeName, Set<Product> products) {
        this.recipeName = recipeName;
        this.products = products;
    }
    public float calculatePrice() {
        float totalCoast = 0;
        for (Product product : products) {
            totalCoast = totalCoast + product.getPrice();
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
        return Objects.equals(recipeName, recipe.recipeName) && Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName, products);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", products=" + products +
                '}';
    }
}
