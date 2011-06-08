package com.midgard.malmohus;

import com.midgard.malmohus.*;
import android.app.Activity;
import android.os.Bundle;

public class Malmohus extends Activity
{
	private static final String LOG_TAG = Malmohus.class.getSimpleName();	
	private MalmohusView _malmohusView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        _malmohusView = new MalmohusView(this);
        setContentView(_malmohusView);
    }
}
