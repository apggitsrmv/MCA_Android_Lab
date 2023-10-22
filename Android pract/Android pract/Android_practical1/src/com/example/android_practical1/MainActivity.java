package com.example.android_practical1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	public Button btn;
	public TelephonyManager telephonyManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.button1);
		telephonyManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String IMEI = telephonyManager.getDeviceId();
				Toast.makeText(getApplicationContext(), "IMEI = " + IMEI,
						Toast.LENGTH_LONG).show();
			}
		});
	}

}
