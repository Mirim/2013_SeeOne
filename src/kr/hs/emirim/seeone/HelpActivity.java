package kr.hs.emirim.seeone;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HelpActivity extends Activity implements OnClickListener, OnTouchListener{

	ViewFlipper viewFlip;
	float downX, upX;
	Button gamestart;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.help);
		viewFlip=(ViewFlipper)findViewById(R.id.view_flip);
		viewFlip.setOnTouchListener(this);
		gamestart=(Button)findViewById(R.id.gamestart);
		gamestart.setOnClickListener(this);
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if(v!=viewFlip){
			return false;
		}
		if(event.getAction()==MotionEvent.ACTION_DOWN){
			downX=event.getX();
		}else if(event.getAction()==MotionEvent.ACTION_UP){
			upX=event.getX();
			if(downX>upX){
				viewFlip.setInAnimation(this, R.anim.left_in);
				viewFlip.setOutAnimation(this, R.anim.left_out);
				viewFlip.showNext();	
			}else if(downX< upX){
				viewFlip.setInAnimation(this, R.anim.right_in);
				viewFlip.setOutAnimation(this, R.anim.right_out);
				viewFlip.showPrevious();
			}
		}
		return true;
	}
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.gamestart){
			 intent=new Intent(this,StartActivity.class);
			startActivity(intent);
			finish();
		}
		
	}
}

