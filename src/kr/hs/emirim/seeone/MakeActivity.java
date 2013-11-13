package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.EventLog.Event;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MakeActivity extends Activity implements OnTouchListener{
	ImageButton mSideboard;
	ImageButton mOpenSideboard;
	ImageButton mGrinder1;
	ImageButton mGrinder2;
	ImageButton mRefrigerator;
	ImageButton mOpenRefrigerator;
	Button mA;
	Button mB;

	int i=2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.make);

		mSideboard=(ImageButton)findViewById(R.id.sideboard);
		mOpenSideboard=(ImageButton)findViewById(R.id.opensideboard);
		mRefrigerator=(ImageButton)findViewById(R.id.refrigerator);
		mOpenRefrigerator=(ImageButton)findViewById(R.id.openrefrigerator);
		mOpenSideboard.setVisibility(View.INVISIBLE);
		mOpenRefrigerator.setVisibility(View.INVISIBLE);
		mA=(Button)findViewById(R.id.aBean);
		mB=(Button)findViewById(R.id.bBean);
		mA.setVisibility(View.INVISIBLE);
		mB.setVisibility(View.INVISIBLE);
	}
	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.sideboard : 
			mSideboard.setVisibility(View.INVISIBLE);
			mOpenSideboard.setVisibility(View.VISIBLE);
			mA.setVisibility(View.VISIBLE);
			mB.setVisibility(View.VISIBLE);
			break;
		case R.id.aBean :
			setContentView(R.layout.grinder);
			mGrinder1=(ImageButton)findViewById(R.id.grinder_1);
			mGrinder2=(ImageButton)findViewById(R.id.grinder_2);
			mGrinder1.setOnTouchListener(this);
			mGrinder2.setOnTouchListener(this);
			mGrinder2.setVisibility(View.INVISIBLE);
			break;
		case R.id.bBean :
			setContentView(R.layout.grinder);
			mGrinder1=(ImageButton)findViewById(R.id.grinder_1);
			mGrinder2=(ImageButton)findViewById(R.id.grinder_2);
			mGrinder1.setOnTouchListener(this);
			mGrinder2.setOnTouchListener(this);
			mGrinder2.setVisibility(View.INVISIBLE);
			break;
		case R.id.refrigerator :
			mRefrigerator.setVisibility(View.INVISIBLE);
			mOpenRefrigerator.setVisibility(View.VISIBLE);
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if(event.getAction()==MotionEvent.ACTION_DOWN){
			mGrinder1.setVisibility(View.INVISIBLE);
			mGrinder2.setVisibility(View.VISIBLE);
		}
		else if(event.getAction()==MotionEvent.ACTION_UP){
			mGrinder2.setVisibility(View.INVISIBLE);
			mGrinder1.setVisibility(View.VISIBLE);
		}
		i++;
		return true;
	}
}