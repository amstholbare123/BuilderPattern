package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}