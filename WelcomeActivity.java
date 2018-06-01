package com.uafcgpa;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Context;
import android.os.Vibrator;
import java.util.Timer;
import java.util.TimerTask;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private String pkg = "";
	private HashMap<String, Object> map = new HashMap<>();
	private String clicks = "";
	private double no_of_clicks = 0;
	private String string = "";
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private TextView sp;
	private ImageView imageview1;
	private LinearLayout linear2;
	private TextView textview2;
	private LinearLayout linear4;
	private Button submit_subjects;
	
	private SharedPreferences file;
	private Intent i = new Intent();
	private AlertDialog.Builder dilog2;
	private SharedPreferences share;
	private Intent i4 = new Intent();
	private AlertDialog.Builder exit;
	private Vibrator vib;
	private SharedPreferences vibration;
	private SharedPreferences back;
	private TimerTask t;
	private AlertDialog.Builder dialog;
	private ObjectAnimator blink = new ObjectAnimator();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.welcome);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		sp = (TextView) findViewById(R.id.sp);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		submit_subjects = (Button) findViewById(R.id.submit_subjects);
		file = getSharedPreferences("store", Activity.MODE_PRIVATE);
		dilog2 = new AlertDialog.Builder(this);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
		exit = new AlertDialog.Builder(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		vibration = getSharedPreferences("value", Activity.MODE_PRIVATE);
		back = getSharedPreferences("stop", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				dialog.setTitle("Subjects");
				dialog.setMessage("Enter number of subjects");
				final EditText input = new EditText(WelcomeActivity.this); LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL,  LinearLayout.LayoutParams.WRAP_CONTENT); input.setLayoutParams(lpar); 
				dialog.setView(input); 
				dialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						String string=input.getText()+"";
						if (string.equals("4") || (string.equals("5") || (string.equals("6") || (string.equals("3") || (string.equals("2") || string.equals("1")))))) {
							textview2.setTextColor(0xFF4CAF50);
							textview2.setAlpha((float)(Double.parseDouble(".8")));
							textview2.setText(string);
							blink.setTarget(submit_subjects);
							blink.setPropertyName("alpha");
							blink.setFloatValues((float)(0), (float)(1));
							blink.setRepeatMode(ValueAnimator.REVERSE);
							blink.setDuration((int)(1000));
							blink.setRepeatCount((int)(500));
							blink.start();
						}
						else {
							textview2.setTextColor(0xFFF44336);
							dilog2.setTitle("Not Supported");
							dilog2.setMessage("Currently supported subjects 1~6");
							dilog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							dilog2.create().show();
						}
					}
				});
				dialog.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
			}
		});
		
		submit_subjects.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				file.edit().putString("subject", textview2.getText().toString()).commit();
				share.edit().putString("subject", textview2.getText().toString()).commit();
				if (textview2.getText().toString().equals("4") || (textview2.getText().toString().equals("5") || (textview2.getText().toString().equals("6") || (textview2.getText().toString().equals("3") || (textview2.getText().toString().equals("2") || textview2.getText().toString().equals("1")))))) {
					i.setClass(getApplicationContext(), Main2Activity.class);
					startActivity(i);
				}
				else {
					dilog2.setTitle("Not Supported");
					dilog2.setMessage("Currently supported subjects 4~6");
					dilog2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					dilog2.create().show();
				}
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
				}
				submit_subjects.setAlpha((float)(Double.parseDouble(".2")));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								submit_subjects.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(t, (int)(150));
			}
		});
	}
	private void initializeLogic() {
		if (share.getString("close", "").equals("1")) {
			finish();
		}
		if (share.getString("close", "").equals("3")) {
			finish();
		}
		_mode();
		share.edit().putString("pop", "2").commit();
		textview2.setAlpha((float)(Double.parseDouble(".5")));
		_toolbar.setTitle("Welcomee");
		_toolbar.setSubtitle("Select Subjects");
		 }
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		
		
		menu.add("Share App").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		
		
		menu.add("About us").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		
		menu.add("Settings").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		menu.add("Help").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		return true;
	}
	
	@Override 
	public boolean onOptionsItemSelected(final MenuItem item) {
		switch (item.getTitle().toString()) {
			case "Share App":
			showMessage("Sharing App");
			
			
			pkg="com.uafcgpa";
			 String apk = "";
			String uri = (pkg);
			try {
				android.content.pm.PackageInfo pi = getPackageManager().getPackageInfo(uri, android.content.pm.PackageManager.GET_ACTIVITIES);
				apk = pi.applicationInfo.publicSourceDir;
			} catch (Exception e) { showMessage(e.toString());}
			Intent iten = new Intent(Intent.ACTION_SEND);
			iten.setType("*/*");
			iten.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new java.io.File(apk)));
			startActivity(Intent.createChooser(iten, "Share App")); 
			return true;
			case "Settings":
			showMessage("Settings");
			i4.setClass(getApplicationContext(),SettingsActivity.class);
			startActivity (i4);
			
			return true;
			case "Help":
			showMessage("Help");
			i.setClass(getApplicationContext(),HelpActivity.class);
			startActivity (i);
			return true;
			case "About us":
			showMessage("UAF Developers");
			i.setClass(getApplicationContext(),AboutActivity.class);
			startActivity (i);
			return true;
			default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	@Override
	public void onBackPressed() {
		i4.setClass(getApplicationContext(), MainActivity.class);
		startActivity(i4);
		finish();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
	}
	
	@Override
	public void onResume() {
		super.onResume();
		_mode();
	}
	private void _mode () {
		if (share.getString("mode", "").equals("1")) {
			linear1.setBackgroundColor(0xFF000000);
			textview2.setTextColor(0xFF000000);
			_iRound_corner_("#FFFFFF", 60, textview2);
		}
		else {
			if (share.getString("mode", "").equals("0")) {
				linear1.setBackgroundColor(0xFFFFFFFF);
				textview2.setTextColor(0xFFFFFFFF);
				_iRound_corner_("#000000", 60, textview2);
			}
		}
	}
	
	
	private void _iRound_corner_ (final String _color, final double _numb, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_numb);
		_view.setBackground(gd);
		
		// _color your color string
		// _numb Radious Number
		// _view to view
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
