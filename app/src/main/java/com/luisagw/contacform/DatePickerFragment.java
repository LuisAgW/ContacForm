package com.luisagw.contacform;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Obtener la fecha actual
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Crear un nuevo DatePickerDialog y devolverlo
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Obtener una referencia a la actividad que contiene el fragmento
        MainActivity activity = (MainActivity) getActivity();
        if (activity != null) {
            // Actualizar el TextView con la fecha seleccionada
            TextView tvDate = activity.findViewById(R.id.tv_date);
            tvDate.setText(day + "/" + (month + 1) + "/" + year);
        }
    }


}
