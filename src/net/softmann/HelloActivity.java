package net.softmann;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HelloActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		startActivity(new Intent(getApplicationContext(), HelloService.class));
	}

}
