package com.mastermind;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class code_harderx1 extends Activity {

	public Context g;

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
	TextView text6;
	TextView text7;
	
	public static int int1;
	public static int int2;
	public static int int3;
	public static int int4;
	public static int int5;
	public static int int6;
	public static int int7;
	public static int databasex1;

	

	int[] intArray = new int[4];
	int index = 0;
	int inputs[] = new int[] { R.id.textView1, R.id.textView2, R.id.textView3,R.id.textView4 };
	ArrayList<Guess> guessesx1;

	public void onCretate(Bundle savedInstanceState) {
		
		g = this;
		
		guessesx1 = new ArrayList<Guess>();
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.code_harderx1);
		
		databasex1 = 0;

		// ----------------------------------------------------------------------------------------
		//Button references and Text references go here 
		//-----------------------------------------------------------------------------------------

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
		text5 = (TextView) findViewById(R.id.textView5);
		text6 = (TextView) findViewById(R.id.textView6);
		text7 = (TextView) findViewById(R.id.textView7);
		
		
		
		//--------------------------------------------------------------------------------------
		// This section controls everything to do with clicking what number you choose etc
		//--------------------------------------------------------------------------------------

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
				} else if (index == 2) {
					text5.setText("1");
					intArray[index++] = 1;
					int5 = 1;
				} else if (index == 2) {
					text6.setText("1");
					intArray[index++] = 1;
					int6 = 1;
				} else if (index == 2) {
					text7.setText("1");
					intArray[index++] = 1;
					int7 = 1;
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

				} else if (index == 2) {
					text5.setText("2");
					intArray[index++] = 1;
					int5 = 2;
				} else if (index == 2) {
					text6.setText("2");
					intArray[index++] = 1;
					int6 = 2;
				} else if (index == 2) {
					text7.setText("2");
					intArray[index++] = 1;
					int7 = 2;
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

				} else if (index == 2) {
					text5.setText("3");
					intArray[index++] = 1;
					int5 = 3;
				} else if (index == 2) {
					text6.setText("3");
					intArray[index++] = 1;
					int6 = 3;
				} else if (index == 2) {
					text7.setText("3");
					intArray[index++] = 1;
					int7 = 3;
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

				} else if (index == 2) {
					text5.setText("4");
					intArray[index++] = 1;
					int5 = 4;
				} else if (index == 2) {
					text6.setText("4");
					intArray[index++] = 1;
					int6 = 4;
				} else if (index == 2) {
					text5.setText("4");
					intArray[index++] = 1;
					int5 = 4;
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

				} else if (index == 2) {
					text5.setText("5");
					intArray[index++] = 5;
					int5 = 5;
				} else if (index == 2) {
					text6.setText("5");
					intArray[index++] = 5;
					int6 = 5;
				} else if (index == 2) {
					text7.setText("5");
					intArray[index++] = 5;
					int7 = 5;
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

				} else if (index == 2) {
					text5.setText("6");
					intArray[index++] = 6;
					int5 = 6;
				} else if (index == 2) {
					text6.setText("6");
					intArray[index++] = 6;
					int5 = 6;
				} else if (index == 2) {
					text7.setText("6");
					intArray[index++] = 6;
					int5 = 6;
				}

			}
		});

		
		//---------------------------------------------------------------------------------------------
		// This is where all the chosen date ias passed along to be checked
		//----------------------------------------------------------------------------------------------
		
		
		check_button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openCheck = new Intent(g, check_harderx1.class);
				openCheck.putExtra("intArray", intArray);
				openCheck.putExtra("int1", int1);
				openCheck.putExtra("int2", int2);
				openCheck.putExtra("int3", int3);
				openCheck.putExtra("int4", int4);
				openCheck.putExtra("int5", int5);
				openCheck.putExtra("int6", int6);
				openCheck.putExtra("int7", int7);
				openCheck.putExtra("guesses", guessesx1);
			
				
				databasex1++;
				check_harderx1.fudgex1++;
				startActivityForResult(openCheck, 1234);

			}
		});

		home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent openHome = new Intent(g, home.class);
				startActivity(openHome);
			}
		});
	}

	

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		{
			if (resultCode == RESULT_OK) {
				if (data.getExtras() != null) {
					Guess guess = (Guess) data.getExtras().get("guess");
					guessesx1.add(0, guess);
				}
			}
		}
		super.onActivityResult(requestCode, resultCode, data);

	}

}
