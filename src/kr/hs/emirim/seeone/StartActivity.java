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
	Intent intent;
	int choice;
	
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
			choice=Coffee.ESPRESSO;
			break;
		case R.id.americano :
			setContentView(R.layout.americano);
			choice = Coffee.AMERICANO;
			break;
		case R.id.caffelatte : 
			setContentView(R.layout.caffelatte);
			choice = Coffee.CAFFELATTE;
			break;
		case R.id.cappuccino : 
			setContentView(R.layout.cappuccino);
			choice = Coffee.CAPPUCCINO;
			break;
		case R.id.caffemocha : 
			setContentView(R.layout.caffemocha);
			choice = Coffee.CAFFEMOCHA;
			break;
		case R.id.caramelmacchiato :
			setContentView(R.layout.caramelmacchiato);
			choice = Coffee.CARAMELMACHIATTO;
			break;
		case R.id.but_reorder :
			setContentView(R.layout.start);
			break;
		case R.id.but_start :
			intent = new Intent(StartActivity.this, MakeActivity.class);
			intent.putExtra("choice", choice);
			startActivity(intent);
			finish();
			break;
		}
	}
}