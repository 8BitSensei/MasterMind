package com.mastermind;

import java.util.ArrayList;
import java.util.Random;
import com.mastermind.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;


public class home extends Activity {
	Button Code;
	Button instruct;
	Button saved_game;
	Button medals;
	HorizontalScrollView myView;
	public Context b;

	public static int value1;
	public static int value2;
	public static int value3;
	public static int value4;
	public ArrayList<Integer> random1;
	public static int adventure_time;
	

	public void onCreate(Bundle savedInstanceState) {
		b = this;
		
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);

		int width = 	metrics.heightPixels;
		int height =	metrics.widthPixels;
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Code = (Button) findViewById(R.id.game_button);
		instruct = (Button) findViewById(R.id.instruct_button);
		saved_game = (Button) findViewById(R.id.saved_game);
		medals = (Button) findViewById(R.id.medals);
		myView = (HorizontalScrollView)findViewById(R.id.scroll_home);
		
	Log.e("DIMENSIONS", "X = " +width+ " Y = "+height);
		

		
		
		if (adventure_time == 0){check.turn_counter = 0;}

		if (adventure_time == 1) {
			saved_game.setBackgroundResource(R.drawable.cog_small);

			saved_game.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {

					Intent openCheck = new Intent(b, code.class);
					startActivity(openCheck);
				}

			});
			
			 myView.smoothScrollBy(0, 100);
		}
		if (adventure_time == 2) {
			saved_game.setBackgroundResource(R.drawable.cog_small);

			saved_game.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {

					Intent openCheck = new Intent(b, code_harderx1.class);
					startActivity(openCheck);
				}

			});
		}

		 instruct.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent openInstruct = new Intent(b, instruction.class);
				startActivity(openInstruct);

			}

		});

		medals.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent medal_case = new Intent(b, Medals.class);
				startActivity(medal_case);

			}

		});

		Code.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent openCode = new Intent(b, Level_select.class);
				// adventure_time checks whether there is a saved game already,
				// if 1, saved game,
				adventure_time = 0;
				startActivity(openCode);

			}

		});

	}

}
