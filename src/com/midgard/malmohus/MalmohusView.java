package com.midgard.malmohus;

import android.view.MotionEvent;
import android.content.Context;
import android.opengl.GLSurfaceView;

public class MalmohusView extends GLSurfaceView
{
	private static final String LOG_TAG = MalmohusView.class.getSimpleName();	
	private MalmohusRenderer _malmohusRenderer;

    public MalmohusView(Context context)
    {
        super(context);
        _malmohusRenderer = new MalmohusRenderer();
        setRenderer(_malmohusRenderer);
    }

    public boolean onTouchEvent(final MotionEvent event) {
    	queueEvent(new Runnable() {
    		public void run() {
    			_malmohusRenderer.setColor(
    				event.getX() / getWidth(), 
    				event.getY() / getHeight(), 
    				event.getY() / getHeight() 
    			);
    		}
    	});
    	return true;
    } 
}
