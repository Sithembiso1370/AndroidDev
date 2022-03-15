package com.example.uberclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Create variables to hold the buttons
    private Button nDriver, nCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nDriver = (Button) findViewById(R.id.driver);
        nCustomer = (Button) findViewById(R.id.customer);

//        Set an event lister on the Driver button
        nDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//               Throw an intent on click of the driver button to Call the driver Activity Class
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
//                Start the intent on the defined class
                startActivity(intent);
//                Complete the  intent production
                finish();
//                return the intent Object
                return;
            }
        });
    }
}