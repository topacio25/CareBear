package com.example.carebear;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlarmLunch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm_lunch);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alarm_lunch, menu);
		return true;
	}
	public void nextFrame(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, AlarmDinner.class);
	    startActivity(intent);
	}
	
	public void backFrame(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, MainMenu.class);
	    startActivity(intent);
	}

}
