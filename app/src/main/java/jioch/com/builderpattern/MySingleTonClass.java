package jioch.com.builderpattern;

/**
 * Created by amol on 9/12/16.
 */

/**
 * Created by amol on 9/12/16.
 */
public class MySingleTonClass {
    private static MySingleTonClass instance;

    public static String title = "Hello firend Lets get Started";

    public static MySingleTonClass getInstance() {
        if (instance == null) {
            // Create the instance
            instance = new MySingleTonClass();
        }
        // Return the instance
        return instance;
    }

    private MySingleTonClass() {
        // Constructor hidden because this is a singleton
    }

    public String showValue() {
        return title;
    }
}