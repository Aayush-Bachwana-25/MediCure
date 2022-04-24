package com.example.medicure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Patient,Doctor,Pharmacy;

        Patient=findViewById(R.id.imageViewPatient);
        Doctor=findViewById(R.id.imageViewDoctor);
        Pharmacy=findViewById(R.id.imageViewPharmacy);

        Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),PatientHome.class);
                startActivity(intent);
            }
        });

        Doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), DoctorHome.class);
                startActivity(intent);
            }
        });

        Pharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), PharmacyHome.class);
                startActivity(intent);
            }
        });




    }
}