
package com.webcraftbd.radio;

import android.os.Bundle;

public class FacebookActivity extends WebviewActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		loadUrl("http://m.facebook.com/"+getResources().getString(R.string.facebook_id), getResources().getString(R.string.menu_facebook));		 
	}
}
