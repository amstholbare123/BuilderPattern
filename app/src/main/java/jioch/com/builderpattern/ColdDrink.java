package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
