package com.example.demo_alarm;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import java.util.Calendar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class TimePickerFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //return super.onCreateDialog(savedInstanceState);
        //< start with actual Time >
        Calendar cal=Calendar.getInstance();
        int intHour=cal.get(Calendar.HOUR);
        int intMinute=cal.get(Calendar.MINUTE);
        //</ start with actual Time >

        return new TimePickerDialog( getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(),intHour,intMinute,true);
    }
}

