package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.api.client.*;
import com.google.api.client.googleapis.*;
import com.google.api.client.http.*;
import com.google.api.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    // creating a variable for our text view..
//        private TextView userNameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRegister(View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtTxtFirstName = findViewById(R.id.editTxtFirstName);
        EditText edtTxtLastName = findViewById(R.id.editTextLastName);
        EditText edtTxtEmail = findViewById(R.id.editTextEmail);

        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());

        goToMainPage();
    }

    /**
     * Button Action: Saves the user's input and switches view back to the main interface.
     *
     * Implemented: listing_form.xml
     *
     * @param view no idea what this does
     */
    public void submitForm(View view) {


        goToMainPage();
    }

    public void newPostButton(View view) {
        setContentView(R.layout.listing_form);
    }

    /**
     * Method switches view to the main page.
     */
    public void goToMainPage() {
        setContentView(R.layout.mainpage);
    }

}