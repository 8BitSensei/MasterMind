package com.mastermind;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;

public class GLxmlTest extends Activity {

	public boolean onTouchEvent(MotionEvent event) {

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
	}

	static MediaPlayer mediaPlayer; 	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cubelayout);
		final Context context = this;
		
		//media play back
		mediaPlayer = MediaPlayer.create(context, R.raw.maintheme);
		mediaPlayer.setLooping(true);
		mediaPlayer.start();
		

		final Button btn;
		final Button btn1;
		final Button btn2;

		btn = (Button) findViewById(R.id.btn);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);

		android.opengl.GLSurfaceView l = (android.opengl.GLSurfaceView) findViewById(R.id.layout1);

		RelativeLayout.LayoutParams paramsd2 = new RelativeLayout.LayoutParams
			(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		paramsd2.leftMargin = 100;
		paramsd2.topMargin = 200;

		RelativeLayout.LayoutParams paramsd = new RelativeLayout.LayoutParams
			(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		paramsd2.leftMargin = 400;
		paramsd2.topMargin = 200;

		l.setRenderer(new GLCubeRenderer());
		
		btn1.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent openCode = new Intent(context, Level_select.class);
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
		mediaPlayer.pause();
		
	}
	
	public void onResume(){
		super.onResume();
		mediaPlayer.start();
		
	}

}
