package com.example.priya.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OrderListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);
    }

    public void order(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void logOut(){

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
