package resturant;

import resturant.impl.RestaurantOrderServiceImpl;
import resturant.impl.RestaurantService;
import resturant.manager.Menu;
import resturant.model.Customer;
import resturant.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * CUSTOMER WALKS IN AND ORDER SOME ITEMS
         */
        Menu menu =  new Menu();

        List<Item> tableA = new ArrayList<>();
        tableA.add(menu.getMasu());
        tableA.add(menu.getSamosa());

        List<Item> tableB = new ArrayList<>();
        tableB.add(menu.getMasu());
        tableB.add(menu.getSamosa());

        Customer bikas = new Customer(1L,"Bikash Shah",tableA);
        Customer anuska = new Customer(1L,"Anuska Shah",tableB);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(bikas);
        customerList.add(anuska);


        RestaurantService impl = new RestaurantOrderServiceImpl();

        for(Customer customer:customerList){
            System.out.println("Total Amount By Customer: "+customer.getCustomerName()+"\nTotal Amount: "+impl.calculateTotalAmout(customer.getItem()));
        }
    }
}
