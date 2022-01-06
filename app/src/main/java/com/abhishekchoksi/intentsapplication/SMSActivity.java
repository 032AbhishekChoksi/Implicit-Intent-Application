package com.abhishekchoksi.intentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {
    EditText editTextPhone,editTextMessage;
    Button bttnSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsactivity);
        setTitle("SMS Application");

        editTextPhone = findViewById(R.id.editTextPhone);
        editTextMessage = findViewById(R.id.editTextMessage);
        bttnSMS = findViewById(R.id.bttnSMS);

        bttnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "smsto:"+ editTextPhone.getText().toString();
                String message = editTextMessage.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(number));
                intent.putExtra("sms_body", message);
                startActivity(intent);
            }
        });
    }
}