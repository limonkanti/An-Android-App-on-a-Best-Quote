package com.example.bestquote;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Mahatma extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mahatma);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mahatma, menu);
		return true;
	}

}
