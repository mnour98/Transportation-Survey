package com.example.nourt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity implements View.OnClickListener
{


    EditText edUsername, edPassword;
    Button btnValidate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();

    }

    private void Initialize() {
        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
        btnValidate = findViewById(R.id.btnValidate);
        btnValidate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String username = edUsername.getText().toString();
        String password = edPassword.getText().toString();
        if(username.equals("Admin")  && password.equals("padmin") ){
            Intent intent = new Intent(this, TransportActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        }
        else
            {
                Toast.makeText(this, "Wrong username or password”", Toast.LENGTH_LONG).show();
        }




    }


}