package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class InfoActivity extends Activity{
	ImageView finishView;
	ImageView coffeeView;
	String s;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
						WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
		setContentView(R.layout.info);
		
		finishView=(ImageView)findViewById(R.id.info);
		coffeeView=(ImageView)findViewById(R.id.coffee_view1);
		
		s=getIntent().getExtras().getString("에스프레소");
		
		if(s=="에스프레소"){
			coffeeView.setVisibility(View.VISIBLE);
		}
	}
}
