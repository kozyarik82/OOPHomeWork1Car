import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String title;
    private float price;
    private float weight;
    private boolean isBought;

    public Product(String title, float price, float weight) {
        setPrice(price);
        setTitle(title);
        setWeight(weight);
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public void setTitle(String title) {
        if (title==null || title.isBlank()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.title = title;
        }
    }

    public void setPrice(float price) {
        if (price>0) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public void setWeight(Float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public boolean getBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 && Float.compare(product.weight, weight) == 0 && isBought == product.isBought && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, weight, isBought);
    }
}
