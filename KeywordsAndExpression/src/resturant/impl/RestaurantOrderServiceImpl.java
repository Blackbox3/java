package resturant.impl;

import resturant.model.Customer;
import resturant.model.Item;

import java.util.List;

public class RestaurantOrderServiceImpl implements RestaurantService{


    void createOrder(Customer customer){

    }

    @Override
    public Long calculateTotalAmout(List<Item> items) {
                Long totalAmount = 0L;
        for(Item item:items){
            totalAmount+=item.getAmount();
        }
        return totalAmount;
    }

//    public Long calculateTotalAmout(List<Item>items){
//        Long totalAmount = 0L;
//        for(Item item:items){
//            totalAmount+=item.getAmount();
//        }
//        return totalAmount;
//    }
}
