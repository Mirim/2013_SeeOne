package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MakeActivity extends Activity implements OnTouchListener{
	ImageButton mSideboard;
	ImageButton mOpenSideboard;
	ImageView mGrinder1;
	ImageView mGrinder2;
	Button mA;
	Button mB;
	Rect mRect;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.make);
		
		mSideboard=(ImageButton)findViewById(R.id.sideboard);
		mOpenSideboard=(ImageButton)findViewById(R.id.opensideboard);
		mOpenSideboard.setVisibility(View.INVISIBLE);
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
				mGrinder1=(ImageView)findViewById(R.id.grinder_1);
				mGrinder2=(ImageView)findViewById(R.id.grinder_2);
				mGrinder2.setVisibility(View.INVISIBLE);
				mRect=new Rect(10, 10, 10, 10);
				break;
			case R.id.bBean :
				setContentView(R.layout.grinder);
				mRect=new Rect(10, 10, 10, 10);
				break;
		}
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(event.equals(mRect.contains(65, 40))==true){
			for(int i=2; i<8; i++){
				if(i%2==0){
					mGrinder1.setVisibility(View.INVISIBLE);
					mGrinder2.setVisibility(View.VISIBLE);
				}
				else{
					mGrinder2.setVisibility(View.INVISIBLE);
					mGrinder1.setVisibility(View.VISIBLE);
				}
			}
			Toast.makeText(this, "ÅÍÄ¡", 1000);
		}
		return true;
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}
}