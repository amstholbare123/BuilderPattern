package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

