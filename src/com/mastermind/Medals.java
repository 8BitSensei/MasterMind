package com.mastermind;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
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

		//-----------------------------------------
		//references
		//-----------------------------------------
		e = this;

		super.onCreate(savedInstanceState);
		setContentView(R.layout.medals);
		final Button medal_uno;
		final Button medal_quick_grip;
		final ListView list;

		medal_uno = (Button) findViewById(R.id.medal01);
		medal_quick_grip = (Button) findViewById(R.id.medal02);
		list = (ListView) findViewById(R.id.list);
		//----------------------------------------------------
		//making preferences 
		//----------------------------------------------------

		
		//medal one won or not
		SharedPreferences settings1 = getSharedPreferences(MEDAL_ONE_DATA, 0);
		final boolean medal_one = medal1;

		//medal one counter
		SharedPreferences settings1a = getSharedPreferences(
				MEDAL_ONE_COUNTER_DATA, 0);
		int medal_one_counter = medal_counter1;

		//editors
		SharedPreferences.Editor editor1 = settings1.edit();
		

		SharedPreferences.Editor editor1a = settings1a.edit();
		editor1a.putInt(MEDAL_ONE_COUNTER_DATA, medal_counter1);

		
		//medal two won or not
		SharedPreferences settings2 = getSharedPreferences(MEDAL_ONE_DATA, 0);
		boolean medal_two = medal2;

		//medal two counter
		SharedPreferences settings2a = getSharedPreferences(
				MEDAL_ONE_COUNTER_DATA, 0);
		int medal_two_counter = medal_counter2;

		
		//editors
		SharedPreferences.Editor editor2 = settings1.edit();
		editor2.putBoolean(MEDAL_ONE_DATA, medal1);

		SharedPreferences.Editor editor2a = settings1a.edit();
		editor2a.putInt(MEDAL_ONE_COUNTER_DATA, medal_counter1);

		//---------------------------------------
		//Dialogue 
		//----------------------------------------

		final AlertDialog what_is_virgin = new AlertDialog.Builder(e).create();

		what_is_virgin
				.setMessage("You have unlocked the Virgin medal for winning a game for the very first time; code crackin' cherry poppin' goodnes.");
		what_is_virgin.setTitle("The Virgin Medal!");
		what_is_virgin.setCanceledOnTouchOutside(true);
		
		final AlertDialog virgin_description = new AlertDialog.Builder(e).create();

		virgin_description
				.setMessage("The Virgin medal is unlocked by beating a game for the very first time");
		virgin_description.setTitle("The Virgin Medal!");
		virgin_description.setCanceledOnTouchOutside(true);

		final AlertDialog what_is_quick_grip = new AlertDialog.Builder(e)
				.create();

		what_is_quick_grip
				.setMessage("You have unlocked the Quick grip medal for winning a game in 5 moves or less!");
		what_is_quick_grip.setTitle("The Quick grip Medal!");
		what_is_quick_grip.setCanceledOnTouchOutside(true);
		
		
		settings1.edit().putBoolean("MEDAL_ONE_DATA", medal_one).commit();
		settings1a.edit().putInt("MEDAL_ONE_DATA", medal_counter1).commit();
		editor1.putBoolean("MEDAL_ONE_DATA", medal_one);
		settings1.edit().commit();
		editor1a.commit();
		editor2.commit();
		editor2a.commit();

		//-------------------------------------------
		//changing medal image/dialogue info 
		//-------------------------------------------

		if (medal_one == true) {
			medal_uno.setBackgroundResource(R.drawable.medalwin);

			editor1.putBoolean("medal_one", true);
			editor1.commit();
		}
		if (medal_two == true) {
			medal_quick_grip.setBackgroundResource(R.drawable.medalwin);

			editor1.commit();
			editor1a.commit();
		}

		medal_uno.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if(medal_one == true){
				what_is_virgin.show();}else{
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
