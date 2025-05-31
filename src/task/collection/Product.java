package task.collection;

public class Product {
    private int id, quantity;
    private String name;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}