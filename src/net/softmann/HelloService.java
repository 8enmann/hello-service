package net.softmann;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class HelloService extends IntentService {

	public HelloService() {
		super("HelloService");
	}

	@Override
	protected void onHandleIntent(Intent arg0) {
		Log.i("S", "hello world");
	}

}
