package resturant.model;

public class Item {

    private Long id;
    private String itemName;
    private Long amount;

    public Item(Long id, String itemName, Long amount) {
        this.id = id;
        this.itemName = itemName;
        this.amount = amount;
    }

    public Item(String itemName, Long amount) {
        this.id = id;
        this.itemName = itemName;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
