package com.example.guest.ourrestaurants.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.guest.ourrestaurants.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @Bind(R.id.editText) EditText mLocationEditText;
    @Bind(R.id.textViewAmazing) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLocationEditText = (EditText) findViewById(R.id.editText);
        mAppNameTextView = (TextView) findViewById(R.id.textViewAmazing);
        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/Anagram.ttf");
        mAppNameTextView.setTypeface(ostrichFont);


        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });

    }
}
