package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class StartActivity extends Activity{
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.start);
	}
	
	public void mOnClick(View v) {
		switch (v.getId()) {
		case R.id.espresso :
			setContentView(R.layout.espresso);
			break;
		case R.id.americano :
			break;
		case R.id.caffelatte : 
			break;
		case R.id.cappuccino : 
			break;
		case R.id.caffemocha : 
			break;
		case R.id.caramelmacchiato :
			break;
		}
	}
}
