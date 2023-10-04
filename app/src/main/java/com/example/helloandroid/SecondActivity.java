package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends Activity {

    LinearLayout layout;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String ourColor = getIntent().getStringExtra("ourColor").toString();

        int color;

        layout = findViewById(R.id.layout);

        switch (ourColor) {
            case "red":
                color = R.color.red;
                layout.setBackgroundColor(getColor(color));
                break;
            case "green":
                color = R.color.green;
                layout.setBackgroundColor(getColor(color));
                break;
            case "blue":
                color = R.color.blue;
                layout.setBackgroundColor(getColor(color));
                break;
            default:
                Toast.makeText(this, "Incorrect color", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }


        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        }
        );
    }
}
