package kr.hs.emirim.seeone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SetActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win=getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.set);
	}
}
