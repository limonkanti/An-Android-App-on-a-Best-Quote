package com.example.bestquote;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Lincoln extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lincoln);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lincoln, menu);
		return true;
	}

}
