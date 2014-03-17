package com.example.scores;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	CurrentGameDb CGdb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageButton imgbtn = (ImageButton) findViewById(R.id.imgbtn1);
		imgbtn.setOnClickListener(new View.OnClickListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {																		
				// TODO Auto-generated method stub
				showDialog(1);
				
				/*Intent myintent = new Intent(v.getContext(),NofPlayers.class);
				startActivityForResult(myintent, 0);*/
			}
		});
		/*
		CGdb = new CurrentGameDb(getApplicationContext());
		long CGid = CGdb.CreateGame("2");*/
	}
	
	protected Dialog onCreateDialog(int i) {
		  
		   AlertDialog.Builder ab = new AlertDialog.Builder(this);
		   ab.setTitle("Select Number Of Players");
		   ab.setView(getLayoutInflater().
		     inflate(R.layout.set_nofp, null));
		   
		   ab.setPositiveButton("Done", null);
		   ab.setNegativeButton("Cancel", null);
		   ab.setNeutralButton("Ask Later", null);
		   
		   ab.create();
		  return ab.show();
		 
		}
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
