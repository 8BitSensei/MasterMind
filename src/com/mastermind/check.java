package com.mastermind;

import java.util.ArrayList;
import java.util.Arrays;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mastermind.Guess.GuessStatus;

public class check extends Activity {
	public Context d;

	public ArrayList<Guess> guess_list;
	int[] results_list = new int[3];
	Guess guess = new Guess();
	public static int fudge;

	public static int turn_counter = 0;

	int one = 0;
	int two = 0;
	int three = 0;
	int four = 0;
	int five = 0;
	int six = 0;

	int guess_one = 0;
	int guess_two = 0;
	int guess_three = 0;
	int guess_four = 0;
	int guess_five = 0;
	int guess_six = 0;

	@TargetApi(9)
	public check() {

		d = this;
		// c1 = 0;
		turn_counter++;

		// setContentView(R.layout.check);

		// super.onCreate(savedInstanceState);

		final Button test;
		final TextView text1;
		final TextView X1;
		final TextView X2;
		final TextView X3;
		final TextView X4;
		final TextView turn;
		final TextView guess_positions;

		guess_list = (ArrayList<Guess>) getIntent().getExtras().get("guesses");
		int[] results_list = { 0, 0, 0, 0 };
		Log.e("TEST", "" + guess_list.size());
		updateList();

		guess.v1 = code.int1;
		guess.v2 = code.int2;
		guess.v3 = code.int3;
		guess.v4 = code.int4;

		// test = (Button) findViewById(R.id.try_again);

		/*test.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openCode = new Intent(d, code.class);

				Intent data = new Intent();
				data.putExtra("guess", check.this.guess);
				setResult(RESULT_OK, data);
				finish();
				startActivity(openCode);

			}
		});*/
		// home.adventure_time = 1;
	//	text1 = (TextView) findViewById(R.id.text);

	//	X1 = (TextView) findViewById(R.id.X1);
	//	X2 = (TextView) findViewById(R.id.X2);
	//  X3 = (TextView) findViewById(R.id.X3);
	//	X4 = (TextView) findViewById(R.id.X4);
	//	turn = (TextView) findViewById(R.id.turns);
		guess_positions = (TextView) findViewById(R.id.guess_positions);

		final int[] intArray = getIntent().getIntArrayExtra("intArray");

		Integer[] guess_list = { guess.v1, guess.v2, guess.v3, guess.v4 };
		Integer[] home_list = { Level_select.value1, Level_select.value2,
				Level_select.value3, Level_select.value4 };

	//	turn.setText("Turns taken: " + turn_counter + "/7");

		// ----------------------------------------------------------------------------
		// checking the results - START - LOGGING -
		// ----------------------------------------------------------------------------

		Log.e("TEST", guess_list[0] + " " + guess_list[1] + " " + guess_list[2]
				+ " " + guess_list[3]);
		Log.e("TEST", Level_select.value1 + " " + Level_select.value2 + " "
				+ Level_select.value3 + " " + Level_select.value4);
		Log.e("what_where" + one + " " + two + " " + three + " " + four + " "
				+ five + " " + six + ", " + guess_one + " " + guess_two + " "
				+ guess_three + " " + guess_four + " " + guess_five + " "
				+ guess_six, null, null);

		// ----------------------------------------------------------------------------
		// - DIALOG BUILDING -
		// ----------------------------------------------------------------------------

		final AlertDialog victory = new AlertDialog.Builder(d).create();

		victory.setMessage("Congrats, you won!");
		victory.setTitle("You wonnnnn");
		victory.setCanceledOnTouchOutside(true);

		final AlertDialog no_turns = new AlertDialog.Builder(d).create();

		no_turns.setMessage("Sorry, but you ran out of turns!");
		no_turns.setTitle("You ran out of turns.");
		no_turns.setCanceledOnTouchOutside(true);

		// ------------------------------------------------------------------------------
		// Cross referencing guesses with rnd numbers, making use of
		// what_where()
		// ------------------------------------------------------------------------------

		if (Arrays.asList(home_list).contains(guess_list[0])) {
			if (code.int1 == Level_select.value1) {
				X1.setText("V");
				results_list[0] = 2;
				guess.c1 = GuessStatus.V;
			}

			else {

				X1.setText("S");
				guess.c1 = GuessStatus.S;
				results_list[0] = 1;

			}
		} else {

			X1.setText("X");
			guess.c1 = GuessStatus.X;
			results_list[0] = 0;

		}

		if (Arrays.asList(home_list).contains(guess_list[1])) {
			if (code.int2 == Level_select.value2) {
				X2.setText("V");

				guess.c2 = GuessStatus.V;
				results_list[1] = 2;
			}

			else {

				X2.setText("S");
				guess.c2 = GuessStatus.S;
				results_list[1] = 1;

			}
		} else {

			X2.setText("X");
			guess.c2 = GuessStatus.X;
			results_list[1] = 0;

		}

		if (Arrays.asList(home_list).contains(guess_list[2])) {
			if (code.int3 == Level_select.value3) {
				X3.setText("V");

				guess.c3 = GuessStatus.V;
				results_list[2] = 2;
			}

			else {

				X3.setText("S");
				guess.c3 = GuessStatus.S;
				results_list[2] = 1;

			}
		} else {

			X3.setText("X");
			guess.c3 = GuessStatus.X;
			results_list[2] = 0;

		}

		if (Arrays.asList(home_list).contains(guess_list[3])) {
			if (code.int4 == Level_select.value4) {
				X4.setText("V");

				guess.c4 = GuessStatus.V;
				results_list[3] = 2;
			}

			else {

				X4.setText("S");
				guess.c4 = GuessStatus.S;
				results_list[3] = 1;

			}
		} else {

			X4.setText("X");
			guess.c4 = GuessStatus.X;
			results_list[3] = 0;

		}
		// ------------------------------------------------------------------------------------------
		// awarding, checking medals etc
		// -------------------------------------------------------------------------------------------

		if (turn_counter == 7 || turn_counter > 7) {
			test.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					Log.e("loser", "working");
					Intent openCode = new Intent(d, GLxmlTest.class);
					startActivity(openCode);

				}
			});
			test.setText("loser");
			Level_select.level1Score--;

		}

		// checking for victory
		if (guess.c1 == GuessStatus.V && guess.c2 == GuessStatus.V
				&& guess.c3 == GuessStatus.V && guess.c4 == GuessStatus.V) {
			Level_select.level1Score++;

			// Is the virgin medal applicable here?
			String Virgin_medal = "";
			if (Medals.medal_counter1 == 0) {
				Virgin_medal = "				" + " " + getString(R.string.medal_virgin)
						+ ", ";

				Medals.medal1 = true;
				Medals.medal_counter1++;
			}

			// Is the quick grip medal applicable here?
			String Quick_grip_medal = "";
			if (turn_counter == 5 || turn_counter < 5
					&& Medals.medal_counter2 == 0) {
				Quick_grip_medal = " " + getString(R.string.medal_quick_grip)
						+ ", ";

				Medals.medal2 = true;
				Medals.medal_counter2++;
			}

			victory.setMessage("you won my game! " + Virgin_medal
					+ Quick_grip_medal);

			text1.setText(Arrays.toString(intArray));
			victory.show();
			test.setText("Victory");

			test.setOnClickListener(new View.OnClickListener() {

				public void onClick(View v) {
					Intent openCode = new Intent(d, GLxmlTest.class);
					// home.adventure_time = 0;
					openCode.putExtra("guess", check.this.guess);
					setResult(RESULT_OK, openCode);
					finish();
					startActivity(openCode);

				}
			});

		} else {
			text1.setText(Arrays.toString(intArray));

		}

		updateList();
	}

	public GuessStatus[] updateList() {
		// LayoutInflater inflater = (LayoutInflater)
		// getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		/*
		 * for (Guess g : guess_list) {
		 * 
		 * View stub = inflater.inflate(R.layout.guess_stub, null);
		 * 
		 * ((TextView) stub.findViewById(R.id.guess)).setText(g.v1 + ", " + g.v2
		 * + ", " + g.v3 + "," + g.v4); ((TextView)
		 * stub.findViewById(R.id.guess_positions)).setText(g.c1 + "," + g.c2 +
		 * "," + g.c3 + "," + g.c4.toString()); ((ViewGroup)
		 * findViewById(R.id.scroll_layout)).addView(stub); }
		 */

		GuessStatus[] arrayResults = { guess.c1, guess.c2, guess.c3, guess.c4 };

		return arrayResults;
	}

	public int[] getResults() {
		return results_list;
	}
}
