package com.abhishekchoksi.intentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bttnWeb,bttnCalling,bttnSMS,btttnEmail,bttnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnWeb = findViewById(R.id.bttnWeb);
        bttnCalling = findViewById(R.id.bttnCalling);
        bttnSMS = findViewById(R.id.bttnSMS);
        btttnEmail = findViewById(R.id.btttnEmail);
        bttnSearch = findViewById(R.id.bttnSearch);

        bttnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),BrowserActivity.class);
                startActivity(intent);
            }
        });

        bttnCalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),CallingActivity.class);
                startActivity(intent);
            }
        });

        bttnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),SMSActivity.class);
                startActivity(intent);
            }
        });

        btttnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),EmailActivity.class);
                startActivity(intent);
            }
        });

        bttnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}