package com.luisagw.contacform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, ConfirmationActivity.class);

        EditText ETNombre = (EditText) findViewById(R.id.editTextNombre);
        String messageNombre = ETNombre.getText().toString();
        intent.putExtra("NOMBRE_MESSAGE", messageNombre);


        EditText ETNumPho = (EditText) findViewById(R.id.editTextPhone);
        String messageNumPho = ETNumPho.getText().toString();
        intent.putExtra("PHONE_MESSAGE", messageNumPho);


        EditText ETEmail = (EditText) findViewById(R.id.editTextEmail);
        String messageEmail = ETEmail.getText().toString();
        intent.putExtra("MAIL_MESSAGE", messageEmail);

        EditText ETDescrip = (EditText) findViewById(R.id.editTextDescrip);
        String messageDescrip = ETDescrip.getText().toString();
        intent.putExtra("DESC_MESSAGE", messageDescrip);


        startActivity(intent);
        finish();
    }




}