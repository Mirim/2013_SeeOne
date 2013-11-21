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
	ImageView mGrinder3;
	ImageView mGrinder4;
	ImageView mGrinder5;
	ImageView mGrinder6;
	ImageView mGrinder7;
	ImageView mGrinder8;
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
	ImageView mMachine3;
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
		if(choice.equals("�Ƹ޸�ī��")){
			mHotW.setVisibility(View.VISIBLE);
		}else if(choice.equals("ī���")){
			mMlik.setVisibility(View.VISIBLE);
		}else if(choice.equals("ī���ī")){
			mMlik.setVisibility(View.VISIBLE);
			mChoco.setVisibility(View.VISIBLE);
			mWhipping.setVisibility(View.VISIBLE);
		}else if(choice.equals("īǪġ��")){
			mMlik.setVisibility(View.VISIBLE);
			mMlikB.setVisibility(View.VISIBLE);
			mCinnamon.setVisibility(View.VISIBLE);
		}else if(choice.equals("ī��Ḷ���ƶ�")){
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
			mGrinder3=(ImageView)findViewById(R.id.grinder_3);
			mGrinder4=(ImageView)findViewById(R.id.grinder_4);
			mGrinder5=(ImageView)findViewById(R.id.grinder_5);
			mGrinder6=(ImageView)findViewById(R.id.grinder_6);
			mGrinder7=(ImageView)findViewById(R.id.grinder_7);
			mGrinder8=(ImageView)findViewById(R.id.grinder_8);
			mHandler=(ImageView)findViewById(R.id.handler);
			mGrinder2.setVisibility(View.INVISIBLE);
			mGrinder3.setVisibility(View.INVISIBLE);
			mGrinder4.setVisibility(View.INVISIBLE);
			mGrinder5.setVisibility(View.INVISIBLE);
			mGrinder6.setVisibility(View.INVISIBLE);
			mGrinder7.setVisibility(View.INVISIBLE);
			mGrinder8.setVisibility(View.INVISIBLE);
			mHandler.setOnTouchListener(this);
			mGrinder1.setOnTouchListener(this);
			mGrinder2.setOnTouchListener(this);
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
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
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
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
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
			mMachine3=(ImageView)findViewById(R.id.machine3);
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
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
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
				mHandler.setVisibility(View.INVISIBLE);
			}
		}
		if(v==mGrinder1){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				switch (i) {
				case 0 : case 2 :
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.VISIBLE);
					i++;
					break;
				case 4 : case 6 :
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.VISIBLE);
					i++;
					break;
				case 8 : case 10 :
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					mGrinder6.setVisibility(View.VISIBLE);
					i++;
					break;
				case 12 : case 14 : 
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					mGrinder6.setVisibility(View.INVISIBLE);
					mGrinder7.setVisibility(View.INVISIBLE);
					mGrinder8.setVisibility(View.VISIBLE);
					i++;
					break;
				}	
			}
			else if(event.getAction()==MotionEvent.ACTION_UP){
				switch (i) {
				case 1 : case 3 :
					mGrinder1.setVisibility(View.VISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					i++;
					break;
				case 5 : case 7 :
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.VISIBLE);
					i++;
					break;
				case 9 : case 11 :
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.VISIBLE);
					mGrinder6.setVisibility(View.INVISIBLE);
					i++;
					break;
				case 13 : case 15 : 
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					mGrinder6.setVisibility(View.INVISIBLE);
					mGrinder7.setVisibility(View.VISIBLE);
					mGrinder8.setVisibility(View.INVISIBLE);
					i++;
				case 16 : 
					mNextBut.setVisibility(View.VISIBLE);
					break;
				}
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
					mMachine3.setVisibility(View.VISIBLE);
				}
			}
		}
		return true;
	}
}