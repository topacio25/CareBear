package com.example.carebear;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Grocery extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.grocery, menu);
		return true;
	}

}
