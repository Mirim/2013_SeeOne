package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class SetActivity extends Activity{
	ImageView mOnBut1;
	ImageView mOnBut2;
	ImageView mOnBut3;
	ImageView mOffBut1;
	ImageView mOffBut2;
	ImageView mOffBut3;
	Context context;
	AudioManager aManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.set);
		context=this;
		aManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
		
		mOnBut1=(ImageView)findViewById(R.id.setOn);
		mOnBut2=(ImageView)findViewById(R.id.setOn2);
		mOnBut3=(ImageView)findViewById(R.id.setOn3);
		mOffBut1=(ImageView)findViewById(R.id.setOff);
		mOffBut2=(ImageView)findViewById(R.id.setOff2);
		mOffBut3=(ImageView)findViewById(R.id.setOff3);
		mOffBut1.setVisibility(View.INVISIBLE);
		mOffBut2.setVisibility(View.INVISIBLE);
		mOffBut3.setVisibility(View.INVISIBLE);
	}
	public void mOnClick(View v){
		switch (v.getId()) {
		case R.id.setOn :
			mOnBut1.setVisibility(View.INVISIBLE);
			mOffBut1.setVisibility(View.VISIBLE);
			aManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
			break;
		case R.id.setOn2 :
			mOnBut2.setVisibility(View.INVISIBLE);
			mOffBut2.setVisibility(View.VISIBLE);
			//효과음 꺼져야함
			break;
		case R.id.setOn3 :
			mOnBut3.setVisibility(View.INVISIBLE);
			mOffBut3.setVisibility(View.VISIBLE);
			//진동 꺼져야함
			break;
		case R.id.setOff :
			mOffBut1.setVisibility(View.INVISIBLE);
			mOnBut1.setVisibility(View.VISIBLE);
			aManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
			//배경음악 켜져야함
			break;
		case R.id.setOff2 :
			mOffBut2.setVisibility(View.INVISIBLE);
			mOnBut2.setVisibility(View.VISIBLE);
			//효과음 켜져야함
			break;
		case R.id.setOff3 :
			mOffBut3.setVisibility(View.INVISIBLE);
			mOnBut3.setVisibility(View.VISIBLE);
			break;
			//진동 켜져야함
		}
	}
}
