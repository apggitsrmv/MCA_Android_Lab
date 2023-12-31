package com.javatpoint.optionmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.android:
			Toast.makeText(getApplicationContext(), "Android Selected",
					Toast.LENGTH_LONG).show();
			return true;

		case R.id.ios:
			Toast.makeText(getApplicationContext(), "IOS Selected",
					Toast.LENGTH_LONG).show();
			return true;

		case R.id.bb:
			Toast.makeText(getApplicationContext(), "BlackBerry Selected",
					Toast.LENGTH_LONG).show();
			return true;
		case R.id.win:
			Toast.makeText(getApplicationContext(), "Windows Selected",
					Toast.LENGTH_LONG).show();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
