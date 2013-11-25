package kr.hs.emirim.seeone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	Intent intent;
	MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
		
		mp=MediaPlayer.create(this, R.drawable.bgm_cafe);
		mp.setLooping(true);
		mp.start();
	}
	
	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.coffee_start :
			intent=new Intent(MainActivity.this, StartActivity.class);
			startActivity(intent);
			break;
		case R.id.coffee_help :
			intent=new Intent(MainActivity.this, HelpActivity.class);
			startActivity(intent);
			break;
		case R.id.coffee_set : 
			intent=new Intent(MainActivity.this, SetActivity.class);
			startActivity(intent);
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
}