package com.learning;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void onBtnClick( View view)
    {
        TextView txtFName = findViewById(R.id.frstname);
        EditText editFName = findViewById(R.id.editFirstName);
        txtFName.setText("First Name: "+editFName.getText().toString());

        TextView txtLName = findViewById(R.id.lastName);
        EditText ediLName = findViewById(R.id.editLastName);
        txtLName.setText("Last Name: "+ediLName.getText().toString());

        TextView Email = findViewById(R.id.email);
        EditText editEmail = findViewById(R.id.editEmail);
        Email.setText("Email: "+editEmail.getText().toString());

    }
}