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
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MakeActivity extends Activity implements OnTouchListener{
	Intent intent;
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
	ImageView mMHandler;
	CheckBox mShot;
	CheckBox mHotW;
	CheckBox mMlik;
	CheckBox mChoco;
	CheckBox mMlikB;
	CheckBox mVanilla;
	CheckBox mWhipping;
	CheckBox mCinnamon;
	CheckBox mCaramel;

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
		
		mShot=(CheckBox)findViewById(R.id.re_shot);
		mHotW=(CheckBox)findViewById(R.id.re_hotw);
		mMlik=(CheckBox)findViewById(R.id.re_mlik);
		mChoco=(CheckBox)findViewById(R.id.re_choco);
		mMlikB=(CheckBox)findViewById(R.id.re_mlik_bubble);
		mVanilla=(CheckBox)findViewById(R.id.re_vanilla);
		mWhipping=(CheckBox)findViewById(R.id.re_whipping);
		mCinnamon=(CheckBox)findViewById(R.id.re_cinnamon);
		mCaramel=(CheckBox)findViewById(R.id.re_caramel);
		mHotW.setVisibility(View.INVISIBLE);
		mMlik.setVisibility(View.INVISIBLE);
		mChoco.setVisibility(View.INVISIBLE);
		mMlikB.setVisibility(View.INVISIBLE);
		mVanilla.setVisibility(View.INVISIBLE);
		mWhipping.setVisibility(View.INVISIBLE);
		mCinnamon.setVisibility(View.INVISIBLE);
		mCaramel.setVisibility(View.INVISIBLE);
		
		intent = getIntent();
		String choice = intent.getStringExtra("choice");
		
		intent=new Intent(MakeActivity.this, StartActivity.class);
		if(choice.equals("아메리카노")){
			mHotW.setVisibility(View.VISIBLE);
		}else if(choice.equals("카페라떼")){
			mMlik.setVisibility(View.VISIBLE);
		}else if(choice.equals("카페모카")){
			mMlik.setVisibility(View.VISIBLE);
			mChoco.setVisibility(View.VISIBLE);
			mWhipping.setVisibility(View.VISIBLE);
		}else if(choice.equals("카푸치노")){
			mMlik.setVisibility(View.VISIBLE);
			mMlikB.setVisibility(View.VISIBLE);
			mCinnamon.setVisibility(View.VISIBLE);
		}else if(choice.equals("카라멜마끼아또")){
			mMlik.setVisibility(View.VISIBLE);
			mVanilla.setVisibility(View.VISIBLE);
			mCaramel.setVisibility(View.VISIBLE);
		}
		
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
			mMHandler=(ImageView)findViewById(R.id.machine_handler);
			mMHandler.setOnTouchListener(this);
			break;
		case R.id.machine_but :
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
				mGrinder1.setVisibility(View.INVISIBLE);
				mGrinder2.setVisibility(View.VISIBLE);
				i++;
			}
			else if(event.getAction()==MotionEvent.ACTION_UP){
				mGrinder2.setVisibility(View.INVISIBLE);
				mGrinder1.setVisibility(View.VISIBLE);
			}
		}
		if(i>=6){
			mNextBut.setVisibility(View.VISIBLE);
		}
		if(v==mMHandler){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mMHandler.setVisibility(View.INVISIBLE);
				mMachine2.setVisibility(View.VISIBLE);
			}
		}
		return true;
	}
}