package com.mastermind;

import java.util.ArrayList;
import java.util.Arrays;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.android.Facebook;
import com.mastermind.Guess_harderx1.GuessStatus;

public class check_harderx1 extends Activity {
	public Context d;

	public ArrayList<Guess_harderx1> guess_list;
	Guess_harderx1 guess_harderx1 = new Guess_harderx1();
	public static int fudgex1;

	
	public static boolean medal1_counter_editor;
	public static boolean medal1_editor;
	
	
	@TargetApi(11)
	public void onCreate(Bundle savedInstanceState) {

		d = this;

		setContentView(R.layout.check_harderx1);

		super.onCreate(savedInstanceState);

		final Button test;

		final TextView text1;

		final TextView X1;
		final TextView X2;
		final TextView X3;
		final TextView X4;
		final TextView X5;
		final TextView X6;
		final TextView X7;
		final TextView guess_positions;
		
		

		guess_list = (ArrayList<Guess_harderx1>) getIntent().getExtras().get("guesses");
		Log.e("TEST", "" + guess_list.size());
		updateList();

		guess_harderx1.v1 = code_harderx1.int1;
		guess_harderx1.v2 = code_harderx1.int2;
		guess_harderx1.v3 = code_harderx1.int3;
		guess_harderx1.v4 = code_harderx1.int4;
		guess_harderx1.v5 = code_harderx1.int5;
		guess_harderx1.v6 = code_harderx1.int6;
		guess_harderx1.v7 = code_harderx1.int7;

		test = (Button) findViewById(R.id.try_again);
		home.adventure_time = 2;
		text1 = (TextView) findViewById(R.id.text);

		X1 = (TextView) findViewById(R.id.X1);
		X2 = (TextView) findViewById(R.id.X2);
		X3 = (TextView) findViewById(R.id.X3);
		X4 = (TextView) findViewById(R.id.X4);
		X5 = (TextView) findViewById(R.id.X5);
		X6 = (TextView) findViewById(R.id.X6);
	    X7 = (TextView) findViewById(R.id.X7);
		guess_positions = (TextView) findViewById(R.id.guess_positions);

		final int[] intArray = getIntent().getIntArrayExtra("intArray");

		Integer[] guess_list = { guess_harderx1.v1, guess_harderx1.v2, guess_harderx1.v3, guess_harderx1.v4 };
		Integer[] home_list = { Level_select.value1, Level_select.value2, Level_select.value3,Level_select.value4, Level_select.value5, Level_select.value6, Level_select.value7 };
		// checking the results - START

		Log.e("TEST", guess_list[0] + " " + guess_list[1] + " " + guess_list[2]
				+ " " + guess_list[3]);
		Log.e("TEST", Level_select.value1 + " " + Level_select.value2 + " " + Level_select.value3 + " "
				+ Level_select.value4+" "+ Level_select.value5 + " "+ Level_select.value6 + " "+ Level_select.value7);

		// Use the Builder class for convenient dialog construction

		final AlertDialog virgin = new AlertDialog.Builder(d).create();

		virgin.setMessage("You have unlocked the Virgin medal!");
		virgin.setTitle("You won a medal!");
		virgin.setCanceledOnTouchOutside(true);

	

		if (Arrays.asList(home_list).contains(guess_list[0])) {
			if (code.int1 == Level_select.value1) {
				X1.setText("V");

				Guess_harderx1.c1 = GuessStatus.V;
			} else {
				X1.setText("S");
				Guess_harderx1.c1 = GuessStatus.S;
			}
		} else {
			X1.setText("X");
			Guess_harderx1.c1 = GuessStatus.X;
		}

		if (Arrays.asList(home_list).contains(guess_list[1])) {
			if (guess_harderx1.v2 == Level_select.value2) {
				X2.setText("V");
				Guess_harderx1.c2 = GuessStatus.V;
			} else {
				X2.setText("S");
				Guess_harderx1.c2 = GuessStatus.S;
			}
		} else {
			X2.setText("X");
			Guess_harderx1.c2 = GuessStatus.X;
		}

		if (Arrays.asList(home_list).contains(guess_list[2])) {
			if (guess_harderx1.v3 == Level_select.value3) {
				X3.setText("V");
				Guess_harderx1.c3 = GuessStatus.V;
			} else {
				X3.setText("S");
				Guess_harderx1.c3 = GuessStatus.S;
			}
		} else {
			X3.setText("X");
			Guess_harderx1.c3 = GuessStatus.X;
		}

		if (Arrays.asList(home_list).contains(guess_list[3])) {
			if (guess_harderx1.v4 == Level_select.value4) {
				X4.setText("V");
				Guess_harderx1.c4 = GuessStatus.V;
			} else {
				X4.setText("S");
				Guess_harderx1.c4 = GuessStatus.S;
			}
		} else {
			X4.setText("X");
			Guess_harderx1.c4 = GuessStatus.X;
		}
		
		if (Arrays.asList(home_list).contains(guess_list[4])) {
			if (guess_harderx1.v5 == Level_select.value5) {
				X5.setText("V");
				Guess_harderx1.c5 = GuessStatus.V;
			} else {
				X5.setText("S");
				Guess_harderx1.c5 = GuessStatus.S;
			}
		} else {
			X5.setText("X");
			Guess_harderx1.c5 = GuessStatus.X;
		}
		
		if (Arrays.asList(home_list).contains(guess_list[5])) {
			if (guess_harderx1.v6 == Level_select.value6) {
				X6.setText("V");
				Guess_harderx1.c6 = GuessStatus.V;
			} else {
				X6.setText("S");
				Guess_harderx1.c6 = GuessStatus.S;
			}
		} else {
			X6.setText("X");
			Guess_harderx1.c6 = GuessStatus.X;
		}
		
		if (Arrays.asList(home_list).contains(guess_list[6])) {
			if (guess_harderx1.v7 == Level_select.value7) {
				X7.setText("V");
				Guess_harderx1.c7 = GuessStatus.V;
			} else {
				X7.setText("S");
				Guess_harderx1.c7 = GuessStatus.S;
			}
		} else {
			X7.setText("X");
			Guess_harderx1.c7 = GuessStatus.X;
		}
		

		if (Guess_harderx1.c3 == GuessStatus.V && Guess_harderx1.c1 == GuessStatus.V
				&& Guess_harderx1.c2 == GuessStatus.V && Guess_harderx1.c4 == GuessStatus.V&& Guess_harderx1.c5 == GuessStatus.
				V&& Guess_harderx1.c6 == GuessStatus.V&& Guess_harderx1.c7 == GuessStatus.V) {

			Medals.medal_counter1++;
			medal1_counter_editor = true;
			medal1_editor = true;
			if (Medals.medal_counter1 == 1) {
				virgin.show();
			}
			Medals.medal1 = true;
			test.setText("YOU WON!");
			text1.setText(Arrays.toString(intArray));
			test.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {
					Intent openCode = new Intent(d, home.class);
					home.adventure_time = 0;
					startActivity(openCode);

				}
			});
		} else {

			text1.setText(Arrays.toString(intArray));

			test.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {
					Intent openCode = new Intent(d, code.class);

					Intent data = new Intent();
					data.putExtra("guess", check_harderx1.this.guess_harderx1);
					setResult(RESULT_OK, data);
					finish();

				}
			});
		}
	}

	public void updateList() {
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		for (Guess_harderx1 gx1 : guess_list) {

			View stub = inflater.inflate(R.layout.guess_stub, null);

			((TextView) stub.findViewById(R.id.guess)).setText(gx1.v1 + ", "
					+ gx1.v2 + ", " + gx1.v3 + "," + gx1.v4 + ","+ gx1.v5 + ","+ gx1.v6 + ","+ gx1.v7);
			((TextView) stub.findViewById(R.id.guess_positions)).setText(Guess_harderx1.c1
					+ "," + Guess_harderx1.c2 + "," + Guess_harderx1.c3 + "," + Guess_harderx1.c4+ Guess_harderx1.c5
					+ ","+ Guess_harderx1.c6 + ","+ Guess_harderx1.c7 + ",".toString());
			((ViewGroup) findViewById(R.id.scroll_layout)).addView(stub);
		}
	}

}







