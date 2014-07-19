package com.mastermind;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class Puzzle2 extends Activity {

	ImageView cog;
	ImageView cog1;
	private int PositionA1 = 1;
	private int PositionB1 = 0;
	private int PositionC1 = 0;
	Matrix matrix1;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puzzle2);
		cog = (ImageView) findViewById(R.id.puzzle2_cog1);
		cog1 = (ImageView) findViewById(R.id.puzzle2_cog2);
		matrix1 = new Matrix();
		cog.setScaleType(ScaleType.MATRIX);
		cog1.setScaleType(ScaleType.MATRIX);// required
		matrix1.postRotate((float) 5, 2, 3);

	}

	final void rotation(int cogPosition, Animation rotate, Animation positionB, Animation positionC, Animation positionD, int id, ImageView object) {

		findViewById(id).startAnimation(rotate);
		rotate.start();
		cogPosition++;

		if (cogPosition == 1) {
			object.setBackgroundResource(R.drawable.cog_rotate2);

		}

		if (cogPosition == 2) {
			object.setBackgroundResource(R.drawable.cog_rotate3);

		}

		if (cogPosition == 3) {
			object.setBackgroundResource(R.drawable.cog_rotate4);

		}

		if (cogPosition > 3) {
			cogPosition = 0;
		}

	}

	public void onStart() {
		super.onStart();

		final Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
		final Animation positionB = AnimationUtils.loadAnimation(this, R.anim.positionb);
		final Animation positionC = AnimationUtils.loadAnimation(this, R.anim.positionc);
		final Animation positionD = AnimationUtils.loadAnimation(this, R.anim.positiond);

		cog.setOnClickListener(new View.OnClickListener() {
			int positionA1 = 0;

			@Override
			public void onClick(View v) {

				findViewById(R.id.puzzle2_cog1).startAnimation(rotate);
				// rotate.start();
				positionA1++;

				if (rotate.hasEnded() == true) {
					cog.setBackgroundResource(R.drawable.cog_rotate3);

				}

				/*
				 * if (positionA1 == 1 && rotate.hasEnded()) {
				 * cog.setBackgroundResource(R.drawable.cog_rotate2);
				 * 
				 * 
				 * }
				 * 
				 * if (positionA1 == 2 && rotate.hasEnded()) {
				 * cog.setBackgroundResource(R.drawable.cog_rotate3);
				 * 
				 * 
				 * }
				 * 
				 * if (positionA1 == 3 && rotate.hasEnded()) {
				 * cog.setBackgroundResource(R.drawable.cog_rotate4);
				 * 
				 * 
				 * }
				 * 
				 * if (positionA1 == 4 && rotate.hasEnded()) {
				 * cog.setBackgroundResource(R.drawable.cog_small);
				 * 
				 * 
				 * } if (positionA1 > 4) { positionA1 = 0; }
				 */

			}
		});
		cog1.setOnClickListener(new View.OnClickListener() {
			int cogBPosition = 0;
			int id = R.id.puzzle2_cog2;

			@Override
			public void onClick(View v) {

				rotation(cogBPosition, rotate, positionB, positionC, positionD, R.id.puzzle2_cog2, cog1);
			}
		});
	}

	public void onResume() {
		super.onResume();
	}

}
