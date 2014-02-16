package net.buildbox.pokeri.app_fragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	// ログ出力用タグ
	private static final String TAG = "MainActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "call onCreate().");
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "call onRestart().");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "call onStart().");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "call onResume().");
	}
	
	@Override
	protected void onPause() {
		Log.d(TAG, "call onPause().");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		Log.d(TAG, "call onStop().");
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		Log.d(TAG, "call onDestroy().");
		super.onDestroy();
	}

}