package com.coolweather.app.activity;


import com.coolweather.app.R;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.view.KeyEvent;
import android.view.Window;


public class LogActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_log);
	
		Runnable  r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LogActivity.this, ChooseAreaActivity.class);
				startActivity(intent);
				LogActivity.this.finish();
			}
		};	
		new Handler().postDelayed(r,2000);
	}	

	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode==KeyEvent.KEYCODE_BACK) {
		
				System.exit(0);

			
		}
		return true;
}

}
