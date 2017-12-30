package com.example.priya.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_order);
    }

    public void pay(){

        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }

    public void orderList(){

        Intent intent = new Intent(this, OrderListActivity.class);
        startActivity(intent);
    }
}
