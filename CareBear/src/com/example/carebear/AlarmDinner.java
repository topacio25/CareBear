package com.example.carebear;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AlarmDinner extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm_dinner);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alarm_dinner, menu);
		return true;
	}
	
	public void backFrame(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, AlarmLunch.class);
	    startActivity(intent);
	}

}
