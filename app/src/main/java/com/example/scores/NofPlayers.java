package com.example.scores;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.NumberPicker;

public class NofPlayers extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_nofp);
		
		NumberPicker picker = (NumberPicker) findViewById(R.id.numPicker);
		picker.setMaxValue(6);
		picker.setMinValue(2);
		picker.setWrapSelectorWheel(false);
		
		//Disable soft keyboard to popup
		picker.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS); 
		
	}
}