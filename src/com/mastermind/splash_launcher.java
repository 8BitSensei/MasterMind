package com.mastermind;

import com.mastermind.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class splash_launcher extends Activity {

	public Context a;

	public void onCreate(Bundle bacon) {
		super.onCreate(bacon);
		setContentView(R.layout.splash_screen);
		a = this;

		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMainActivity = new Intent(a, home.class);
					startActivity(openMainActivity);

				}

			}

		};
		timer.start();

	}
}
