package com.mastermind;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Medals extends Activity {

	public Context e;

	public static boolean medal1;
	public static int medal_counter1;

	public static final String MEDAL_ONE_DATA = "MEDAL_ONE_DATA";
	public static final String MEDAL_ONE_COUNTER_DATA = "MEDAL_ONE_COUNTER_DATA";

	public static boolean medal2;
	public static int medal_counter2;

	public static final String MEDAL_TWO_DATA = "MEDAL_TWO_DATA";
	public static final String MEDAL_TWO_COUNTER_DATA = "MEDAL_TWO_COUNTER_DATA";

	public void onCreate(Bundle savedInstanceState) {

		// -----------------------------------------
		// references
		// -----------------------------------------
		e = this;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.medals);
		final Button medal_uno;
		final Button medal_quick_grip;
		medal_uno = (Button) findViewById(R.id.medal01);
		medal_quick_grip = (Button) findViewById(R.id.medal02);
		
		// ----------------------------------------------------
		// making preferences
		// ----------------------------------------------------

		

		// ---------------------------------------
		// Dialogue
		// ----------------------------------------

		final AlertDialog what_is_virgin = new AlertDialog.Builder(e).create();

		what_is_virgin.setMessage("You have unlocked the Virgin medal for winning a game for the very first time;" );
		what_is_virgin.setTitle("The Virgin Medal!");
		what_is_virgin.setIcon(R.drawable.ic_launcher);

		what_is_virgin.setCanceledOnTouchOutside(true);

		final AlertDialog virgin_description = new AlertDialog.Builder(e).create();

		virgin_description.setMessage("The Virgin medal is unlocked by beating a game for the very first time");
		virgin_description.setTitle("The Virgin Medal!");
		what_is_virgin.setIcon(R.drawable.ic_launcher);
		virgin_description.setCanceledOnTouchOutside(true);

		final AlertDialog what_is_quick_grip = new AlertDialog.Builder(e).create();

		what_is_quick_grip.setMessage("You have unlocked the Quick grip medal for winning a game in 5 moves or less!");
		what_is_quick_grip.setIcon(R.drawable.ic_launcher);
		what_is_quick_grip.setTitle("The Quick grip Medal!");
		what_is_quick_grip.setCanceledOnTouchOutside(true);

		// -------------------------------------------
		// changing medal image/dialogue info
		// -------------------------------------------

		if (medal1 == true) {
			medal_uno.setBackgroundResource(R.drawable.medalwin);

		}
		if (medal2 == true) {
			medal_quick_grip.setBackgroundResource(R.drawable.medalwin);

		}

		medal_uno.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (medal1 == true) {
					what_is_virgin.show();
				} else {
					virgin_description.show();

				}

			}
		});

		medal_quick_grip.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				what_is_quick_grip.show();

			}
		});
	}
}
