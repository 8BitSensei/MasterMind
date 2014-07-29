package com.mastermind;

import java.util.ArrayList;
import java.util.Random;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;

public class Level_select extends Activity {

	public Context h;

	Button home_button;
	Button one;
	Button two;
	Button three;
	TextView text;

	public ArrayList<Integer> random1;
	public ArrayList<Integer> random2;
	public ArrayList<Integer> random3;
	public ArrayList<Integer> random4;

	public static int value1;
	public static int value2;
	public static int value3;
	public static int value4;
	public static int value5;
	public static int value6;
	public static int value7;
	public static int level1Score;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		h = this;

		// makes sure level1Score never goes below zero
		if (level1Score < 0) {
			level1Score = 0;
		}
		if (level1Score > 6) {
			level1Score = 6;
		}

		//Initialising buttons and content view
		setContentView(R.layout.level_select);
		one = (Button) findViewById(R.id.level_one);
		two = (Button) findViewById(R.id.level_two);
		three = (Button) findViewById(R.id.level_three);
		home_button = (Button) findViewById(R.id.home);

		//Media play back
		MediaPlayer mediaPlayer = MediaPlayer.create(h, R.raw.laser2);
		mediaPlayer.setLooping(false);
		mediaPlayer.start();
		
		// change level background to display score
		if (level1Score == 0) {
			one.setBackgroundResource(R.drawable.l1s);
		} else if (level1Score == 1) {
			one.setBackgroundResource(R.drawable.l1s1);
		} else if (level1Score == 2) {
			one.setBackgroundResource(R.drawable.l1s2);
		} else if (level1Score == 3) {
			one.setBackgroundResource(R.drawable.l1s3);
		} else if (level1Score == 4) {
			one.setBackgroundResource(R.drawable.l1s4);
		} else if (level1Score == 5) {
			one.setBackgroundResource(R.drawable.l1s5);
		} else if (level1Score == 6) {
			one.setBackgroundResource(R.drawable.l1s6);
		}

		one.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// home.adventure_time = 1;
				Intent openLevel1 = new Intent(h, code.class);

				// -------------------------------------------------------------------------------------
				// random number generation for the code.class
				// --------------------------------------------------------------------------------------

				Random a1 = new Random();
				random1 = new ArrayList<Integer>();
				check.fudge = 0;
				for (int index = 0; index < 4; index++) {
					random1.add(a1.nextInt(5) + 1);
					Log.v("AA", "" + random1.get(index));
				}

				value1 = random1.get(0);
				value2 = random1.get(1);
				value3 = random1.get(2);
				value4 = random1.get(3);
				startActivity(openLevel1);

			}
		});

		two.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// home.adventure_time = 2;
				Intent openLevel2 = new Intent(h, Puzzle2.class);

				// ------------------------------------------------------------------------------------------
				// random numbergeneration for the code_harderx1.class
				// -------------------------------------------------------------------------------------------

				Random a1 = new Random();
				random1 = new ArrayList<Integer>();

				for (int index = 0; index < 7; index++) {
					random1.add(a1.nextInt(5) + 1);
					Log.v("BB", "" + random1.get(index));
				}

				value1 = random1.get(0);
				value2 = random1.get(1);
				value3 = random1.get(2);
				value4 = random1.get(3);
				value5 = random1.get(4);
				value6 = random1.get(5);
				value7 = random1.get(6);

				startActivity(openLevel2);

			}
		});

		three.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent open3D = new Intent(h,  GLxmlTest.class);
				startActivity(open3D);

			}
		});

		home_button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openHome = new Intent(h, GLCubeEx.class);
				startActivity(openHome);

			}
		});

	}

}
