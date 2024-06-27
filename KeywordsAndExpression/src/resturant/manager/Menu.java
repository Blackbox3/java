package resturant.manager;

import resturant.model.Item;

public class Menu {

    public Item getSamosa(){
        return new Item(1L,"Samosa",200L);
    }

    public Item getPakoda(){
        return new Item(1L,"Pakoda",200L);
    }

    public Item getMasu(){
        return new Item(1L,"Masu",200L);
    }
}
