package com.mastermind;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;

public class GLxmlTest extends Activity {

	/*public boolean onTouchEvent(MotionEvent event) {
=======
/*	public boolean onTouchEvent(MotionEvent event) {
>>>>>>> 28afe21f18f75e388bba4bcfd848449977446203

		float touchedX = 0;
		float touchedY = 0;

		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			GLCubeRenderer.xAngle = (touchedX - event.getX()) / 2f;
			GLCubeRenderer.yAngle = (touchedY - event.getY()) / 2f;

		} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
			GLCubeRenderer.xAngle = (touchedX - event.getX()) / 2f;
			GLCubeRenderer.yAngle = (touchedY - event.getY()) / 2f;

			touchedX = event.getX();
			touchedY = event.getY();

		}
		return true;
	}*/

	static MediaPlayer mediaPlayer; 
	
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
		setContentView(R.layout.cubelayout);
		final Context context = this;
		
		//media play back
		/*mediaPlayer = MediaPlayer.create(context, R.raw.maintheme);
		mediaPlayer.setLooping(true);
		mediaPlayer.start();*/
		

		final Button btn;
		final Button btn1;
		final Button btn2;

		btn = (Button) findViewById(R.id.btn);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);

		//android.opengl.GLSurfaceView l = (android.opengl.GLSurfaceView) findViewById(R.id.layout1);

		RelativeLayout.LayoutParams paramsd2 = new RelativeLayout.LayoutParams
			(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		paramsd2.leftMargin = 100;
		paramsd2.topMargin = 200;

		RelativeLayout.LayoutParams paramsd = new RelativeLayout.LayoutParams
			(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		paramsd2.leftMargin = 400;
		paramsd2.topMargin = 200;

		//l.setRenderer(new GLCubeRenderer());
		
		btn1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				
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

				Intent openCode = new Intent(context, code.class);
				startActivity(openCode);
				

			}

		});
		
		btn.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent openCode = new Intent(context, Medals.class);
				startActivity(openCode);
				

			}

		});
		
		btn2.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent openCode = new Intent(context, instruction.class);
				startActivity(openCode);
				

			}

		});

	


	}
	public void onPause(){
		super.onPause();
		//mediaPlayer.pause();
		
	}
	
	public void onResume(){
		super.onResume();
	//	mediaPlayer.start();
		
	}

}
