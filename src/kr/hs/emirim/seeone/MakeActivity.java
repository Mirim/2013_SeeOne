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
import android.widget.TextView;

public class MakeActivity extends Activity implements OnTouchListener{
	Intent intent;
	Button mSideboard;
	Button mOpenSideboard;
	ImageView mGrinder1;
	ImageView mGrinder2;
	Button mRefrigerator;
	Button mOpenRefrigerator;
	ImageView mHandler;
	ImageView mHandler1;
	ImageView mHandler2;
	ImageView mHandler3;
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
	ImageView mShotcup;
	ImageView mShotMachine1;
	ImageView mShotMachine2;
	TextView mShot;
	TextView mHotW;
	TextView mMlik;
	TextView mChoco;
	TextView mMlikB;
	TextView mVanilla;
	TextView mWhipping;
	TextView mCinnamon;
	TextView mCaramel;

	String choice;
	Display mDisplay;
	int width;
	int i=2;
	int ok;

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

		mShot=(TextView)findViewById(R.id.re_shot);
		mHotW=(TextView)findViewById(R.id.re_hotw);
		mMlik=(TextView)findViewById(R.id.re_mlik);
		mChoco=(TextView)findViewById(R.id.re_choco);
		mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
		mVanilla=(TextView)findViewById(R.id.re_vanilla);
		mWhipping=(TextView)findViewById(R.id.re_whipping);
		mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
		mCaramel=(TextView)findViewById(R.id.re_caramel);
		mHotW.setVisibility(View.INVISIBLE);
		mMlik.setVisibility(View.INVISIBLE);
		mChoco.setVisibility(View.INVISIBLE);
		mMlikB.setVisibility(View.INVISIBLE);
		mVanilla.setVisibility(View.INVISIBLE);
		mWhipping.setVisibility(View.INVISIBLE);
		mCinnamon.setVisibility(View.INVISIBLE);
		mCaramel.setVisibility(View.INVISIBLE);

		intent = getIntent();
		choice = intent.getStringExtra("choice");

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
		else{}

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
			mHandler1=(ImageView)findViewById(R.id.handler1);
			mHandler2=(ImageView)findViewById(R.id.handler2);
			mHandler3=(ImageView)findViewById(R.id.handler3);
			mHandler1.setVisibility(View.INVISIBLE);
			mHandler2.setVisibility(View.INVISIBLE);
			mHandler3.setVisibility(View.INVISIBLE);
			mHandler.setOnTouchListener(this);
			mGrinder1.setOnTouchListener(this);
			mGrinder2.setOnTouchListener(this);
			mGrinder2.setVisibility(View.INVISIBLE);
			mNextBut=(ImageView)findViewById(R.id.next_but);
			mNextBut.setVisibility(View.INVISIBLE);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			
			intent = getIntent();
			choice = intent.getStringExtra("choice");

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
			else{}
			break;
		case R.id.bBean :
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

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			
			intent = getIntent();
			choice = intent.getStringExtra("choice");

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
			else{}
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
			mShotcup=(ImageView)findViewById(R.id.shotcup);
			mShotMachine1=(ImageView)findViewById(R.id.machineshot1);
			mShotMachine2=(ImageView)findViewById(R.id.machineshot2);
			mShotMachine1.setVisibility(View.INVISIBLE);
			mShotMachine2.setVisibility(View.INVISIBLE);
			mMHandler.setOnTouchListener(this);
			mShotcup.setOnTouchListener(this);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			
			intent = getIntent();
			choice = intent.getStringExtra("choice");

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
			else{}
			break;
		case R.id.machine_but :
			mMachine2.setVisibility(View.INVISIBLE);
			mShotMachine1.setVisibility(View.VISIBLE);
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
		switch (i) {
		case 4 :
			mHandler.setVisibility(View.INVISIBLE);
			mHandler1.setX((float)(width *0.33));
			mHandler1.setVisibility(View.VISIBLE);
			break;
		case 7 :
			mHandler2.setX((float)(width *0.33));
			mHandler2.setVisibility(View.VISIBLE);
			break;
		case 11 :
			mHandler3.setX((float)(width *0.33));
			mHandler3.setVisibility(View.VISIBLE);
			mNextBut.setVisibility(View.VISIBLE);
			break;
		}
		if(v==mMHandler){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mMHandler.setVisibility(View.INVISIBLE);
				mMachine2.setVisibility(View.VISIBLE);
				ok=1;
			}
		}
		if(ok==1 && v==mShotcup){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mShotcup.setVisibility(View.INVISIBLE);
			}
		}
		return true;
	}
}