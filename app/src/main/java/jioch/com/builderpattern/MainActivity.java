package jioch.com.builderpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mText;
    private StringBuilder displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.text);
        displayText = new StringBuilder();
        //Create object of meal builder class
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        // Initialize the singletons so their instances
        initSingletons();

    }
    protected void initSingletons()
    {
        // Initialize the instance of MySingleton
        //Singleton.initInstance();
        MySingleTonClass instance=MySingleTonClass.getInstance();
        mText.setText(instance.showValue());

    }
}
