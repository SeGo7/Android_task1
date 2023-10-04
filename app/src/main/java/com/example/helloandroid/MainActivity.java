package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btnName;
    EditText colorField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorField = (EditText)findViewById(R.id.color);

        btnName = (Button)findViewById(R.id.btnName);
        btnName.setOnClickListener(this);
    }

    public void onClick(View v) {
        String color = colorField.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("ourColor", colorField.getText().toString());
        startActivityForResult(intent, 1);
    }
}