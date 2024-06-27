package resturant.model;

public class OfferItem extends Item{

    private Long discountAmount;

    public OfferItem(Long id, String itemName, Long amount) {
        super(id, itemName, amount);
    }

    public OfferItem(String itemName, Long amount) {
        super(itemName, amount);
    }

    public OfferItem(Long id, String itemName, Long amount, Long discountAmount) {
        super(id, itemName, amount);
        this.discountAmount = discountAmount;
    }

    public OfferItem(String itemName, Long amount, Long discountAmount) {
        super(itemName, amount);
        this.discountAmount = discountAmount;
    }
}
