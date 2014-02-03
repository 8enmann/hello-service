package net.softmann;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HelloActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		startService(new Intent(getApplicationContext(), HelloService.class));
	}

}
