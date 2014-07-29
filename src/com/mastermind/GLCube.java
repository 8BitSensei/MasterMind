package com.mastermind;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.opengles.GL10;

import android.app.Activity;
import android.content.Context;

public class GLCube extends Activity{
	
	// index of vertices on our surface view
	

	private float vertices[] = {
			1, 1, -1, // p0-top front right
			1, -1, -1, // p1-bottom front right
			-1, -1, -1, // p2-bottom front left
			-1, 1, -1, // p3-front top left
			1, 1, 1, // p4-top back right
			1, -1, 1, // p5-bottom back right
			-1, -1, 1, // p6-bottom back left
			-1, 1, 1 // p7-front back left

	};

	// Buffer for our vertices
	private FloatBuffer vertBuff;

	// Index for our points e.g. p0 = 0f, 1f, in vert Index
	private short[] pIndex = { 
			3, 4, 0,
			0, 4, 1,
			3, 0, 1,
			3, 7, 4,
			7, 6, 4,
			7, 3, 6,
			3, 1, 2,
			1, 6, 2,
			6, 3, 2,
			1, 4, 5,
			5, 6, 1,
			6, 5, 4 
			};

	// Buffer for points index
	private ShortBuffer pBuff;

	// Triangle constructor
	public GLCube() {
		
		// Construction of vertices
		// byte buffer for vertices
		ByteBuffer bBuff = ByteBuffer.allocateDirect(vertices.length * 4);
		bBuff.order(ByteOrder.nativeOrder());
		vertBuff = bBuff.asFloatBuffer();
		vertBuff.put(vertices);
		vertBuff.position(0);

		// Construction of points
		// point byte buffer
		ByteBuffer pointByteBuff = ByteBuffer.allocateDirect(pIndex.length * 2);
		pointByteBuff.order(ByteOrder.nativeOrder());
		pBuff = pointByteBuff.asShortBuffer();
		pBuff.put(pIndex);
		pBuff.position(0);
	}
	
	

	public void draw(GL10 gl) {
		
		gl.glFrontFace(GL10.GL_CW);
		gl.glEnable(GL10.GL_CULL_FACE);
		gl.glCullFace(GL10.GL_BACK);
		gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
		gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertBuff);
		gl.glDrawElements(GL10.GL_TRIANGLES, pIndex.length, GL10.GL_UNSIGNED_SHORT, pBuff);
		gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
		gl.glDisable(GL10.GL_CULL_FACE);
	}
	
	

}