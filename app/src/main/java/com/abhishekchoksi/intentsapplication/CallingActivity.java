package com.abhishekchoksi.intentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallingActivity extends AppCompatActivity {
    EditText editTextPhone;
    Button bttnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);
        setTitle("Calling Application");

        bttnCall = findViewById(R.id.bttnCall);
        editTextPhone = findViewById(R.id.editTextPhone);
        
        bttnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "tel:"+ editTextPhone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(number));
                startActivity(intent);
            }
        });
    }
}