package com.example.carebear;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

	private String day[];
	private String gender[];
	private EditText name;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name =(EditText)findViewById(R.id.editText1);
		gender = new String[2];
		gender[0] = "Male";
		gender[1] = "Female";
		day = new String[7];
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		Spinner s = (Spinner) findViewById(R.id.spinner1);
		Spinner s1 = (Spinner) findViewById(R.id.spinner2);
		ArrayAdapter adapter1 = new ArrayAdapter(this,
		        android.R.layout.simple_spinner_item, gender);
        ArrayAdapter adapter = new ArrayAdapter(this,
        android.R.layout.simple_spinner_item, day);
        s.setAdapter(adapter);
        s1.setAdapter(adapter1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendMessage(View view) {
	    // Do something in response to button
		String ns = Context.NOTIFICATION_SERVICE;
		NotificationManager mNotificationManager = (NotificationManager) getSystemService(ns);

		int icon = R.drawable.ic_launcher;        
		CharSequence tickerText = "Hello"; // ticker-text
		long when = System.currentTimeMillis();         
		Context context = getApplicationContext();     
		CharSequence contentTitle = "Hello";  
		CharSequence contentText = "Hello";      
		Intent notificationIntent = new Intent(this, MainMenu.class);
		PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);
		Notification notification = new Notification(icon, tickerText, when);
		notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);

		// and this
		final int HELLO_ID = 1;
		mNotificationManager.notify(HELLO_ID, notification);
		Intent intent = new Intent(this, MainMenu.class);
		Log.v("editText1", name.getText().toString());
		System.out.println(name.getText().toString());
		
	    startActivity(intent);
	    
	}
	


}
