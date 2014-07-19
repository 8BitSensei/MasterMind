package com.mastermind;

import javax.microedition.khronos.egl.EGLConfig;

import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLU;
import android.os.SystemClock;



public class GLCubeRenderer implements Renderer {

	private GLCube cube = new GLCube();
	static Context context;
	public static float xAngle;

	public static float yAngle;

	final float[] ambient = { 0.1f, 1, 1, 1 };
	final float[] position = { 45, 20, 0, 1 };
	final float[] direction = { 0, -1, 0 };

	public GLCubeRenderer() {
		cube = new GLCube();
		
		

	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		// TODO Auto-generated method stub
		gl.glDisable(GL10.GL_DITHER);
		gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_FASTEST);
		gl.glEnable(GL10.GL_LIGHT1);
		gl.glLightfv(GL10.GL_LIGHT1, GL10.GL_DIFFUSE, ambient, 0);
		gl.glLightfv(GL10.GL_LIGHT1, GL10.GL_POSITION, position, 0);
		gl.glLightfv(GL10.GL_LIGHT1, GL10.GL_SPOT_DIRECTION, direction, 0);
		gl.glLightf(GL10.GL_LIGHT1, GL10.GL_SPOT_CUTOFF, 30.0f);
		gl.glClearColor(.0f, 0, .0f, 0);
		gl.glClearDepthf(1f);
		

	}

	@Override
	public void onDrawFrame(GL10 gl) {
		// TODO Auto-generated method stub
		gl.glDisable(GL10.GL_DITHER);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);

		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadIdentity();
		GLU.gluLookAt(gl, 0, 0, -5, 0, 0, 0, 0, 2, 0);
		
		long time = SystemClock.uptimeMillis()% 4000L;
		float angle = .090f*((int)time);

		gl.glRotatef(angle, yAngle, xAngle, xAngle);
		// gl.glRotatef(yAngle, yAngle, 0, yAngle);
		
		gl.glActiveTexture(GL10.GL_TEXTURE0);
		gl.glTexEnvx(GL10.GL_TEXTURE_ENV, GL10.GL_TEXTURE_ENV_MODE, GL10.GL_MODULATE);
		gl.glTexParameterx(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_S, GL10.GL_REPEAT);
		gl.glTexParameterx(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_WRAP_T, GL10.GL_REPEAT);

		cube.draw(gl);
	}
	
	

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		// TODO Auto-generated method stub
		gl.glViewport(0, 0, width, height);
		float ratio = (float) width / height;
		gl.glMatrixMode(GL10.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glFrustumf(-ratio, ratio, -1, 1f, 1.5f, 25);

	}

}