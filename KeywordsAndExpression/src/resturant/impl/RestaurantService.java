package resturant.impl;

import resturant.model.Item;

import java.util.List;

public interface RestaurantService {

    public Long calculateTotalAmout(List<Item> items);
}
