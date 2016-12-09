package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
