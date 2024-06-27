package resturant.model;

import java.util.List;

public class Customer {

    private Long id;
    private String customerName;
    private List<Item> item;
    private String totalAmount;

    public Customer(Long id, String customerName, List<Item> item) {
        this.id = id;
        this.customerName = customerName;
        this.item = item;
    }

    public Customer(Long id, String customerName, List<Item> item, String totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.item = item;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
