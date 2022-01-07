package com.abhishekchoksi.intentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {
    EditText editTextSearch;
    Button bttnSearchOnBrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setTitle("Search on Browser Application");

        editTextSearch = findViewById(R.id.editTextSearch);
        bttnSearchOnBrowser = findViewById(R.id.bttnSearchOnBrowser);

        bttnSearchOnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = editTextSearch.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
                intent.putExtra(SearchManager.QUERY, query);
                startActivity(intent);
            }
        });
    }
}