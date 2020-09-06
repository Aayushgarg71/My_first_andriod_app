package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    static int num=2;
    public void submitOrder(View view){
        //num++;
        display(num);
        displayPrice(num*5);
    }
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }
    private void displayPrice(int num){
        TextView price = (TextView)  findViewById(R.id.priceview);
                price.setText(NumberFormat.getCurrencyInstance().format(num));
    }
    public void increment(View view){
        num++;
        display(num);
    }
    public void decrement(View view){
        num--;
        display(num);
    }
}