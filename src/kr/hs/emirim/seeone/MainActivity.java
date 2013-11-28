package kr.hs.emirim.seeone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends Activity {
	Intent intent;
	MediaPlayer mp;
	ImageView mMainAnimView;
	ImageView mMainAnimView2;
	ImageView mMainAnimView3;
	AnimationDrawable mainAnim;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
		
		mMainAnimView=(ImageView)findViewById(R.id.main_anim);
		mMainAnimView2=(ImageView)findViewById(R.id.main_anim2);
		mMainAnimView3=(ImageView)findViewById(R.id.main_anim3);
		mp=MediaPlayer.create(this, R.drawable.bgm_cafe);
		mp.setLooping(true);
		mp.start();
	}
	
	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.coffee_start :
			mMainAnimView.setBackgroundResource(R.drawable.mainanim);
			mainAnim=(AnimationDrawable)mMainAnimView.getBackground();
			mainAnim.start();
			mAnimHandler.sendEmptyMessageDelayed(0, 430);
			break;
		case R.id.coffee_set :
			mMainAnimView2.setBackgroundResource(R.drawable.mainanim);
			mainAnim=(AnimationDrawable)mMainAnimView2.getBackground();
			mainAnim.start();
			mAnimHandler2.sendEmptyMessageDelayed(0, 430);
			break;
		case R.id.coffee_help : 
			mMainAnimView3.setBackgroundResource(R.drawable.mainanim);
			mainAnim=(AnimationDrawable)mMainAnimView3.getBackground();
			mainAnim.start();
			mAnimHandler3.sendEmptyMessageDelayed(0, 430);
			break;
		}
	}
	public boolean onKeyDown(int keyCode, KeyEvent event){
		switch(keyCode){
			case KeyEvent.KEYCODE_BACK : new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert). setTitle("Cafe Meister").
		   			setMessage("카페를 나가시겠습니까?").
		   			setPositiveButton("나가기", new DialogInterface.OnClickListener() {
				    @Override
				    public void onClick(DialogInterface dialog, int which) {
				    	moveTaskToBack(true);  
				    	mp.stop();
				    	finish();  
				    }
		   			}).setNegativeButton("머무르기", null).show();
		} 
		return true;
	}
	Handler mAnimHandler=new Handler(){
		public void handleMessage(Message msg){
			mainAnim.stop();
			mMainAnimView.setVisibility(View.INVISIBLE);
			intent=new Intent(MainActivity.this, StartActivity.class);
			startActivity(intent);
		}
	};
	Handler mAnimHandler2=new Handler(){
		public void handleMessage(Message msg){
			mainAnim.stop();
			mMainAnimView2.setVisibility(View.INVISIBLE);
			intent=new Intent(MainActivity.this, SetActivity.class);
			startActivity(intent);
		}
	};
	Handler mAnimHandler3=new Handler(){
		public void handleMessage(Message msg){
			mainAnim.stop();
			mMainAnimView3.setVisibility(View.INVISIBLE);
			intent=new Intent(MainActivity.this, HelpActivity.class);
			startActivity(intent);
		}
	};
}