package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
