package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IntroActivity extends Activity{
	int value=0;
	AnimationDrawable frameAnimation;
	ImageView view;
	ImageView view2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.intro);

		view=(ImageView)findViewById(R.id.imageAnimation);
		view.setBackgroundResource(R.drawable.introimg);
		frameAnimation = (AnimationDrawable) view.getBackground();

		frameAnimation.start();
		mHandler.sendEmptyMessageDelayed(0, 1700);
	}

	Handler mHandler=new Handler(){
		public void handleMessage(Message msg){
			Intent intent=new Intent(IntroActivity.this, MainActivity.class);
			startActivity(intent);
			finish();
		}
	};
}