package com.example.demo_alarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener  {

    @Override
    //============< Activity >==================
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //============</ Activity >==================

    //============< Buttons >==================
    public void BtnAlarmOnClick(View view) {
        //-------< BtnAlarmOnClick >--------
        //*click Button to set Time
        DialogFragment timePickerDialog =new TimePickerFragment();
        timePickerDialog.show(getSupportFragmentManager(),"time picker");
        //-------</ BtnAlarmOnClick >--------
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int intHourOfDay, int intMinute) {
        //--------< onTimeSet() >--------
        //*get Time after Picked in Dialog
        //*comes from:..Activity implements TimePickerDialog.OnTimeSetListener
        TextView textViewPicked=(TextView) findViewById(R.id.txtViewAlarm);
        textViewPicked.setText(("TimePicked=" + intHourOfDay + ":" + intMinute ));
        //--------</ onTimeSet() >--------
    }
//============</ Buttons >==================
}