package com.camera.simpledoublewebcams2;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
	
	private CameraPreview cp;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		cp = (CameraPreview) findViewById(R.id.cp);
	}
}
