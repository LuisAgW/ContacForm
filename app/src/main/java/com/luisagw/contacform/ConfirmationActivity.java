package com.luisagw.contacform;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmatio);

        Intent intentNombre = getIntent();
        String messageNombre = intentNombre.getStringExtra("NOMBRE_MESSAGE");
        TextView tvNombre = findViewById(R.id.txtNombre);
        tvNombre.setText(messageNombre);

        Intent intentPhone = getIntent();
        String messagePhone = intentPhone.getStringExtra("PHONE_MESSAGE");
        TextView tvPhone = findViewById(R.id.txtTelefono);
        tvPhone.setText(messagePhone);

        Intent intentEmail = getIntent();
        String messageEmail = intentEmail.getStringExtra("MAIL_MESSAGE");
        TextView tvEmail = findViewById(R.id.txtCorreo);
        tvEmail.setText(messageEmail);

        Intent intentDesc = getIntent();
        String messageDesc = intentDesc.getStringExtra("DESC_MESSAGE");
        TextView tvDesc = findViewById(R.id.txtDescripcion);
        tvDesc.setText(messageDesc);


        Button btnRegresar = findViewById(R.id.btn_regresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmationActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}