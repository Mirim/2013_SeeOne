package kr.hs.emirim.seeone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
	}
	
	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.coffee_start :
			intent=new Intent(MainActivity.this, StartActivity.class);
			startActivity(intent);
			finish();
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
}