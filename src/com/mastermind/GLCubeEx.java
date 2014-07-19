package com.mastermind;

import android.app.Activity;
import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class GLCubeEx extends Activity {

	GLSurfaceView ourSurface;
	GLCubeEx This = this;
	static boolean place_holder_button;
	
	
	
	public boolean onTouchEvent(MotionEvent event) {

		float touchedX = 0;
		float touchedY = 0;
		place_holder_button = false;
		final Button btn = new Button(This);
		final Button btn1 = new Button(This);
		LinearLayout.LayoutParams paramsd2 = new LinearLayout.LayoutParams
			(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		LinearLayout.LayoutParams paramsd = new LinearLayout.LayoutParams
		(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		paramsd.leftMargin = 500;
		paramsd.topMargin = 500;
		paramsd.height = 60;
		paramsd.width = 200;
		
	
		paramsd2.height = 60;
		paramsd2.width = 400;

		btn.setLayoutParams(paramsd2);
		addContentView(btn, paramsd2);
		
		
	

		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			GLCubeRenderer.xAngle = (touchedX - event.getX()) / 2f;
			GLCubeRenderer.yAngle = (touchedY - event.getY()) / 2f;

		} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
			GLCubeRenderer.xAngle = (touchedX - event.getX()) / 2f;
			GLCubeRenderer.yAngle = (touchedY - event.getY()) / 2f;

			touchedX = event.getX();
			touchedY = event.getY();

		}

		if (GLCubeRenderer.xAngle > -118.00f && GLCubeRenderer.xAngle < -65.00f) {

		
			btn.setText("LEVELS");
			btn.setOnLongClickListener(new View.OnLongClickListener() {

				public boolean onLongClick(View v) {

					Intent openCode = new Intent(This, Level_select.class);
					startActivity(openCode);
					return true;

				}

			});
		}
		if (GLCubeRenderer.xAngle > -201.00f && GLCubeRenderer.xAngle < -119.00f) {

			
			btn.setText("MEDALS");
			btn.setOnLongClickListener(new View.OnLongClickListener() {

				public boolean onLongClick(View v) {

					Intent openHome = new Intent(This, Medals.class);
					startActivity(openHome);
					return true;

				}

			});
		}
		if (GLCubeRenderer.xAngle > -296.00f && GLCubeRenderer.xAngle < -202.00f) {

			
			btn.setText("INSTRUCTIONS");
			btn.setOnLongClickListener(new View.OnLongClickListener() {

				public boolean onLongClick(View v) {

					Intent openHome = new Intent(This, instruction.class);
					startActivity(openHome);
					return true;

				}

			});
		}

		return true;

	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ourSurface = new GLSurfaceView(this);
		ourSurface.setRenderer(new GLCubeRenderer());
		setContentView(ourSurface);
		
	}

	public void onPause() {
		super.onPause();
		ourSurface.onPause();
	}

	public void onResume() {
		super.onResume();
		ourSurface.onResume();
	}

}