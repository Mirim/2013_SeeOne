package kr.hs.emirim.seeone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class InfoActivity extends Activity{
	ImageView infoEspresso;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND,
						WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
		setContentView(R.layout.info);
		infoEspresso=(ImageView)findViewById(R.id.info_espresso);
	}
}
