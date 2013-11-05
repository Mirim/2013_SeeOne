package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends Activity{
	
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
			setContentView(R.layout.americano);
			break;
		case R.id.caffelatte : 
			setContentView(R.layout.caffelatte);
			break;
		case R.id.cappuccino : 
			setContentView(R.layout.cappuccino);
			break;
		case R.id.caffemocha : 
			setContentView(R.layout.caffemocha);
			break;
		case R.id.caramelmacchiato :
			setContentView(R.layout.caramelmacchiato);
			break;
		case R.id.but_reorder :
			setContentView(R.layout.start);
			break;
		case R.id.but_start :
			Intent intent = new Intent(StartActivity.this, MakeActivity.class);
			startActivity(intent);
			finish();
			break;
		}
	}
}