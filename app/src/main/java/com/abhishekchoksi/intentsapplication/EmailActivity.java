package com.abhishekchoksi.intentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {
    EditText editTextEmailAddress,editTextEmailSubject,editTextEmailBody;
    Button bttnEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        setTitle("Email Application");

        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        editTextEmailSubject= findViewById(R.id.editTextEmailSubject);
        editTextEmailBody= findViewById(R.id.editTextEmailBody);
        bttnEmail=findViewById(R.id.bttnEmail);

        bttnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addresses = editTextEmailAddress.getText().toString();
                String subject = editTextEmailSubject.getText().toString();
                String body = editTextEmailBody.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(intent, "Choose an email client from..."));

            }
        });
    }
}