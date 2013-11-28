package kr.hs.emirim.seeone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class InfoActivity extends Activity{
	ImageView finishView;
	ImageView finishView2;
	ImageView coffeeView;
	ImageView coffeeBut;
	String es;
	String am;
	String lat;
	String cap;
	String moc;
	String cara;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
				WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
		setContentView(R.layout.info);

		finishView=(ImageView)findViewById(R.id.info);
		finishView2=(ImageView)findViewById(R.id.info2);
		coffeeView=(ImageView)findViewById(R.id.coffee_view1);
		coffeeBut=(ImageView)findViewById(R.id.coffee_but);
		finishView2.setVisibility(View.INVISIBLE);

		es=getIntent().getExtras().getString("에스프레소");
		am=getIntent().getExtras().getString("아메리카노");
		lat=getIntent().getExtras().getString("카페라떼");
		cap=getIntent().getExtras().getString("카푸치노");
		moc=getIntent().getExtras().getString("카페모카");
		cara=getIntent().getExtras().getString("카라멜마끼아또");

		coffeeView.setBackgroundResource(R.drawable.img_espresso);
		coffeeView.getBackground();
	}
	public void mOnClick(View v){
		if(v.getId()==R.id.coffee_but){
			coffeeView.setVisibility(View.INVISIBLE);
			finishView.setVisibility(View.INVISIBLE);
			finishView2.setVisibility(View.VISIBLE);
			coffeeBut.setVisibility(View.INVISIBLE);
		}
	}
}
