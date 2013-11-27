package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.util.EventLog.Event;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
	ImageView mReTwo;
	ImageView mReThree;
	ImageView mReFour;
	ImageView mWhippingC;
	ImageView mMWhippingC;
	ImageView mWhippingMachine;
	ImageView mWhippingMachine2;
	ImageView mWhipping1;
	ImageView mWhipping2;
	ImageView mWhippingView;
	ImageView mShakeWhipping1;
	ImageView mShakeWhipping2;
	ImageView mPushWhipping1;
	ImageView mPushWhipping2;
	ImageView mNextBut2;
	ImageView mFoodMlik;
	ImageView mStreamCup;
	ImageView mOpenMilk;
	ImageView mMilkCup1;
	ImageView mMilkCup2;
	ImageView mMilkView;
	ImageView mNextBut3;
	ImageView mMilkMachine1;
	ImageView mMilkMachine2;
	ImageView mStreamCup2;
	ImageView mWaterMachine1;
	ImageView mWaterMachine2;
	ImageView mWaterMachine3;
	ImageView mWaterCup;
	ImageView mWaterMachineBut;
	ImageView mChocoSy;
	ImageView mValillaSy;
	ImageView mChocodrizzle;
	ImageView mCarameldrizzle;
	ImageView mCinnamonpowder;
	ImageView mFinishBut1;
	ImageView mFinishBut2;
	ImageView mFinishBut3;
	ImageView mFinishBut4;
	ImageView mReOne;
	ImageView mReTwo2;
	ImageView mReThree3;
	ImageView mReFour4;
	ImageView mBean;
	ImageView mTableBean1;
	ImageView mTableBean2;
	ImageView mTableChocosy;
	ImageView mTableValillasy;
	ImageView mTableChocodriz;
	ImageView mTableCarameldriz;
	ImageView mTableCinnamonpow;
	TextView mShot;
	TextView mHotW;
	TextView mMlik;
	TextView mChoco;
	TextView mMlikB;
	TextView mVanilla;
	TextView mWhipping;
	TextView mCinnamon;
	TextView mCaramel;

	Animation alphaAnim;
	AnimationDrawable frameAnim;
	AnimationDrawable milkAnim;
	AnimationDrawable chocosyAnim;
	AnimationDrawable valillasyAnim;
	AnimationDrawable chocodrizAnim;
	AnimationDrawable carameldrizAnim;
	AnimationDrawable cinnamonpowAnim;

	String choice;
	int width;
	int i=2;
	int j=0;
	int ok;
	int ok2;
	int ok3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.make);

		alphaAnim=AnimationUtils.loadAnimation(MakeActivity.this, R.anim.alpha);

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
		mWhippingC=(ImageView)findViewById(R.id.whippingCream);
		mWhippingC.setVisibility(View.INVISIBLE);
		mFoodMlik=(ImageView)findViewById(R.id.mlik);
		mFoodMlik.setVisibility(View.INVISIBLE);
		mChocoSy=(ImageView)findViewById(R.id.chocosyrup);
		mChocoSy.setVisibility(View.INVISIBLE);
		mValillaSy=(ImageView)findViewById(R.id.valillasyrup);
		mValillaSy.setVisibility(View.INVISIBLE);
		mChocodrizzle=(ImageView)findViewById(R.id.chocodrizzle);
		mChocodrizzle.setVisibility(View.INVISIBLE);
		mCarameldrizzle=(ImageView)findViewById(R.id.carameldrizzle);
		mCarameldrizzle.setVisibility(View.INVISIBLE);
		mCinnamonpowder=(ImageView)findViewById(R.id.cinnamonpowder);
		mCinnamonpowder.setVisibility(View.INVISIBLE);
		mBean=(ImageView)findViewById(R.id.bean);
		mBean.setVisibility(View.INVISIBLE);
		mTableBean1=(ImageView)findViewById(R.id.table_bean1);
		mTableBean1.setVisibility(View.INVISIBLE);
		mTableBean2=(ImageView)findViewById(R.id.table_bean2);
		mTableBean2.setVisibility(View.INVISIBLE);
		mTableChocosy=(ImageView)findViewById(R.id.table_chocosy);
		mTableChocosy.setVisibility(View.INVISIBLE);
		mTableValillasy=(ImageView)findViewById(R.id.table_valillasy);
		mTableValillasy.setVisibility(View.INVISIBLE);
		mTableChocodriz=(ImageView)findViewById(R.id.table_chochdri);
		mTableChocodriz.setVisibility(View.INVISIBLE);
		mTableCarameldriz=(ImageView)findViewById(R.id.table_carameldri);
		mTableCarameldriz.setVisibility(View.INVISIBLE);
		mTableCinnamonpow=(ImageView)findViewById(R.id.table_cinnamonpow);
		mTableCinnamonpow.setVisibility(View.INVISIBLE);

		mShot=(TextView)findViewById(R.id.re_shot);
		mHotW=(TextView)findViewById(R.id.re_hotw);
		mMlik=(TextView)findViewById(R.id.re_mlik);
		mChoco=(TextView)findViewById(R.id.re_choco);
		mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
		mVanilla=(TextView)findViewById(R.id.re_vanilla);
		mWhipping=(TextView)findViewById(R.id.re_whipping);
		mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
		mCaramel=(TextView)findViewById(R.id.re_caramel);
		mReTwo=(ImageView)findViewById(R.id.re_two);
		mReThree=(ImageView)findViewById(R.id.re_three);
		mReFour=(ImageView)findViewById(R.id.re_four);
		mReOne=(ImageView)findViewById(R.id.re_one);
		mReTwo2=(ImageView)findViewById(R.id.re_two2);
		mReThree3=(ImageView)findViewById(R.id.re_three3);
		mReFour4=(ImageView)findViewById(R.id.re_four4);
		mHotW.setVisibility(View.INVISIBLE);
		mMlik.setVisibility(View.INVISIBLE);
		mChoco.setVisibility(View.INVISIBLE);
		mMlikB.setVisibility(View.INVISIBLE);
		mVanilla.setVisibility(View.INVISIBLE);
		mWhipping.setVisibility(View.INVISIBLE);
		mCinnamon.setVisibility(View.INVISIBLE);
		mCaramel.setVisibility(View.INVISIBLE);
		mReTwo.setVisibility(View.INVISIBLE);
		mReThree.setVisibility(View.INVISIBLE);
		mReFour.setVisibility(View.INVISIBLE);
		mReOne.setVisibility(View.INVISIBLE);
		mReTwo2.setVisibility(View.INVISIBLE);
		mReThree3.setVisibility(View.INVISIBLE);
		mReFour4.setVisibility(View.INVISIBLE);

		intent = getIntent();
		choice = intent.getStringExtra("choice");

		intent=new Intent(MakeActivity.this, StartActivity.class);
		if(choice.equals("�Ƹ޸�ī��")){
			mHotW.setVisibility(View.VISIBLE);
			mReTwo.setVisibility(View.VISIBLE);
		}else if(choice.equals("ī���")){
			mMlik.setVisibility(View.VISIBLE);
			mReTwo.setVisibility(View.VISIBLE);
		}else if(choice.equals("ī���ī")){
			mMlik.setVisibility(View.VISIBLE);
			mChoco.setVisibility(View.VISIBLE);
			mWhipping.setVisibility(View.VISIBLE);
			mReTwo.setVisibility(View.VISIBLE);
			mReThree.setVisibility(View.VISIBLE);
			mReFour.setVisibility(View.VISIBLE);
		}else if(choice.equals("īǪġ��")){
			mMlik.setVisibility(View.VISIBLE);
			mMlikB.setVisibility(View.VISIBLE);
			mCinnamon.setVisibility(View.VISIBLE);
			mReTwo.setVisibility(View.VISIBLE);
			mReThree.setVisibility(View.VISIBLE);
			mReFour.setVisibility(View.VISIBLE);
		}else if(choice.equals("ī��Ḷ���ƶ�")){
			mMlik.setVisibility(View.VISIBLE);
			mVanilla.setVisibility(View.VISIBLE);
			mCaramel.setVisibility(View.VISIBLE);
			mReTwo.setVisibility(View.VISIBLE);
			mReThree.setVisibility(View.VISIBLE);
			mReFour.setVisibility(View.VISIBLE);
		}
		else{}
	}

	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.sideboard : 
			mSideboard.setVisibility(View.INVISIBLE);
			mOpenSideboard.setVisibility(View.VISIBLE);
			mCaps.setVisibility(View.VISIBLE);
			mCup.setVisibility(View.VISIBLE);
			mChocoSy.setVisibility(View.VISIBLE);
			mValillaSy.setVisibility(View.VISIBLE);
			mChocodrizzle.setVisibility(View.VISIBLE);
			mCarameldrizzle.setVisibility(View.VISIBLE);
			mCinnamonpowder.setVisibility(View.VISIBLE);
			mBean.setVisibility(View.VISIBLE);
			break;
		case R.id.opensideboard :
			mOpenSideboard.setVisibility(View.INVISIBLE);
			mSideboard.setVisibility(View.VISIBLE);
			mCaps.setVisibility(View.INVISIBLE);
			mCup.setVisibility(View.INVISIBLE);
			mChocoSy.setVisibility(View.INVISIBLE);
			mValillaSy.setVisibility(View.INVISIBLE);
			mChocodrizzle.setVisibility(View.INVISIBLE);
			mCarameldrizzle.setVisibility(View.INVISIBLE);
			mCinnamonpowder.setVisibility(View.INVISIBLE);
			mBean.setVisibility(View.INVISIBLE);
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
			mGrinder3.setOnTouchListener(this);
			mGrinder4.setOnTouchListener(this);
			mGrinder5.setOnTouchListener(this);
			mGrinder6.setOnTouchListener(this);
			mGrinder7.setOnTouchListener(this);
			mGrinder8.setOnTouchListener(this);
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
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.bBean :
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
			mGrinder3.setOnTouchListener(this);
			mGrinder4.setOnTouchListener(this);
			mGrinder5.setOnTouchListener(this);
			mGrinder6.setOnTouchListener(this);
			mGrinder7.setOnTouchListener(this);
			mGrinder8.setOnTouchListener(this);
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
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.refrigerator :
			mRefrigerator.setVisibility(View.INVISIBLE);
			mOpenRefrigerator.setVisibility(View.VISIBLE);
			mWhippingC.setVisibility(View.VISIBLE);
			mFoodMlik.setVisibility(View.VISIBLE);
			break;
		case R.id.openrefrigerator :
			mOpenRefrigerator.setVisibility(View.INVISIBLE);
			mRefrigerator.setVisibility(View.VISIBLE);
			mWhippingC.setVisibility(View.INVISIBLE);
			mFoodMlik.setVisibility(View.INVISIBLE);
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
			mMachine3.setVisibility(View.INVISIBLE);
			mShotMachine1=(ImageView)findViewById(R.id.machineshot1);
			mShotMachine2=(ImageView)findViewById(R.id.machineshot2);
			mShotMachine1.setVisibility(View.INVISIBLE);
			mShotMachine2.setVisibility(View.INVISIBLE);
			mFinishBut1=(ImageView)findViewById(R.id.finish_but1);
			mFinishBut1.setVisibility(View.INVISIBLE);
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
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.machine_but :
			mMachine2.setVisibility(View.INVISIBLE);
			mShotMachine1.setVisibility(View.VISIBLE);
			mShotMachine2.startAnimation(alphaAnim);			
			mShotMachine2.setVisibility(View.VISIBLE);
			mFinishBut1.setVisibility(View.VISIBLE);
			break;
		case R.id.whippingCream :
			setContentView(R.layout.whippingcream);
			mMWhippingC=(ImageView)findViewById(R.id.machine_whipping);
			mWhippingMachine=(ImageView)findViewById(R.id.whippingmachine);
			mWhippingMachine2=(ImageView)findViewById(R.id.whippingmachine2);
			mWhipping1=(ImageView)findViewById(R.id.whipping_1);
			mWhipping2=(ImageView)findViewById(R.id.whipping_2);
			mWhippingView=(ImageView)findViewById(R.id.whipping_view);
			mShakeWhipping1=(ImageView)findViewById(R.id.shake_whipping1);
			mShakeWhipping2=(ImageView)findViewById(R.id.shake_whipping2);
			mNextBut2=(ImageView)findViewById(R.id.next_but2);
			mWhippingMachine2.setVisibility(View.INVISIBLE);
			mWhipping1.setVisibility(View.INVISIBLE);
			mWhipping2.setVisibility(View.INVISIBLE);
			mShakeWhipping1.setVisibility(View.INVISIBLE);
			mShakeWhipping2.setVisibility(View.INVISIBLE);
			mNextBut2.setVisibility(View.INVISIBLE);
			mWhippingMachine.setOnTouchListener(this);
			mMWhippingC.setOnTouchListener(this);
			mWhipping2.setOnTouchListener(this);
			mWhippingMachine2.setOnTouchListener(this);
			mShakeWhipping1.setOnTouchListener(this);
			mShakeWhipping2.setOnTouchListener(this);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.next_but2 :
			setContentView(R.layout.whippingcream2);
			mPushWhipping1=(ImageView)findViewById(R.id.push_whipping1);
			mPushWhipping2=(ImageView)findViewById(R.id.push_whipping2);
			mPushWhipping2.setVisibility(View.INVISIBLE);
			mFinishBut2=(ImageView)findViewById(R.id.finish_but2);
			mFinishBut2.setVisibility(View.INVISIBLE);
			mPushWhipping1.setOnTouchListener(this);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.mlik :
			setContentView(R.layout.mlikmake);
			mStreamCup=(ImageView)findViewById(R.id.steamcup);
			mOpenMilk=(ImageView)findViewById(R.id.openmilk);
			mMilkCup1=(ImageView)findViewById(R.id.milkcup1);
			mMilkCup2=(ImageView)findViewById(R.id.milkcup2);
			mMilkView=(ImageView)findViewById(R.id.milkcup_view);
			mNextBut3=(ImageView)findViewById(R.id.next_but3);
			mMilkCup1.setVisibility(View.INVISIBLE);
			mMilkCup2.setVisibility(View.INVISIBLE);
			mNextBut3.setVisibility(View.INVISIBLE);
			mOpenMilk.setOnTouchListener(this);
			mMilkCup2.setOnTouchListener(this);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.next_but3 :
			setContentView(R.layout.milkmachine);
			mMilkMachine1=(ImageView)findViewById(R.id.milk_machine1);
			mMilkMachine2=(ImageView)findViewById(R.id.milk_machine2);
			mStreamCup2=(ImageView)findViewById(R.id.steamcup2);
			mMilkMachine2.setVisibility(View.INVISIBLE);
			mFinishBut3=(ImageView)findViewById(R.id.finish_but3);
			mFinishBut3.setVisibility(View.INVISIBLE);
			mStreamCup2.setOnTouchListener(this);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.coffeemachine :
			setContentView(R.layout.watermachine);
			mWaterMachine1=(ImageView)findViewById(R.id.water_machine1);
			mWaterMachine2=(ImageView)findViewById(R.id.water_machine2);
			mWaterMachine3=(ImageView)findViewById(R.id.water_machine3);
			mWaterCup=(ImageView)findViewById(R.id.water_cup);
			mWaterMachineBut=(ImageView)findViewById(R.id.watermachine_but);
			mWaterMachine2.setVisibility(View.INVISIBLE);
			mWaterMachine3.setVisibility(View.INVISIBLE);
			mFinishBut4=(ImageView)findViewById(R.id.finish_but4);
			mFinishBut4.setVisibility(View.INVISIBLE);
			mWaterCup.setOnTouchListener(this);

			mShot=(TextView)findViewById(R.id.re_shot);
			mHotW=(TextView)findViewById(R.id.re_hotw);
			mMlik=(TextView)findViewById(R.id.re_mlik);
			mChoco=(TextView)findViewById(R.id.re_choco);
			mMlikB=(TextView)findViewById(R.id.re_mlikbubble);
			mVanilla=(TextView)findViewById(R.id.re_vanilla);
			mWhipping=(TextView)findViewById(R.id.re_whipping);
			mCinnamon=(TextView)findViewById(R.id.re_cinnamon);
			mCaramel=(TextView)findViewById(R.id.re_caramel);
			mReTwo=(ImageView)findViewById(R.id.re_two);
			mReThree=(ImageView)findViewById(R.id.re_three);
			mReFour=(ImageView)findViewById(R.id.re_four);
			mHotW.setVisibility(View.INVISIBLE);
			mMlik.setVisibility(View.INVISIBLE);
			mChoco.setVisibility(View.INVISIBLE);
			mMlikB.setVisibility(View.INVISIBLE);
			mVanilla.setVisibility(View.INVISIBLE);
			mWhipping.setVisibility(View.INVISIBLE);
			mCinnamon.setVisibility(View.INVISIBLE);
			mCaramel.setVisibility(View.INVISIBLE);
			mReTwo.setVisibility(View.INVISIBLE);
			mReThree.setVisibility(View.INVISIBLE);
			mReFour.setVisibility(View.INVISIBLE);
			mReOne=(ImageView)findViewById(R.id.re_one);
			mReTwo2=(ImageView)findViewById(R.id.re_two2);
			mReThree3=(ImageView)findViewById(R.id.re_three3);
			mReFour4=(ImageView)findViewById(R.id.re_four4);
			mReOne.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.INVISIBLE);
			mReFour4.setVisibility(View.INVISIBLE);


			intent = getIntent();
			choice = intent.getStringExtra("choice");

			intent=new Intent(MakeActivity.this, StartActivity.class);
			if(choice.equals("�Ƹ޸�ī��")){
				mHotW.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���")){
				mMlik.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī���ī")){
				mMlik.setVisibility(View.VISIBLE);
				mChoco.setVisibility(View.VISIBLE);
				mWhipping.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("īǪġ��")){
				mMlik.setVisibility(View.VISIBLE);
				mMlikB.setVisibility(View.VISIBLE);
				mCinnamon.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}else if(choice.equals("ī��Ḷ���ƶ�")){
				mMlik.setVisibility(View.VISIBLE);
				mVanilla.setVisibility(View.VISIBLE);
				mCaramel.setVisibility(View.VISIBLE);
				mReTwo.setVisibility(View.VISIBLE);
				mReThree.setVisibility(View.VISIBLE);
				mReFour.setVisibility(View.VISIBLE);
			}
			else{}
			break;
		case R.id.watermachine_but :
			mWaterMachine2.setVisibility(View.INVISIBLE);
			mWaterMachine3.setVisibility(View.VISIBLE);
			mFinishBut4.setVisibility(View.VISIBLE);
			break;
		case R.id.finish_but1 : //��
			setContentView(R.layout.make);
			mReOne.setVisibility(View.VISIBLE);
			break;
		case R.id.finish_but2 : //����
			setContentView(R.layout.make);
			mReThree.setVisibility(View.INVISIBLE);
			mReThree3.setVisibility(View.VISIBLE);
			break;
		case R.id.finish_but3 : //��������
			setContentView(R.layout.make);
			mReTwo.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.VISIBLE);
			if(choice.equals("īǪġ��")){
				mReThree.setVisibility(View.INVISIBLE);
				mReThree3.setVisibility(View.VISIBLE);
			}
			break;
		case R.id.finish_but4 : //�߰ſ
			setContentView(R.layout.make);
			mReTwo.setVisibility(View.INVISIBLE);
			mReTwo2.setVisibility(View.VISIBLE);
			break;
		case R.id.bean :
			mTableBean1.setVisibility(View.VISIBLE);
			break;
		case R.id.table_bean1 :
			mTableBean1.setVisibility(View.INVISIBLE);
			mTableBean2.setVisibility(View.VISIBLE);
			mA.setVisibility(View.VISIBLE);
			mB.setVisibility(View.VISIBLE);
			break;
		case R.id.chocosyrup :
			mTableChocosy.setVisibility(View.VISIBLE);
			mTableChocosy.setBackgroundResource(R.drawable.chocosy);
			chocosyAnim=(AnimationDrawable)mTableChocosy.getBackground();
			chocosyAnim.start();
			break;
		case R.id.valillasyrup :
			mTableValillasy.setVisibility(View.VISIBLE);
			mTableValillasy.setBackgroundResource(R.drawable.valillasy);
			valillasyAnim=(AnimationDrawable)mTableValillasy.getBackground();
			valillasyAnim.start();
			break;
		case R.id.chocodrizzle :
			mTableChocodriz.setVisibility(View.VISIBLE);
			mTableChocodriz.setBackgroundResource(R.drawable.chocodriz);
			chocodrizAnim=(AnimationDrawable)mTableChocodriz.getBackground();
			chocodrizAnim.start();
			break;
		case R.id.carameldrizzle :
			mTableCarameldriz.setVisibility(View.VISIBLE);
			mTableCarameldriz.setBackgroundResource(R.drawable.carameldriz);
			carameldrizAnim=(AnimationDrawable)mTableCarameldriz.getBackground();
			carameldrizAnim.start();
			break;
		case R.id.cinnamonpowder :
			mTableCinnamonpow.setVisibility(View.VISIBLE);
			mTableCinnamonpow.setBackgroundResource(R.drawable.cinnamonpow);
			cinnamonpowAnim=(AnimationDrawable)mTableCinnamonpow.getBackground();
			cinnamonpowAnim.start();
			break;
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if(v==mHandler){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mHandler.setVisibility(View.INVISIBLE);
				mGrinder1.setVisibility(View.INVISIBLE);
				mGrinder2.setVisibility(View.VISIBLE);
			}
		}
		if(v==mGrinder2 || v==mGrinder4 || v==mGrinder6 || v==mGrinder8){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				switch (i) {
				case 2 : case 3 : case 4 :
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.VISIBLE);
					break;
				case 5 :  case 6 : case 7 :
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.VISIBLE);
					break;
				case 8 :  case 9 : case 10 :
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					mGrinder6.setVisibility(View.INVISIBLE);
					mGrinder7.setVisibility(View.VISIBLE);
					mGrinder8.setVisibility(View.INVISIBLE);
					break;
				}	
			}
			else if(event.getAction()==MotionEvent.ACTION_UP){
				switch (i) {
				case 2 :  case 3 : case 4 :
					mGrinder2.setVisibility(View.VISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					break;
				case 5 :  case 6 : case 7 :
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.VISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					break;
				case 8 :  case 9 : case 10 :
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					mGrinder6.setVisibility(View.VISIBLE);
					mGrinder7.setVisibility(View.INVISIBLE);
					break;
				case 11 : case 12 : 
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder3.setVisibility(View.INVISIBLE);
					mGrinder4.setVisibility(View.INVISIBLE);
					mGrinder5.setVisibility(View.INVISIBLE);
					mGrinder6.setVisibility(View.INVISIBLE);
					mGrinder7.setVisibility(View.INVISIBLE);
					mGrinder8.setVisibility(View.VISIBLE);
				case 13 : 
					mNextBut.setVisibility(View.VISIBLE);
					break;
				}
				i++;
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
		if(ok3!=2 && v==mWhippingMachine){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mWhippingMachine.setVisibility(View.INVISIBLE);
				mWhippingMachine2.setVisibility(View.VISIBLE);
				mWhipping1.setVisibility(View.VISIBLE);
				ok2=1;
			}
		}
		if(ok2==1 && v==mMWhippingC){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mMWhippingC.setVisibility(View.INVISIBLE);
				mWhipping2.setVisibility(View.VISIBLE);
			}
		}
		if(v==mWhipping2){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				mWhipping2.setVisibility(View.INVISIBLE);
				mWhippingView.setBackgroundResource(R.drawable.whipping);
				frameAnim=(AnimationDrawable)mWhippingView.getBackground();
				frameAnim.start();
				mAnimHandler.sendEmptyMessageDelayed(0, 1200);
			}
		}
		if(ok3==1 && v==mWhippingMachine2){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mWhipping1.setVisibility(View.INVISIBLE);
				mWhippingMachine2.setVisibility(View.INVISIBLE);
				mWhippingMachine.setVisibility(View.VISIBLE);
				ok3=2;
			}
		}
		if(ok3==2 && v==mWhippingMachine){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				mWhippingMachine.setVisibility(View.INVISIBLE);
				mWhippingMachine2.setVisibility(View.INVISIBLE);
				mShakeWhipping1.setVisibility(View.VISIBLE);
			}
		}
		if(v==mShakeWhipping2){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				mShakeWhipping1.setVisibility(View.VISIBLE);
				mShakeWhipping2.setVisibility(View.INVISIBLE);
			}
		}
		if(v==mShakeWhipping1){
			if(event.getAction()==MotionEvent.ACTION_UP){
				mShakeWhipping1.setVisibility(View.INVISIBLE);
				mShakeWhipping2.setVisibility(View.VISIBLE);
				j++;
			}
			if(j>=10){
				mNextBut2.setVisibility(View.VISIBLE);
			}
		}
		if(v==mPushWhipping1){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				mPushWhipping1.setVisibility(View.INVISIBLE);
				mPushWhipping2.setVisibility(View.VISIBLE);
				mFinishBut2.setVisibility(View.VISIBLE);
			}
		}
		if(v==mOpenMilk){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mOpenMilk.setVisibility(View.INVISIBLE);
				mStreamCup.setVisibility(View.INVISIBLE);
				mMilkCup1.setVisibility(View.VISIBLE);
				mMilkCup2.setVisibility(View.VISIBLE);
			}
		}
		if(v==mMilkCup2){
			if(event.getAction()==MotionEvent.ACTION_DOWN){
				mMilkCup1.setVisibility(View.INVISIBLE);
				mMilkCup2.setVisibility(View.INVISIBLE);
				mMilkView.setBackgroundResource(R.drawable.milkanim);
				milkAnim=(AnimationDrawable)mMilkView.getBackground();
				milkAnim.start();
				mAnimHandler2.sendEmptyMessageDelayed(0, 1600);
			}
		}
		if(v==mStreamCup2){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mStreamCup2.setVisibility(View.INVISIBLE);
				mMilkMachine1.setVisibility(View.INVISIBLE);
				mMilkMachine2.setVisibility(View.VISIBLE);
				mFinishBut3.setVisibility(View.VISIBLE);
			}
		}
		if(v==mWaterCup){
			if(event.getAction()==MotionEvent.ACTION_MOVE){
				mWaterCup.setVisibility(View.INVISIBLE);
				mWaterMachine1.setVisibility(View.INVISIBLE);
				mWaterMachine2.setVisibility(View.VISIBLE);
			}
		}
		return true;
	}
	Handler mAnimHandler=new Handler(){
		public void handleMessage(Message msg){
			frameAnim.stop();
			mWhippingView.setVisibility(View.INVISIBLE);
			mWhipping1.setVisibility(View.VISIBLE);
			ok3=1;
		}
	};
	Handler mAnimHandler2=new Handler(){
		public void handleMessage(Message msg){
			milkAnim.stop();
			mMilkView.setVisibility(View.INVISIBLE);
			mStreamCup.setVisibility(View.VISIBLE);
			mNextBut3.setVisibility(View.VISIBLE);
		}
	};
}