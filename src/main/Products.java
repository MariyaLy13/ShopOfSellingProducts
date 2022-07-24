package main;

public class Products {
    public int productId;
    public String name;
    public double price;

    public int getId() {
        return productId;
    }
    public void setId(int id) {
        this.productId = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException();
        this.price = price;
    }
    public Products(int id, String name, double price) {
        productId = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + productId + '\'' +
                ", name=" + name +
                ", price=" + price +
                '}';
    }
}
