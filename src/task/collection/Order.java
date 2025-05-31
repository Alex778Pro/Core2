package task.collection;

public class Order {

    private int id, totalAmount;
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public int getTotalAmount() {
        return totalAmount;
    }


    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }
}
