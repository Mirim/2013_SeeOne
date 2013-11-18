package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.EventLog.Event;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MakeActivity extends Activity implements OnTouchListener{
	Button mSideboard;
	Button mOpenSideboard;
	ImageView mGrinder1;
	ImageView mGrinder2;
	Button mRefrigerator;
	Button mOpenRefrigerator;
	ImageView mHandler;
	Button mA;
	Button mB;
	ImageView mCup;
	ImageView mCaps;
	ImageView mTCup;
	ImageView mNextBut;
	ImageView mMachine;
	ImageView mMachine2;
	ImageView mMBut;

	Display mDisplay;
	int width;
	int i=2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.make);

		mSideboard=(Button)findViewById(R.id.sideboard);
		mOpenSideboard=(Button)findViewById(R.id.opensideboard);
		mRefrigerator=(Button)findViewById(R.id.refrigerator);
		mOpenRefrigerator=(Button)findViewById(R.id.openrefrigerator);
		mOpenSideboard.setVisibility(View.INVISIBLE);
		mOpenRefrigerator.setVisibility(View.INVISIBLE);
		mA=(Button)findViewById(R.id.aBean);
		mB=(Button)findViewById(R.id.bBean);
		mA.setVisibility(View.INVISIBLE);
		mB.setVisibility(View.INVISIBLE);
		mCaps=(ImageView)findViewById(R.id.caps);
		mCup=(ImageView)findViewById(R.id.cup);
		mCaps.setVisibility(View.INVISIBLE);
		mCup.setVisibility(View.INVISIBLE);
		mTCup=(ImageView)findViewById(R.id.table_cup);
		mTCup.setVisibility(View.INVISIBLE);
		
		mDisplay=getWindowManager().getDefaultDisplay();
		width=mDisplay.getWidth();
	}

	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.sideboard : 
			mSideboard.setVisibility(View.INVISIBLE);
			mOpenSideboard.setVisibility(View.VISIBLE);
			mA.setVisibility(View.VISIBLE);
			mB.setVisibility(View.VISIBLE);
			mCaps.setVisibility(View.VISIBLE);
			mCup.setVisibility(View.VISIBLE);
			break;
		case R.id.opensideboard :
			mOpenSideboard.setVisibility(View.INVISIBLE);
			mSideboard.setVisibility(View.VISIBLE);
			mA.setVisibility(View.INVISIBLE);
			mB.setVisibility(View.INVISIBLE);
			mCaps.setVisibility(View.INVISIBLE);
			mCup.setVisibility(View.INVISIBLE);
			break;
		case R.id.aBean :
			setContentView(R.layout.grinder);
			mGrinder1=(ImageView)findViewById(R.id.grinder_1);
			mGrinder2=(ImageView)findViewById(R.id.grinder_2);
			mHandler=(ImageView)findViewById(R.id.handler);
			mHandler.setOnTouchListener(this);
			mGrinder1.setOnTouchListener(this);
			mGrinder2.setOnTouchListener(this);
			mGrinder2.setVisibility(View.INVISIBLE);
			mNextBut=(ImageView)findViewById(R.id.next_but);
			mNextBut.setVisibility(View.INVISIBLE);
			break;
		case R.id.bBean :
			setContentView(R.layout.grinder);
			mGrinder1=(ImageView)findViewById(R.id.grinder_1);
			mGrinder2=(ImageView)findViewById(R.id.grinder_2);
			mHandler.setOnTouchListener(this);
			mGrinder1.setOnTouchListener(this);
			mGrinder2.setOnTouchListener(this);
			mGrinder2.setVisibility(View.INVISIBLE);
			mNextBut=(ImageView)findViewById(R.id.next_but);
			mNextBut.setVisibility(View.INVISIBLE);
			break;
		case R.id.refrigerator :
			mRefrigerator.setVisibility(View.INVISIBLE);
			mOpenRefrigerator.setVisibility(View.VISIBLE);
			break;
		case R.id.openrefrigerator :
			mOpenRefrigerator.setVisibility(View.INVISIBLE);
			mRefrigerator.setVisibility(View.VISIBLE);
			break;
		case R.id.cup :
			mTCup.setVisibility(View.VISIBLE);
			break;
		case R.id.next_but :
			setContentView(R.layout.coffeemachine);
			mMachine=(ImageView)findViewById(R.id.machine);
			mMachine2=(ImageView)findViewById(R.id.machine2);
			mMBut=(ImageView)findViewById(R.id.machine_but);
			mMachine2.setVisibility(View.INVISIBLE);
			break;
		case R.id.machine_but :
			mMachine.setVisibility(View.INVISIBLE);
			mMachine2.setVisibility(View.VISIBLE);
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if(v==mHandler){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mHandler.setX((float)(width *0.33));
			}
		}
		if(v==mGrinder1){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				v=mGrinder1;
				mGrinder1.setVisibility(View.INVISIBLE);
				mGrinder2.setVisibility(View.VISIBLE);
				i++;
			}
			else if(event.getAction()==MotionEvent.ACTION_UP){
				v=mGrinder2;
				mGrinder2.setVisibility(View.INVISIBLE);
				mGrinder1.setVisibility(View.VISIBLE);
			}
		}
		if(i>=6){
			mNextBut.setVisibility(View.VISIBLE);
		}
		return true;
	}
}