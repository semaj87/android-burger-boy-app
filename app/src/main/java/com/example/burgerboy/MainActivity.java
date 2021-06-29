package com.example.burgerboy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOrder = findViewById(R.id.btnOrder);
        TextView tvOrderSummary = findViewById(R.id.tvOrderSummary);
        RadioGroup burger_boy_meat_selection = findViewById(R.id.burger_boy_meat_selection);


        CheckBox toppingCheese = findViewById(R.id.toppingCheese);
        CheckBox toppingBBQ = findViewById(R.id.toppingBBQ);
        CheckBox toppingKetchup = findViewById(R.id.toppingKetchup);

        CheckBox toppingLettuce = findViewById(R.id.toppingLettuce);
        CheckBox toppingMayo = findViewById(R.id.toppingMayo);
        CheckBox toppingMustard = findViewById(R.id.toppingMustard);

        CheckBox toppingOnions = findViewById(R.id.toppingOnions);
        CheckBox toppingPickles = findViewById(R.id.toppingPickles);
        CheckBox toppingTomatoes = findViewById(R.id.toppingTomatoes);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton checkedMeatSelectionRadioButton = (RadioButton) findViewById(burger_boy_meat_selection.getCheckedRadioButtonId());
                String meatSelection = checkedMeatSelectionRadioButton.getText().toString();

                boolean toppingCheeseChecked = toppingCheese.isChecked();
                boolean toppingBBQChecked = toppingBBQ.isChecked();
                boolean toppingKetchupChecked = toppingKetchup.isChecked();

                boolean toppingLettuceChecked = toppingLettuce.isChecked();
                boolean toppingMayoChecked = toppingMayo.isChecked();
                boolean toppingMustardChecked = toppingMustard.isChecked();

                boolean toppingOnionsChecked = toppingOnions.isChecked();
                boolean toppingPicklesChecked = toppingPickles.isChecked();
                boolean toppingTomatoesChecked = toppingTomatoes.isChecked();

                String orderSummeryString = String.format("YOUR ORDER IS ON THE WAY! \n\n " +
                        "ORDER SUMMARY: \n\n" + "%s Burger with: ", meatSelection) +
                String.format(toppingCheeseChecked ? "Cheese, " : "") +
                String.format(toppingBBQChecked ? "BBQ, " : "") +
                String.format(toppingKetchupChecked ? "Ketchup, " : "") +
                String.format(toppingLettuceChecked ? "Lettuce, " : "") +
                String.format(toppingMayoChecked ? "Mayo, " : "") +
                String.format(toppingMustardChecked ? "Mustard, " : "") +
                String.format(toppingOnionsChecked ? "Onions, " : "") +
                String.format(toppingPicklesChecked ? "Pickles, " : "") +
                String.format(toppingTomatoesChecked ? "Tomatoes, " : "");

                tvOrderSummary.setText(orderSummeryString);
            }
        });

    }
}