package com.example.dsuappacademy.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantity = 2;
    String name = "Denise";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//change
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(price);
        createOrderSummary(price,name);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public String createOrderSummary(int number,String name){
       return "Name: "+name+"\nQuantity: "+number+"\n";
    }

    /**
     * Calculates the price of the order.
     *
     */
    private int calculatePrice() {
        return quantity * 5;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int anything) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + anything);
    }
    /**
     * This method displays the given price on the screen.
     */
    //    TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
    //orderSummaryTextView.setText("Name: Kaptain Kunal" + "\n quantity"  + "\nTotal " + NumberFormat.getCurrencyInstance().format(number)+ "\nThank You!");
    //}
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayMessage(int number) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(createOrderSummary(quantity,name)+"Total:"+NumberFormat.getCurrencyInstance().format(number)+"\nThank you!");
    }
}
