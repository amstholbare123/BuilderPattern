package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */

import java.util.ArrayList;
import java.util.List;


public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
    String value=null;
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
          value=item.name()+item.packing().pack()+item.price();
        }

    }
}
