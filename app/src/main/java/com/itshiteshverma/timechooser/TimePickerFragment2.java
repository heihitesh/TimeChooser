package com.itshiteshverma.timechooser;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Nilesh Verma on 5/30/2016.
 */
public class TimePickerFragment2  extends DialogFragment implements TimePickerDialog.OnTimeSetListener  {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //Use the current time as the default values for the time picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);


        //Create and return a new instance of TimePickerDialo
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    //onTimeSet() callback method
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        //Do something with the user chosen time
        //Get reference of host activity (XML Layout File) TextView widget
        TextView tv2 = (TextView) getActivity().findViewById(R.id.tv2);
        //Set a message for user

        tv2.setText( String.valueOf(hourOfDay)+" : " +String.valueOf(minute) );

    }
}

