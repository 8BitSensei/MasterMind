package com.mastermind;

import java.util.ArrayList;

import com.mastermind.Guess.GuessStatus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class code extends Activity {
	public Context c;
	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button check_button;
	Button home;
	TextView text1;
	TextView text2;
	TextView text3;
	TextView text4;
	TextView text5;
	public static int int1;
	public static int int2;
	public static int int3;
	public static int int4;
	public static int database;

	int[] intArray = new int[4];
	int index = 0;
	int inputs[] = new int[] { R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4 };
	ArrayList<Guess> guesses;

	public void onCreate(final Bundle savedInstanceState) {
		c = this;
		guesses = new ArrayList<Guess>();
		setContentView(R.layout.game);
		super.onCreate(savedInstanceState);

		MediaPlayer mediaPlayer = MediaPlayer.create(c, R.raw.laser2);
		mediaPlayer.setLooping(false);
		mediaPlayer.start();

		database = 0;

		one = (Button) findViewById(R.id.button1);
		two = (Button) findViewById(R.id.button2);
		three = (Button) findViewById(R.id.button3);
		four = (Button) findViewById(R.id.button4);
		five = (Button) findViewById(R.id.button5);
		six = (Button) findViewById(R.id.button6);
		check_button = (Button) findViewById(R.id.button7);
		home = (Button) findViewById(R.id.buttonHome);

		text1 = (TextView) findViewById(R.id.textView1);
		text2 = (TextView) findViewById(R.id.textView2);
		text3 = (TextView) findViewById(R.id.textView3);
		text4 = (TextView) findViewById(R.id.textView4);

		one.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (index == 0) {
					text1.setText("1");
					intArray[index++] = 1;
					int1 = 1;
				} else if (index == 1) {
					text2.setText("1");
					intArray[index++] = 1;
					int2 = 1;
				} else if (index == 2) {
					text3.setText("1");
					intArray[index++] = 1;
					int3 = 1;
				} else if (index == 3) {
					text4.setText("1");
					intArray[index++] = 1;
					int4 = 1;
				}

			}

		});

		two.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (index == 0) {
					text1.setText("2");
					int1 = 2;
					intArray[index++] = 2;
				} else if (index == 1) {
					text2.setText("2");
					int2 = 2;
					intArray[index++] = 2;
				} else if (index == 2) {
					text3.setText("2");
					int3 = 2;
					intArray[index++] = 2;
				} else if (index == 3) {
					text4.setText("2");
					int4 = 2;
					intArray[index++] = 2;

				}

			}
		});

		three.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (index == 0) {
					text1.setText("3");
					int1 = 3;
					intArray[index++] = 3;
				} else if (index == 1) {
					text2.setText("3");
					int2 = 3;
					intArray[index++] = 3;
				} else if (index == 2) {
					text3.setText("3");
					int3 = 3;
					intArray[index++] = 3;
				} else if (index == 3) {
					text4.setText("3");
					int4 = 3;
					intArray[index++] = 3;

				}

			}
		});

		four.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (index == 0) {
					text1.setText("4");
					int1 = 4;
					intArray[index++] = 4;
				} else if (index == 1) {
					text2.setText("4");
					int2 = 4;
					intArray[index++] = 4;
				} else if (index == 2) {
					text3.setText("4");
					int3 = 4;
					intArray[index++] = 4;
				} else if (index == 3) {
					text4.setText("4");
					int4 = 4;
					intArray[index++] = 4;

				}

			}
		});

		five.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (index == 0) {
					text1.setText("5");
					int1 = 5;
					intArray[index++] = 5;
				} else if (index == 1) {
					text2.setText("5");
					int2 = 5;
					intArray[index++] = 5;
				} else if (index == 2) {
					text3.setText("5");
					int3 = 5;
					intArray[index++] = 5;
				} else if (index == 3) {
					text4.setText("5");
					int4 = 5;
					intArray[index++] = 5;

				}

			}
		});

		six.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				if (index == 0) {
					text1.setText("6");
					int1 = 6;
					intArray[index++] = 6;
				} else if (index == 1) {
					text2.setText("6");
					int2 = 6;
					intArray[index++] = 6;
				} else if (index == 2) {
					text3.setText("6");
					int3 = 6;
					intArray[index++] = 6;
				} else if (index == 3) {
					text4.setText("6");
					int4 = 6;
					intArray[index++] = 6;

				}

			}
		});

		check_button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				
				check checkOne = new check();
				
				checkOne.getResults();
				

				 check originOne = new check(savedInstanceState);
				 
				 GuessStatus[] arrayResults = originOne.updateList();
				 
				 if(arrayResults[0] == GuessStatus.V)
				 {
					 text1.setText("X"); 
				 }
				 if(arrayResults[0] == GuessStatus.S)
				 {
					 text1.setText("S");
				 }
				 if(arrayResults[0] == GuessStatus.X)
				 {
					 text1.setText("V");
				 }
				 
				 if(arrayResults[1] == GuessStatus.V)
				 {
					 text2.setText("X");
				 }
				 if(arrayResults[1] == GuessStatus.S)
				 {
					 text2.setText("S");
				 }
				 if(arrayResults[1] == GuessStatus.X)
				 {
					 text2.setText("V");
				 }
				 
				 if(arrayResults[2] == GuessStatus.V)
				 {
					 text3.setText("X");
				 }
				 if(arrayResults[2] == GuessStatus.S)
				 {
					 text3.setText("S");
				 }
				 if(arrayResults[2] == GuessStatus.X)
				 {
					 text3.setText("V");
				 }
				 
				 if(arrayResults[3] == GuessStatus.V)
				 {
					 text4.setText("X");
				 }
				 if(arrayResults[3] == GuessStatus.S)
				 {
					 text4.setText("S");
				 }
				 if(arrayResults[3] == GuessStatus.X)
				 {
					 text4.setText("V");
				 }


			}
		});

	
	}

	@Override
	protected void onRestart() {
		super.onRestart();

		text1.setText("X");
		text2.setText("X");
		text3.setText("X");
		text4.setText("X");
		int1 = 0;

		index = 0;
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// if (requestCode == 1234)
		{
			if (resultCode == RESULT_OK) {
				if (data.getExtras() != null) {
					Guess guess = (Guess) data.getExtras().get("guess");
					guesses.add(0, guess);
				}
			}
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
}
