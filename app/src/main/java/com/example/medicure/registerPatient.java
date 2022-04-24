package com.example.medicure;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class registerPatient extends AppCompatActivity {
    Button register;
    EditText firstName,lastName,mobile,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_patient);

        register=(Button) findViewById(R.id.buttonRegister);
        firstName=(EditText) findViewById(R.id.firstName);
        lastName=(EditText) findViewById(R.id.lastName);
        mobile=(EditText) findViewById(R.id.mobileNumber);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}