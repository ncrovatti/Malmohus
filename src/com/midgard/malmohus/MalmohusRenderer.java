package com.midgard.malmohus;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView;

public class MalmohusRenderer implements GLSurfaceView.Renderer 
{
	private static final String LOG_TAG = MalmohusRenderer.class.getSimpleName();	

	private float _r = 0.9f;
	private float _g = 0.2f;
	private float _b = 0.2f;

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {}

	@Override
	public void onSurfaceChanged(GL10 gl, int w, int h) {
		gl.glViewport(0, 0, w, h);
	}

	@Override
	public void onDrawFrame(GL10 gl) {
		gl.glClearColor(_r, _g, _b, 1.0f);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	} 

	public void setColor(float r, float g, float b) {
		_r = r;
		_g = g;
		_b = b;
	}
}
