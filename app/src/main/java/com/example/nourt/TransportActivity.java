package com.example.nourt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import Model.User;

public class TransportActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvUsername;
    Button btnReturn, btnShow;
    RadioGroup rgPT, rgCT;

    String Username = "Admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        Initialize();
    }

    private void Initialize() {

        tvUsername = findViewById(R.id.tvUsername);
        btnReturn = findViewById(R.id.btnReturn);
        btnShow = findViewById(R.id.btnShow);
        rgPT = findViewById(R.id.rgPT);
        rgCT = findViewById(R.id.rgCT);

        btnReturn.setOnClickListener(this);
        btnShow.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.btnShow: {
                Show();
                break;
            }
            case R.id.btnReturn: {
                ReturnToFirstPage();
                break;
            }
        }


    }


    private void Show() {
        int r = rgPT.getCheckedRadioButtonId();
        int a = rgCT.getCheckedRadioButtonId();

        String Bus = "";
        String Metro = "";
        String Car = "";
        String Bike = "";
        User user = new User(Username, Bus, Metro, Car, Bike);
        

        switch (a) {
            case R.id.rbBus: {
                Bus = "Yes";
                Metro = "No";
                break;
            }



            case R.id.rbMetro: {
                Bus = "No";
                Metro = "Yes";
            }
            default:Bus="Nothing";break;

        }

        switch (r) {
            case R.id.rbCar: {
                Car = "Yes";
                Bike = "No";
                break;
            }
            case R.id.rbBike: {
                Car = "No";
                Bike = "Yes";
                break;
            }
        }
        Toast.makeText(this, " User " + Username + " Bus: "+ Bus +" ,Metro:" + Metro + " ,Car: " + Car +" ,Bike: " + Bike , Toast.LENGTH_LONG).show();
    }


        private void ReturnToFirstPage () {

            finish();
        }
    }

