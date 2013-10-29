package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class IntroActivity extends Activity{
	ImageView introImage;
	int value=0;
	Animation introAnim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.intro);
		
		introImage=(ImageView) findViewById(R.id.intro_view);
		introAnim=AnimationUtils.loadAnimation(IntroActivity.this, R.anim.intro);
		introImage.startAnimation(introAnim);
		
		mHandler.sendEmptyMessageDelayed(0, 2000);
	}
	
	Handler mHandler=new Handler(){
		public void handleMessage(Message msg){
			Intent intent=new Intent(IntroActivity.this, MainActivity.class);
			startActivity(intent);
			finish();
		}
	};
}
