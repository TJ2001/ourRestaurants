package com.example.guest.ourrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.editText);
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String locations = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("locations", locations);
                startActivity(intent);
            }
        });

    }
}
