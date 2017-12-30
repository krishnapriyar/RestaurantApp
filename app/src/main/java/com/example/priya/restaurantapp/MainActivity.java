package com.example.priya.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmOrder(){

        Intent intent = new Intent(this, DisplayOrderActivity.class);
        startActivity(intent);
    }
}
